package by.htp.edition.dao;

import by.htp.edition.bean.Edition;

public interface EditionDao {
	
    public Edition[] readInfo(String path) throws EditionDaoException;
	public void writeInfo(String path, Edition newEdition) throws EditionDaoException;
	public void createInfo(String path, Edition newEdition) throws EditionDaoException;
		
}
