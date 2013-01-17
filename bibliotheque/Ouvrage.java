package com.iut.bibliotheque;

import java.sql.Date;

public abstract class Ouvrage {
	private Date date_emprunt;
	private int num_ouvrage;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((date_emprunt == null) ? 0 : date_emprunt.hashCode());
		result = prime * result + num_ouvrage;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ouvrage other = (Ouvrage) obj;
		if (date_emprunt == null) {
			if (other.date_emprunt != null)
				return false;
		} else if (!date_emprunt.equals(other.date_emprunt))
			return false;
		if (num_ouvrage != other.num_ouvrage)
			return false;
		return true;
	}

}
