package com.iut.heritage;

public class Employe {
	private String nomEmploye;
	private int ageEmploye;
	private float salaireEmploye;

	public Employe() {
		super();
	}

	public Employe(String nomEmploye, int ageEmploye, float salaireEmploye) {
		super();
		this.nomEmploye = nomEmploye;
		this.ageEmploye = ageEmploye;
		this.salaireEmploye = salaireEmploye;
	}

	public void augmentation(float somme) {
		 this.setSalaireEmploye(this.getSalaireEmploye() + somme);
	}
	public String getNomEmploye() {
		return nomEmploye;
	}

	public void setNomEmploye(String nomEmploye) {
		this.nomEmploye = nomEmploye;
	}

	public int getAgeEmploye() {
		return ageEmploye;
	}

	public void setAgeEmploye(int ageEmploye) {
		this.ageEmploye = ageEmploye;
	}

	public float getSalaireEmploye() {
		return salaireEmploye;
	}

	public void setSalaireEmploye(float salaireEmploye) {
		this.salaireEmploye = salaireEmploye;
	}

	public void afficher() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		super.toString();
		return "Employe [nomEmploye=" + nomEmploye + ", ageEmploye="
				+ ageEmploye + ", salaireEmploye=" + salaireEmploye + "]";
	}
	
	public float calculeSalaire() {
		return salaireEmploye;
		 
	} 

}
