package com.iut.bibliotheque;

public class Livre extends Ouvrage  { 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((auteur == null) ? 0 : auteur.hashCode());
		result = prime * result + ((editeur == null) ? 0 : editeur.hashCode());
		result = prime * result + ((titre == null) ? 0 : titre.hashCode());
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
		Livre other = (Livre) obj;
		if (auteur == null) {
			if (other.auteur != null)
				return false;
		} else if (!auteur.equals(other.auteur))
			return false;
		if (editeur == null) {
			if (other.editeur != null)
				return false;
		} else if (!editeur.equals(other.editeur))
			return false;
		if (titre == null) {
			if (other.titre != null)
				return false;
		} else if (!titre.equals(other.titre))
			return false;
		return true;
	}

	private String auteur;
	private String titre;
	private String editeur;

	public Livre(String auteur, String titre, String editeur) {
		super();
		this.auteur = auteur;
		this.titre = titre;
		this.editeur = editeur;
	}

	@Override
	public String toString() {
		return " \n Livre | auteur=" + auteur + "| titre=" + titre + "| editeur="+ editeur + "";
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getEditeur() {
		return editeur;
	}

	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}
}
