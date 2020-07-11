package org.nuc.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//���ݿ�ͨ�õİ�����

public class DBUtil {
		
	public static Connection connection = null;
	public static PreparedStatement pstmt = null;
	public static ResultSet rs = null;
	
	
	/**
	 * ��ȡ���Ӷ���
	 * @return Connection
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection connect = ConnectPoolFactory.getInstance().getConnect();
		return connect;

	}
	
	/**
	 * ��ȡPreparedStatementֵ
	 * @param sql
	 * @param params
	 * @return PreparedStatement
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public static PreparedStatement createPreparedStatement(String sql,Object[] params) throws SQLException, ClassNotFoundException{
		connection=getConnection();			
		pstmt = connection.prepareStatement(sql);
		if(params!=null) {
			for(int i=0;i<params.length;i++) {
				pstmt.setObject(i+1, params[i]);
			}
		}
		return pstmt;
	}
	

	/**
	 * ͨ�õ���ɾ��
	 * @param sql      SQL���
	 * @param params   Object���飬���ڴ��SQL����еģ�ֵ
	 * @return         boolean
	 */
	public static boolean executeUpdate(String sql,Object[] params) {
		
		try {
			pstmt = createPreparedStatement(sql,params);
		    int count = pstmt.executeUpdate();
		    System.out.println(count);
		    if(count>0) {
		    	return true;
		    }else {
		    	return false;
		    }
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			return false;
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}finally {		
			closeAll(null,pstmt,connection);
		}		
	}

	
	/**
	 * ͨ�õĲ�(��Ҫ�Լ�������)
	 * @param sql      SQL���
	 * @param params   Object���飬���ڴ��SQL����еģ�ֵ
	 * @return         boolean
	 */
	public static ResultSet executequery(String sql,Object[] params) {
		try {
			pstmt = createPreparedStatement(sql,params);
			rs=pstmt.executeQuery();
			return rs;
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return null;
		}		
	}
	

	/**
	 * �رշ���
	 * @param rs
	 * @param stmt
	 * @param connection
	 */
	public static void closeAll(ResultSet rs,Statement stmt,Connection connection) {
		try {
			if(rs!=null) rs.close();
			if(stmt!=null) stmt.close();
			if(connection!=null) connection.close();
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	
}
