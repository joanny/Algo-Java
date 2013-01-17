package com.iut.bibliotheque;

import java.util.LinkedList;


public  abstract class Bibliotheque {	
	private LinkedList<Ouvrage> listOuvrage;

 
	public Bibliotheque() {
		super();
		this.listOuvrage =  new LinkedList<Ouvrage>();
	}
	public LinkedList<Ouvrage> getListOuvrage() {
		return listOuvrage;
	}
	public void setListOuvrage(LinkedList<Ouvrage> listOuvrage) {
		this.listOuvrage = listOuvrage;
	}
	abstract  void add(Ouvrage o );
	abstract  void delete(Ouvrage o ); 
	  
}
