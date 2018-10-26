package com.anncode.amazonViewer.model;

import java.util.Date;

public class Magazine extends Published{	
	

	private int id;


	public Magazine( String title, Date editionDate, String editorial) {
		super( title, editionDate, editorial);
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "\n :: MAGAZINE ::" + 
				"\n Title: " + getTitle() +
				"\n Editorial: " + getEditorial() + 
				"\n Edition Date: " + getEditionDate();
	}
	
	

}
