package modeles;

import java.util.ArrayList;

public class Session {
	private Epreuve sonEpreuve;
	private String heureDebutSession;
	private String heureFinSession;
	private String dateSession;
	private String nomSession;
	
	
	// probléme il y aura plein d'épreuve du mm nom genre 2 basket
	public Session(Epreuve e,String dateSession, String heureDebutSession, String heureFinSession,String nomSession) {
		sonEpreuve=e;
		e.ajouteSessionE(this);
		this.dateSession=dateSession;
		this.heureDebutSession=heureDebutSession;
		this.heureFinSession=heureFinSession;
		this.nomSession=nomSession;
}
	
	public String getHeureDebutEpreuve() {
		return this.heureDebutSession;
	}

	public String getHeureFinEpreuve() {
		return this.heureFinSession;
	}
	public String dateSession() {
		return this.dateSession;
	}
	
	
	public void setHeureDebutEpreuve(String heureDebutEpreuve) {
		this.heureDebutSession = heureDebutEpreuve;
	}

	public void setHeureFinEpreuve(String heureFinEpreuve) {
		this.heureFinSession = heureFinEpreuve;
	}
}

