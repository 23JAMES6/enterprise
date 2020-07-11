package org.nuc.dao;

import java.util.List;

import org.nuc.entity.Work;

public interface IWorkDao {
	/**
	 * ��ѯ���еĳ�����Ϣ
	 * @return List<Work>
	 */
	public List<Work> queryAllWork();
	
	/**
	 * ͨ���û�ID����Ա��������Ϣ
	 * @param id
	 * @return Work
	 */
	public Work queryWorkByID(int id);
	
	/**
	 * ͨ��ID�Ž����޸�Ա��������Ϣ
	 * @param id
	 * @return boolean
	 */
	public boolean UpdateattendanceByID(int id,float attendance,int salary);
	
	/**
	 * ͨ��ID�Ž����޸�Ա���Ӱ���Ϣ
	 * @param id
	 * @return boolean
	 */
	public boolean UpdateOvertimeByID(int id,int overtime,int salary);
}
