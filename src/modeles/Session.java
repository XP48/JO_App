package modeles;

import java.util.ArrayList;

public class Session extends Epreuve {
	private String heureDebutEpreuve;
	private String heureFinEpreuve;
	private String dateEpreuve;
	private String nomSession;
	public static ArrayList<Epreuve> EpreuveExistante = new ArrayList<Epreuve>();
	
	
	// probléme il y aura plein d'épreuve du mm nom genre 2 basket
	public Session(String nomEpreuve, String dateEpreuve, String heureDebutEpreuve, String heureFinEpreuve,String nomSession) {
		super(nomEpreuve);
		this.dateEpreuve=dateEpreuve;
		this.heureDebutEpreuve=heureDebutEpreuve;
		this.heureFinEpreuve=heureFinEpreuve;
		this.nomSession=nomSession;
		super.ajouteSessionE(this);
}
	public String getnomSession() {
		return this.nomSession;
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
}

