package com.iut.heritage;

public class Technicien extends Employe {

	private Byte grade;

	public Technicien(Byte grade) {
		super();
		this.grade = grade;
	}

	@Override
	public float calculeSalaire() {
		float prime = 300;
		if (this.grade == 1) {
			prime = 100;
		}

		if (this.grade == 2) {
			prime = 200;
		}
		super.augmentation(prime);
		return this.getSalaireEmploye();
	}

	@Override
	public String toString() {
		return "Technicien [nomEmploye=" + super.getNomEmploye() + ", ageEmploye="
				+ super.getAgeEmploye() + ", salaireEmploye="
				+ super.getSalaireEmploye() + " grade=" + calculeSalaire()+"]";

	}

}
