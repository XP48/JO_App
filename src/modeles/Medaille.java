package modeles;

import java.util.*;

public class Medaille {

	Epreuve sonEpreuve;
	private int idMedaille;
	private String nomTypeMedaille;
	private static int nbMedaille = 0;

	public int getIdMedaille() {
		return this.idMedaille;
	}

	public String getNomTypeMedaille() {
		return this.nomTypeMedaille;
	}

	public Medaille(String nomTypeMedaille) {
		this.nomTypeMedaille=nomTypeMedaille;
		idMedaille=nbMedaille++;
	}

}