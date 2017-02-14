package by.htp.edition;

import by.htp.edition.bean.Book;
import by.htp.edition.service.EditionService;
import by.htp.edition.service.ServiceException;
import by.htp.edition.service.impl.EditionServiceImpl;

public class Main {

	public static void main(String[] args) {
		EditionService editionService = new EditionServiceImpl();
		try {
			editionService.printEditions();
			editionService.addEdition(new Book("Winny Pooh", 238, 2015, " ", 400));
		} 
		catch (ServiceException e){
			System.out.println(e.getMessage());
			}
	   }

}