package by.htp.edition.service;

import by.htp.edition.bean.Edition;

public interface EditionService {

		public void printEditions() throws ServiceException ;
		public void addEdition(Edition newEdition) throws ServiceException;
		
	}

