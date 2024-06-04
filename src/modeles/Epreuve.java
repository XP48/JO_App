package modeles;

import java.util.*;
import java.io.Serializable;

public class Epreuve implements Serializable{

	//--------------------------
	// ATTRIBUTS
	//--------------------------
	private ArrayList<Medaille> sesMedaille = new ArrayList<Medaille>();
	public static ArrayList<Epreuve> lesEpreuves = new ArrayList<Epreuve>();
	Lieu sonLieu;
	private ArrayList<Equipe> sesParticipants = new ArrayList<Equipe>();
	public ArrayList<Session> sesSession = new ArrayList<Session>();
	private int idEpreuve;
	protected String nomEpreuve;
	private static int nbEpreuve = 0;
	private Medaille Medaille;

	//--------------------------
	// CONSTRUCTEUR
	//--------------------------
	public Epreuve(String nomEpreuve) {
		this.idEpreuve=nbEpreuve++;
		this.nomEpreuve=nomEpreuve;
	}	
	
	//--------------------------
	// METHODES
	//--------------------------
	public void ajouteSessionE(Session s) {
		sesSession.add(s);
	}
	
	//--------------------------
	// ACCESSEURS
	//--------------------------
	public  String getnomEpreuve() {
		return nomEpreuve;
	}
	public int getIdEpreuve() {
		return this.idEpreuve;
	}
	public String getNomEpreuve() {
		return this.nomEpreuve;
	}

}