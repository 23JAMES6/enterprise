package org.nuc.dao;

import org.nuc.entity.Agreement;

public interface IAgreementDao {
	/**
	 * ͨ���û�ID���Һ�ͬ
	 * @param id
	 * @return Agreement
	 */
	public Agreement queryAgreementByID(int id);
}
