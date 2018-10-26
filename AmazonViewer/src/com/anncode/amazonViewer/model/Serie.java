package com.anncode.amazonViewer.model;

import java.util.ArrayList;

public class Serie extends Films{
	
	
	private int id;
	private int sessionQuantity;
	private ArrayList<Charpter> chapters;
	
	
	
	
	
//	METODO CONSTRUCTOR HEREDADO DE LA CLASE PADRE
	public Serie(String title, String genero, String creator, int duration, int sessionQuantity, ArrayList<Charpter> chapters) {
		super(title, genero, creator, duration);
		// TODO Auto-generated constructor stub
		this.sessionQuantity = sessionQuantity;
		this.chapters = chapters;
	}




//	METODO CONSTRUCTOR HEREDADO DE LA CLASE PADRE
	public int getId() {
		return id;
	}

	public int getSessionQuantity() {
		return sessionQuantity;
	}

	public void setSessionQuantity(int sessionQuantity) {
		this.sessionQuantity = sessionQuantity;
	}

	public ArrayList<Charpter> getChapters() {
		return chapters;
	}

	public void setChapters(ArrayList<Charpter> chapters) {
		this.chapters = chapters;
	}




	public static ArrayList<Serie> makeSeriesList() {
		ArrayList<Serie> series = new ArrayList();
		
		for (int i = 1; i <= 5; i++) {
			series.add(new Serie("Serie "+i, "genero "+i, "creador "+i, 1200, 5, Charpter.makeChaptersList()));
			
		}
		
		return series;
	}
	
}
