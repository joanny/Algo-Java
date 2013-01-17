package com.iut.cercle;

public class Circle extends Shape {
	final static double PI = 3.141592564;

	private double radius;
	private double surface;

	public Circle() {
		radius = 0;
	}

	public Circle(double x, double y, double r) {
		super(x, y);
		radius = r;
		this.surface = (this.radius * this.radius) * PI;
	}

	public String toString() {
		return super.toString() + " Rayon : " + radius + " Surface : " + this.getSurface();
	}

	public double getSurface() {
		return surface;
	}

	public double getRadius() {				
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
		this.surface = (this.radius * this.radius) * PI;
	}

	public boolean isBigger(Circle unCercle) {
		return this.getSurface() > unCercle.getSurface();
	}

	public boolean isBigger_2(Circle unCercle, Circle unCercle_2) {
		boolean big = false;
		if ((this.getSurface() > unCercle.getSurface())
				&& this.getSurface() > unCercle_2.getSurface()) {
			big = true;
		}
		return big;

	}
}
