package modeles;

import java.util.*;

public class Epreuve {

	private ArrayList<Medaille> sesMedaille = new ArrayList<Medaille>();
	Lieu sonLieu;
	private ArrayList<Equipe> sesParticipants = new ArrayList<Equipe>();
	private ArrayList<Session> sesSession = new ArrayList<Session>();
	public ArrayList<Epreuve> lesEpreuves = new ArrayList<Epreuve>();
	private int idEpreuve;
	protected String nomEpreuve;
	private static int nbEpreuve = 0;
	private Medaille Medaille;

	
	public  String getnomEpreuve() {
		return nomEpreuve;
	}
	public int getIdEpreuve() {
		return this.idEpreuve;
	}
	public String getNomEpreuve() {
		return this.nomEpreuve;
	}
	public Epreuve(String nomEpreuve) {
		this.idEpreuve=nbEpreuve++;
		this.nomEpreuve=nomEpreuve;
	}
	
	public void ajouteSessionE(Session s) {
		sesSession.add(s);
	}

}