package modeles;

import java.util.*;

public class Equipe {
	//--------------------------
	// ATTRIBUTS
	//--------------------------
	private ArrayList<Epreuve> sesEpreuve = new ArrayList<Epreuve>();
	private ArrayList<Athlete> sesAthlete = new ArrayList<Athlete>();
	public static ArrayList<Equipe> lesEquipes = new ArrayList<Equipe>();
	Pays SonPays;
	private int idEquipe;
	private String nomEquipe;
	private static int nbEquipe=0;
	//--------------------------
	// CONSTRUCTEUR
	//--------------------------
	public Equipe(String nomEquipe,Pays p) {
		this.nomEquipe=nomEquipe; 
		lesEquipes.add(this); // lesEquipes est l'arraylist utiliser pour afficher dans
		SonPays = p;
		p.ajouteEquipeP(this);
		idEquipe=nbEquipe++;
	}
	//--------------------------
	// METHODES
	//--------------------------
	public void ajouteAthlete(Athlete athlete) {
		sesAthlete.add(athlete);
	}
	public void removeAthlete(Athlete athlete) {
		sesAthlete.remove(athlete);
	}	
	public void retireEquipe() {
		lesEquipes.remove(this);
		this.SonPays.removeEquipeP(this);
		if(sesAthlete.size()>0) {
		for(Athlete a : sesAthlete) {
			a.removeEquipeA(this);
			}
		}
	}
	//--------------------------
	// ACCESSEURS
	//--------------------------	
	public Pays getSonPays() {
		return SonPays;
	}
	public String getNomEquipe() {
		return nomEquipe;
	}
}