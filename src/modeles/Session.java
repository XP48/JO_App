package modeles;

import java.util.ArrayList;

public class Session extends Epreuve {
	private String heureDebutEpreuve;
	private String heureFinEpreuve;
	private String dateEpreuve;
	private static ArrayList<Epreuve> EpreuveExistante = new ArrayList<Epreuve>();
	
	
	// probléme il y aura plein d'épreuve du mm nom genre 2 basket
	public Session(String nomEpreuve, String dateEpreuve, String heureDebutEpreuve, String heureFinEpreuve) {
		super(nomEpreuve);
		this.dateEpreuve=dateEpreuve;
		this.heureDebutEpreuve=heureDebutEpreuve;
		this.heureFinEpreuve=heureFinEpreuve;
		super.ajouteSessionE(this);
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
