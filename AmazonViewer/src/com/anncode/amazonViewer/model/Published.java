package com.anncode.amazonViewer.model;

import java.util.Date;

public class Published {
	
	private int id ;
	private String title;
	private Date editionDate;
	private String editorial;
	private String[] authors;
	
	
	private String isbn;
	private boolean readed;
	private int timeReaded;
	
	
	
	
	
	public Published(String title, Date editionDate, String editorial) {
		super();
		this.title = title;
		this.editionDate = editionDate;
		this.editorial = editorial;
	}
	
	
	
//	SETTER Y GETTERS

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getEditionDate() {
		return editionDate;
	}
	public void setEditionDate(Date editionDate) {
		this.editionDate = editionDate;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String[] getAuthors() {
		return authors;
	}
	public void setAuthors(String[] authors) {
		this.authors = authors;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}



	public String getIsbn() {
		
		String visto = "";
		if(readed == true) {
		 visto = "si";
		}else {
		visto = "no";
		}
		return visto;
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

	public int getTimeReaded() {
		return timeReaded;
	}
	public void setTimeReaded(int timeReaded) {
		this.timeReaded = timeReaded;
	}
	
	
	
	
	
}
