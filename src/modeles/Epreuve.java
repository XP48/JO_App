package modeles;

import java.util.*;

public class Epreuve {

	Medaille sesMedailles;
	Collection<Lieu> sonLieu;
	Equipe sesParticipants;
	private int idEpreuve;
	private String nomEpreuve;
	private String dateEpreuve;
	private String heureDebutEpreuve;
	private String heureFinEpreuve;
	private static int nbEpreuve = 0;
	private Medaille Medaille;

	public int getIdEpreuve() {
		return this.idEpreuve;
	}

	public void setIdEpreuve(int idEpreuve) {
		this.idEpreuve = idEpreuve;
	}

	public String getNomEpreuve() {
		return this.nomEpreuve;
	}

	public String getDateEpreuve() {
		return this.dateEpreuve;
	}

	public String getHeureDebutEpreuve() {
		return this.heureDebutEpreuve;
	}

	public String getHeureFinEpreuve() {
		return this.heureFinEpreuve;
	}

	/**
	 * 
	 * @param nomEpreuve
	 * @param dateEpreuve
	 * @param heureDebutEpreuve
	 * @param heureFinEpreuve
	 */
	public Epreuve(String nomEpreuve, String dateEpreuve, String heureDebutEpreuve, String heureFinEpreuve) {
		// TODO - implement Epreuve.Epreuve
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Medaille
	 */
	public void addMedaille(Medaille Medaille) {
		// TODO - implement Epreuve.addMedaille
		throw new UnsupportedOperationException();
	}

}