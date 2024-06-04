package modeles;

import java.util.ArrayList;

public class Session {
	//--------------------------
	// ATTRIBUTS
	//--------------------------
	private Epreuve sonEpreuve;
	private String heureDebutSession;
	private String heureFinSession;
	private String dateSession;
	private String nomSession;
	
	
	//--------------------------
	// CONSTRUCTEUR
	//--------------------------
	public Session(Epreuve e,String dateSession, String heureDebutSession, String heureFinSession,String nomSession) {
		sonEpreuve=e;
		e.ajouteSessionE(this);
		this.dateSession=dateSession;
		this.heureDebutSession=heureDebutSession;
		this.heureFinSession=heureFinSession;
		this.nomSession=nomSession;
		}
	//--------------------------
	// ACCESSEURS
	//--------------------------
	public String getHeureDebutEpreuve() {
		return this.heureDebutSession;
	}
	public String getHeureFinEpreuve() {
		return this.heureFinSession;
	}
	public String dateSession() {
		return this.dateSession;
	}
	public String getNomSession() {
		return nomSession;
	}
}

