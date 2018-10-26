package com.anncode.amazonViewer.model;

import java.util.ArrayList;
import java.util.Date;

public class Movie extends Films implements IVisualizable{
	
//	ATRIBUTOS DE LA CLASE MOVIE
	
	private int id;
	private int timeViewed;
//	METODOS DE LA CLASE MOVIE
	
	
//	METODO CONSTRUCTOR HEREDADO DE LA CLASE PADRE
	public Movie() {
		
	}

	public Movie(String title, String genero, String creator, int duration, int year) {
		super(title, genero, creator, duration);
		// TODO Auto-generated constructor stub
		setYear(year);
		super.getTitle();
		
		
	}


	

	public void showData(String title, String genero, int year) {
//		System.out.println("Titulo : "+this.getTitle());
//		System.out.println("Genero : "+this.getGenero());
//		System.out.println("Año  : "+this.getYear());
		
	}


	// SETTER Y GETTER DE ESTA CLASE::::::::
	public int getId() {
		return id;
	}

	public int getTimeViewed() {
		return timeViewed;
	}


	public void setTimeViewed(int timeViewed) {
		this.timeViewed = timeViewed;
	}
	
	public String toString() {
		return "\n title : "+getTitle()+
				"\n Genero : "+getGenero()+
				"\n Year :"+getYear()+
				"\n Creator :"+getCreator()+
				"\n Duration : "+getDuration();
	}

	@Override
	public Date startToSee(Date dateI) {
		// TODO Auto-generated method stub
		return dateI;
	}

	@Override
	public void stopToSee(Date dateI, Date dateF) {
		// TODO Auto-generated method stub
		if(dateF.getTime()>dateI.getTime()) {	
			setTimeViewed((int)(dateF.getTime() - dateI.getTime()));
		}else {
			setTimeViewed(0);
		}
	}
	
	

	 public static ArrayList<Movie> makeMovieslist(){
		ArrayList<Movie> movies = new ArrayList<>();
		
//		ASI LO PODEMOSA HACER MANUAL PARA IR AGREGANDO... 
//		PERO COMO SON MUCHOS ENTONCES UTILIZAREMOS UN FOR
//		movies.add(new Movie("Coco", "Infantil", "Pixar", 120, 2017));
//		movies.add(new Movie("Contra zombie", "ACCION", "montainer", 180, 1998));
//		movies.add(new Movie("Matrix", "Accion", "WarnerBros", 200, 2003));
//		movies.add(new Movie("Mohana", "Infantil", "Disnay", 120, 2016));
		
		
		for(int i = 0; i <= 5; i++) {
			movies.add(new Movie("Movie "+ i, "Genero "+ i, "creador "+i, 120+i, 2017+i));
		}
		return movies;
	}


	
	
	
}
