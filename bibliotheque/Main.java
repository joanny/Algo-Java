package com.iut.bibliotheque;

public class Main {
	public static void main(String[] args) {
	 BiblioTab b= new BiblioTab();
	 b.add(new Livre("moi", "ok", "mp"));
	 b.add(new Livre("moi1", "ok1", "mp1"));
	 b.add(new Livre("moi2", "ok2", "mp2"));
	 System.out.println(b.toString());
	 
	}
}
