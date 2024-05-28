package modeles;

import java.util.*;

public abstract class Epreuve {

	private ArrayList<Medaille> sesMedaille = new ArrayList<Medaille>();
	Lieu sonLieu;
	private ArrayList<Equipe> sesParticipants = new ArrayList<Equipe>();
	private ArrayList<Session> sesSession = new ArrayList<Session>();
	private int idEpreuve;
	private String nomEpreuve;
	
	
	private static int nbEpreuve = 0;
	private Medaille Medaille;

	public int getIdEpreuve() {
		return this.idEpreuve;
	}

	public String getNomEpreuve() {
		return this.nomEpreuve;
	}
	public Epreuve(String nomEpreuve) {
		this.nomEpreuve=nomEpreuve;
	}
	public void ajouteSessionE(Session s) {
		sesSession.add(s);
	}
}