package by.htp.edition.service.impl;

import by.htp.edition.bean.Edition;
import by.htp.edition.dao.EditionDao;
import by.htp.edition.dao.EditionDaoException;
import by.htp.edition.dao.impl.EditionDaoImpl;
import by.htp.edition.service.EditionService;
import by.htp.edition.service.ServiceException;

public class EditionServiceImpl implements EditionService{
	
	private static String path = "resources/data.txt";
	

	@Override
	public void printEditions() throws ServiceException {
        EditionDao pr = new EditionDaoImpl();
		Edition[] editions;
		try {
			editions = pr.readInfo(path);
			for (int i = 0; i < editions.length; i++){
				System.out.println(editions[i]);
			}	
		} catch (EditionDaoException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addEdition(Edition newEdition) throws ServiceException {
		EditionDao pr = new EditionDaoImpl();
		try {
			pr.createInfo(path, newEdition);
			printEditions();
		} catch (EditionDaoException e) {
			e.printStackTrace();
		} 
	}
}
