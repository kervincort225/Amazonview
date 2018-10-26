package com.anncode.amazonViewer;


import com.anncode.amazonViewer.model.*;
import com.anncode.makeReport.Report;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		showMenu();


	}
	
	public static void showMenu() {
		int exit = 0;
		do {
			
			System.out.println("BIENVENIDOS AMAZON VIEWER");
			System.out.println("");
			System.out.println("Selecciona el n√∫mero de la opci√≥n deseada");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("5. Report");
			System.out.println("6. Report Today");
			System.out.println("0. Exit");
			
			//Leer la respuesta del usuario
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextLine());

			switch (response) {
				case 0:
					//salir
					
					break;
				case 1:
					showMovies();
					break;
				case 2:
					showSeries();
					break;
				case 3:
					showBooks();
					break;
				case 4:
					showMagazines();
					break;
				case 5:
					makeReport();
					break;
				case 6:
					//Date date = new Date();
					makeReport(new Date());
					break;
	
				default:
					System.out.println();
					System.out.println("....°°Seleccione la opcion deseada!!....");
					System.out.println();
					break;
			}
			
			
		}while(exit != 0);
	}
	
	static ArrayList<Movie> movies = Movie.makeMovieslist();
	public static void showMovies() {
		int exit = 1;	

		do {
			System.out.println();
			System.out.println(":: MOVIES ::");
			System.out.println();
			
			for (int i = 0; i < movies.size(); i++) { //1. Movie 1
				System.out.println(i+1 + ". " + movies.get(i).getTitle() + " Visto: " + movies.get(i).isViewer());
			}
			
			System.out.println("0. Regresar al Menu");
			System.out.println();
			
			//Leer Respuesta usuario
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextLine());
			
			if(response == 0) {
				exit = 0;
				showMenu();
			}
			
			if (response > 0) {
				
				Movie movieSelected = movies.get(response-1);
				movieSelected.setViewer(true);
				Date dateI = movieSelected.startToSee(new Date());
				
				for (int i = 0; i < 100000; i++) {
					System.out.println("..........");
				}
				
				//Termine de verla
				movieSelected.stopToSee(dateI, new Date());
				System.out.println();
				System.out.println("Viste: " + movieSelected);
				System.out.println("Por: " + movieSelected.getTimeViewed() + " milisegundos");
			}
		}while(exit !=0);
		
	}
	
	
	
	
	public static void showSeries() {
		int exit = 1;
		ArrayList<Serie> series = Serie.makeSeriesList();
	do {
		System.out.println();
			System.out.println(":: SERIES ::");
			System.out.println();
			
			for (int i = 0; i < series.size(); i++) { //1. Serie 1
				System.out.println(i+1 + ". " + series.get(i).getTitle() + " Visto: " + series.get(i).isViewer());
			}
		
		System.out.println("0. Regresar al Menu");
			System.out.println();
			
			//Leer Respuesta usuario
			Scanner sc = new Scanner(System.in);
		int response = Integer.valueOf(sc.nextLine());			
			if(response == 0) {
				exit = 0;
				showMenu();
		}
						showChapters(series.get(response-1).getChapters());
			
		}while(exit !=0);
	}
	
	
	
	
	
	public static void showChapters(ArrayList<Charpter> chaptersOfSerieSelected) {
		int exit = 0;
		
		do {
			System.out.println();
			System.out.println(":: CHAPTERS ::");
			System.out.println();
			
			
			for (int i = 0; i < chaptersOfSerieSelected.size(); i++) { //1. Chapter 1
				System.out.println(i+1 + ". " + chaptersOfSerieSelected.get(i).getTitle() + " Visto: " + chaptersOfSerieSelected.get(i).isViewer());
			}
			
			System.out.println("0. Regresar al Menu");
			System.out.println();
			
			//Leer Respuesta usuario
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextLine());
			
			if(response == 0) {
				showSeries();
			}
			
			Charpter chapterSelected = chaptersOfSerieSelected.get(response-1);
			chapterSelected.setViewer(true);
			Date dateI = chapterSelected.startToSee(new Date());
			
			for (int i = 0; i < 100000; i++) {
				System.out.println("..........");
			}
			
			//Termine de verla
			chapterSelected.stopToSee(dateI, new Date());
			System.out.println();
			System.out.println("Viste: " + chapterSelected);
			System.out.println("Por: " + chapterSelected.getTimeViewed() + " milisegundos");
		}while(exit !=0);
	}
	
	
	
	public static void showBooks() {
		int exit = 0;
		ArrayList<Book> books= Book.makeBookList();
		do {
			System.out.println();
			System.out.println(":: BOOKS ::");
			System.out.println();
			
			for (int i = 0; i < books.size(); i++) { //1. Movie 1
				System.out.println(i+1 + ". " + books.get(i).getTitle() + " Visto: " + books.get(i).isReaded());
			}
			
			System.out.println("0. Regresar al Menu");
			System.out.println();
			
			//Leer Respuesta usuario
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextLine());
			
			if(response == 0) {
				showMenu();
			}
			
			Book bookSelected = books.get(response-1);
			bookSelected.setReaded(true);
			Date dateI = bookSelected.startToSee(new Date());
			
			for (int i = 0; i < 100000; i++) {
				System.out.println("..........");
			}
			
			//Termine de verla
			bookSelected.stopToSee(dateI, new Date());
			System.out.println();
			System.out.println("Viste: " + bookSelected);
			System.out.println("Por: " + bookSelected.getTimeRead() + " milisegundos");
		}while(exit !=0);
	
	}
	
	
	public static void showMagazines() {
		int exit = 0;
		do {
			System.out.println();
			System.out.println(":: MAGAZINES ::");
			System.out.println();
		}while(exit !=0);
	}
	
	
	
	public static void makeReport() {

		Report report = new Report();
		report.setNameFile("REPORTE");
		report.setTitle("::VISTOS::");
		report.setExtension("txt");
		String contentReport = "";
		
		for (Movie movie : movies) {
			if(movie.getIsViewed()) {
				contentReport += movie.toString()+"\n";
			}
		}
		
		report.setContent(contentReport);
		report.makeReport();
		
		
	}
	
	
	
	public static void makeReport(Date date) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = df.format(date);
		Report report = new Report();
		
		report.setNameFile("reporte" + dateString);
		report.setExtension("txt");
		report.setTitle(":: VISTOS ::");
		String contentReport = "";
		
		for (Movie movie : movies) {
			if (movie.getIsViewed()) {
				contentReport += movie.toString() + "\n";
				
			}
		}
		report.setContent(contentReport);
		report.makeReport();
	}
	
}
