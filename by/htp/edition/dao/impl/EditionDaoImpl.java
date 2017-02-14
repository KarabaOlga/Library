package by.htp.edition.dao.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import by.htp.edition.bean.Book;
import by.htp.edition.bean.Edition;
import by.htp.edition.bean.Magazine;
import by.htp.edition.bean.Newspaper;
import by.htp.edition.dao.EditionDao;
import by.htp.edition.dao.EditionDaoException;

public class EditionDaoImpl implements EditionDao{

	public EditionDaoImpl(){
	}

	@Override
	public Edition[] readInfo(String path) throws EditionDaoException {
		Edition[] arrayEdition = null;
		BufferedReader br = null;
		String line;
		int size = 30;
		try {
			arrayEdition = new Edition[size];
            br = new BufferedReader(new FileReader(new File(path)));
            int i = 0;
            while ((line = br.readLine()) != null) {
            	String[] lines = line.split(",");
            	String type = lines[0];
            	switch (type) {
    			case "book": arrayEdition[i] = new Book(lines[1].trim(), 
    						                   Integer.parseInt(lines[2].trim()), 
    						                   Integer.parseInt(lines[3].trim()), 
    						                   lines[4].trim(),
    						                   Integer.parseInt(lines[5].trim()));
    			break;
    				
    			case "magazine":arrayEdition[i] = new Magazine(lines[1].trim(),
    						              Integer.parseInt(lines[2].trim()),
    						              Integer.parseInt(lines[3].trim()),
    						              lines[4].trim(),
    						              lines[5].trim()
    						              );
    			break;
    			default:	
    			case "newspaper":arrayEdition[i] = new Newspaper(lines[1].trim(), 
    						                        Integer.parseInt(lines[2].trim()), 
    						                        Integer.parseInt(lines[3].trim()), 
    						                        lines[4].trim(),
    						                        Integer.parseInt(lines[5].trim()));
    			break;
    				}
            i = i + 1;	
            }
		} catch (FileNotFoundException e) {
			throw new EditionDaoException();
		} catch (IOException e) {
			throw new EditionDaoException();
		} finally {
			if (br != null) {
			try {
				br.close();
			} catch (IOException e) {
				throw new EditionDaoException("Problem with file ", e);
			}
			}
		}
		return arrayEdition;
	}
	
	@Override
	public void writeInfo(String path, Edition newEdition) throws EditionDaoException {

		PrintWriter out = null;

		try{
			out = new PrintWriter(new File(path));
			out.print(newEdition.toString());
		} catch (FileNotFoundException e) {
			throw new EditionDaoException();
		} finally {
			out.close();
		}
	}
	
	@Override
	public void createInfo(String path, Edition newEdition) throws EditionDaoException {
        FileWriter fr = null;
        try {
            fr = new FileWriter(new File(path),true);
            fr.write("\n" + newEdition.toString());
        } catch (IOException e) {
			throw new EditionDaoException("Problem with file ", e);
		}
        finally{
            try {
                fr.close();
            } catch (IOException e) {
				throw new EditionDaoException("Problem with file ", e);
			}
        }
	}
}

