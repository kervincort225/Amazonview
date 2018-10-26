package com.anncode.amazonViewer.model;
import java.lang.Math;

public class Films {
	
	private String title;
	private String genero;
	private String creator;
	private int duration;
	private int year;
	private boolean viewer;
	
	
	

	
	
	

	public Films() {
		// TODO Auto-generated constructor stub
	}

	public Films(String title, String genero, String creator, int duration) {
		super();
		this.title = title;
		this.genero = genero;
		this.creator = creator;
		this.duration = duration;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String  isViewer() {
//		int b = (int) Math.random();
//		boolean c;
		
		String visto = "";
		if(viewer == true) {
		 visto = "si";
		}else {
		visto = "no";
		}
		return visto;
	}
//	METODO CREADO PARA PROBAR EL BOOLEAN RANDOM
	public boolean  isViewerBooleanRandom() {
		double b = Math.random();
		boolean visto;
		if(b > 0.5) {
			visto = true;
		}else {
		visto = false;
		}
		return visto;
	}
	
	
	public boolean getIsViewed() {
		// TODO Auto-generated method stub
		return viewer;
	}
	

	public void setViewer(boolean viewer) {
		this.viewer = viewer;
	}
	
	

}
