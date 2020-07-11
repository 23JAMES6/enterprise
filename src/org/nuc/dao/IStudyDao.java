package org.nuc.dao;

import java.util.List;

import org.nuc.entity.Study;

public interface IStudyDao {
	/**
	 * ��ѯ���е���ѵ��Ϣ
	 * @return List<Work>
	 */
	public List<Study> queryAllStudy();
	
	/**
	 * ͨ���û�ID����Ա����ѵ��Ϣ
	 * @param id
	 * @return Study
	 */
	public Study queryStudyByID(int id);
	
	/**
	 * ������ѵ
	 * @param Study
	 * @return boolean
	 */
	public boolean addStudy(Study study);
}
