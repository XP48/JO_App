package modeles;

import java.util.*;

public class Medaille {

	Collection<Epreuve> sonEpreuve;
	private int idMedaille;
	private String nomTypeMedaille;
	private static int nbMedaille = 0;

	public int getIdMedaille() {
		return this.idMedaille;
	}

	public String getNomTypeMedaille() {
		return this.nomTypeMedaille;
	}

	/**
	 * 
	 * @param nomTypeMedaille
	 */
	public Medaille(String nomTypeMedaille) {
		// TODO - implement Medaille.Medaille
		throw new UnsupportedOperationException();
	}

}