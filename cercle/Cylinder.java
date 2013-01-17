package com.iut.cercle;

public class Cylinder extends Circle {
	private double hauteur;

	public double volume() {
		return super.getSurface() * hauteur;
	}

	@Override
	public String toString() {
		return super.toString() + "Cylinder [hauteur=" + hauteur + "]";
	}
}
