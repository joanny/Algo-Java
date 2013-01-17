package com.iut.heritage;

public class Main {
	public static void main(String[] args) {
		Employe a = new Employe();
		a.setSalaireEmploye(1000);
		a.augmentation(200);
		a.afficher();
		
		Technicien t = new Technicien(new Byte((byte) 1));
		t.setSalaireEmploye(1000);
		t.augmentation(200);
		t.afficher();
	}

}
