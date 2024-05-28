package modeles;

import java.util.*;

public class Epreuve {

	private ArrayList<Medaille> sesMedaille = new ArrayList<Medaille>();
	Lieu sonLieu;
	private ArrayList<Equipe> sesParticipants = new ArrayList<Equipe>();
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
	

	public void setHeureDebutEpreuve(String heureDebutEpreuve) {
		this.heureDebutEpreuve = heureDebutEpreuve;
	}

	public void setHeureFinEpreuve(String heureFinEpreuve) {
		this.heureFinEpreuve = heureFinEpreuve;
	}

	public Epreuve(String nomEpreuve, String dateEpreuve, String heureDebutEpreuve, String heureFinEpreuve) {
		this.nomEpreuve=nomEpreuve;
		this.dateEpreuve=dateEpreuve;
		this.heureDebutEpreuve=heureDebutEpreuve;
		this.heureFinEpreuve=heureFinEpreuve;
	}
}