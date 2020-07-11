package org.nuc.dao;

import java.util.List;

import org.nuc.entity.Employee;

public interface IEmployeeDao {
	/**
	 * ��ѯ���е�Ա��
	 * @return List<Employee>
	 */
	public List<Employee> queryAllEmployee();
	
	/**
	 * ͨ���û�ID����Ա��
	 * @param id
	 * @return Employee
	 */
	public Employee queryEmployeeByID(int id);
	
	/**
	 * ����Ա��
	 * @param Employee
	 * @return boolean
	 */
	public boolean addEmployee(Employee employee);
	

	/**
	 * ͨ��ID��ɾ��Ա��
	 * @param id
	 * @return boolean
	 */
	public boolean deleteEmployeeByID(int id);
	/**
	 * ͨ��ID�Ž����޸�Ա����Ϣ
	 * @param id
	 * @param employee
	 * @return boolean
	 */
	public boolean UpdateEmployeerByID(int id,Employee employee);
}
