package com.anncode.amazonViewer.model;
import java.util.ArrayList;
import java.util.Date;


public class Book extends Published implements IVisualizable{
	

	private int id;
	private String isbn;
	private boolean readed;
	private int timeRead;
	
	
	
	public Book( String title, Date editionDate, String editorial,String[] authors) {
		super( title, editionDate, editorial);
		// TODO Auto-generated constructor stub
		setAuthors(authors);
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public boolean isReaded() {
		return readed;
	}
	public void setReaded(boolean readed) {
		this.readed = readed;
	}

	public int getTimeRead() {
		return timeRead;
	}

	public void setTimeRead(int timeRead) {
		this.timeRead = timeRead;
	}


	@Override
	public Date startToSee(Date dateI) {
		// TODO Auto-generated method stub
		return dateI;
	}



	@Override
	public void stopToSee(Date dateI, Date dateF) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		if(dateF.getSeconds()>dateI.getSeconds()) {	
			setTimeRead(dateF.getSeconds() - dateI.getSeconds());
		}else {
			setTimeRead(0);
		}
	}
	
	public static ArrayList<Book> makeBookList() {
		ArrayList<Book> books = new ArrayList();
		String[] authors = new String[3];
		for (int i = 0; i < 3; i++) {
			authors[i] = "author "+i;
		}
		for (int i = 1; i <= 5; i++) {
			books.add(new Book("Book " + i, new Date(), "editorial " + i, authors));
		}
		
		return books;
	}
	
	
	
	
}
