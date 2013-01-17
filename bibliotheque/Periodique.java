package com.iut.bibliotheque;

public class Periodique extends Ouvrage  {

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result
				+ ((periodicite == null) ? 0 : periodicite.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Periodique other = (Periodique) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (periodicite == null) {
			if (other.periodicite != null)
				return false;
		} else if (!periodicite.equals(other.periodicite))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Periodique [numero=" + numero + ", nom=" + nom
				+ ", periodicite=" + periodicite + "]";
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPeriodicite() {
		return periodicite;
	}

	public void setPeriodicite(String periodicite) {
		this.periodicite = periodicite;
	}

	private String numero;
	private String nom;
	private String periodicite;

	public Periodique(String numero, String nom, String periodicite) {
		super();
		this.numero = numero;
		this.nom = nom;
		this.periodicite = periodicite;
	}
}
