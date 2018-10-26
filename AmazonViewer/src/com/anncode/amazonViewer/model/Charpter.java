package com.anncode.amazonViewer.model;

import java.util.ArrayList;

public class Charpter extends Movie{
	
	private int id;
	private int sessionNumber;

	
//	METODO CONSTRUCTOR HEREDADO DE LA CLASE PADRE


	public Charpter(String title, String genero, String creator, int duration, int year, int sessionNumber) {
		super(title, genero, creator, duration, year);
		// TODO Auto-generated constructor stub
		this.setSessionNumber(sessionNumber);
	}
	
	public Charpter() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//	SOBRESCRIBIR EL METODO GETID DE MOVIE
	
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}
	
	public int getSessionNumber() {
		return sessionNumber;
	}
	public void setSessionNumber(int sessionNumber) {
		this.sessionNumber = sessionNumber;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "\n :: CHAPTER ::" + 
				"\n Title: " + getTitle() +
				"\n Year: " + getYear() + 
				"\n Creator: " + getCreator() +
				"\n Duration: " + getDuration();
	}
	
	
	public static ArrayList<Charpter> makeChaptersList() {
		ArrayList<Charpter> chapters = new ArrayList();
		
		for (int i = 1; i <= 5; i++) {
			chapters.add(new Charpter("Capituo "+i, "genero "+i, "creator" +i, 45, (short)(2017+i), i));
		}
		
		return chapters;
	}

}
