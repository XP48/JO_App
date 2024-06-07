package modeles;

import java.util.*;
import java.io.Serializable;

/**
 * Classe Epreuve
 * @author atirant
 *
 */

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
	
	/**
	 * Constructeur permettant de creer une epreuve
	 * @param nomEpreuve
	 */
	public Epreuve(String nomEpreuve) {
		if(!nomEpreuve.isEmpty()) {
			this.idEpreuve=nbEpreuve++;
			this.nomEpreuve=nomEpreuve;
			lesEpreuves.add(this);
		}
	}	
	
	//--------------------------
	// METHODES
	//--------------------------
	
	/**
	 * Cette methode sert a ajouter une session a une epreuve
	 * @param s objet session
	 */
	public void ajouteSessionE(Session s) {
		sesSession.add(s);
	}
	
	//--------------------------
	// ACCESSEURS
	//--------------------------
	
	/**
	 * @return retourne le nom de l'epreuve
	 */
	public  String getnomEpreuve() 
	{
		return nomEpreuve;
	}
	
	/**
	 * @return l'id de l'epreuve
	 */
	public int getIdEpreuve() {
		return this.idEpreuve;
	}
	
	/**
	 * @return le nom de l'epreuve
	 */
	public String getNomEpreuve() {
		return this.nomEpreuve;
	}

}