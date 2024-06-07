package modeles;

import java.util.*;

/**
 * Classe equipe
 * @author atirant
 *
 */
public class Equipe {
	//--------------------------
	// ATTRIBUTS
	//--------------------------
	
	private ArrayList<Epreuve> sesEpreuve = new ArrayList<Epreuve>();
	public ArrayList<Athlete> sesAthlete = new ArrayList<Athlete>();
	public static ArrayList<Equipe> lesEquipes = new ArrayList<Equipe>();
	Pays SonPays;
	private int idEquipe;
	private String nomEquipe;
	private static int nbEquipe=0;
	//--------------------------
	// CONSTRUCTEUR
	//--------------------------
		
	/**
	 * constructeur d'equipe qui prend en parametre le nom de l'equipe et un objet pays 
	 * 
	 * @param nomEquipe nom de l'equipe qui va etre creer NOT NULL
	 * @param p pays a laquel appartient l'equipe
	 */
	public Equipe(String nomEquipe,Pays p) {
		if(!nomEquipe.isEmpty()) {
			this.nomEquipe=nomEquipe; 
			lesEquipes.add(this); 
			SonPays = p;
			p.ajouteEquipeP(this);
			idEquipe=nbEquipe++;
		}
	}
	
	
	//--------------------------
	// METHODES
	//--------------------------
	
	/**
	 * Cette methode permet de rajouter un athlete a une equipe
	 * et rajoute l'equipe a l'arraylist equipe de l'athlete
	 * 
	 * @param athlete objet athlete 
	 */
	public void ajouteAthlete(Athlete athlete) {
		athlete.ajouteEquipeA(this);
		sesAthlete.add(athlete);
	}
	
	/**
	 * Cette methode permet de retirer un athlete d'une equipe
	 * mais aussi de retirer l'equipe de l'arraylist equipe de l'athlete
	 * 
	 * @param athlete objet athlete
	 */
	public void removeAthlete(Athlete athlete) {
		athlete.removeEquipeA(this);
		sesAthlete.remove(athlete);
	}
	/**
	 * Cette méthode permet de supprimer une équipe au pays et aux athlètes à laquel elle est associé.
	 */
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
	
	/**
	 * @return le pays de l'equipe
	 */
	public Pays getSonPays() {
		return SonPays;
	}
	
	/**
	 * @return le nom de l'equipe
	 */
	public String getNomEquipe() {
		return nomEquipe;
	}
}