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
	private ArrayList<Athlete> sesAthlete = new ArrayList<Athlete>();
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
			System.out.println(nomEquipe);
			this.nomEquipe=nomEquipe; 
			lesEquipes.add(this); 
			System.out.println(lesEquipes.size());
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
	 * Cette methode permet de supprimer une equipe
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
	 * retourne le pays de l'equipe
	 * @return
	 */
	public Pays getSonPays() {
		return SonPays;
	}
	
	/**
	 * retourne le nom de l'equipe
	 * @return
	 */
	public String getNomEquipe() {
		return nomEquipe;
	}
}