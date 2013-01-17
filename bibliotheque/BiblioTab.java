package com.iut.bibliotheque;

import java.util.LinkedList;

public class BiblioTab extends Bibliotheque {

	 
	public BiblioTab() {
		super();
	}
	@Override
	void add(Ouvrage o) {
		super.getListOuvrage().add(o);

	}

	@Override
	void delete(Ouvrage o) {
		for (int i = 0; i < super.getListOuvrage().size(); i++) {
			if (o.equals(super.getListOuvrage().get(i))) {
				super.getListOuvrage().remove(i);
			}

		}

	}
	@Override
	public String toString() {
		String contenu =" ";
	//	for (int i = 0; i < super.getListOuvrage().size(); i++) {
			contenu = contenu + super.getListOuvrage().toString() + "\n"  ;
	//	}
		return "Voici le contenu de la bibliotheque:  \n" + contenu;
	}
	

}
