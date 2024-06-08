package modeles;
import java.util.ArrayList;
import java.io.*;

/**
 * Classe Athlete
 * @author atirant
 *
 */

public class Athlete implements Serializable {
	private static final long serialVersionUID = 1L;
	//--------------------------
	// ATTRIBUTS
	//--------------------------
	private ArrayList<Equipe> sesEquipe = new ArrayList<Equipe>();
	public static ArrayList<Athlete> lesAthletes = new ArrayList<Athlete>();
	private int idAthlete;
	private String nomAthlete;
	private String prenomAthlete;
	private static int nbAthlete = 0;
	
	//--------------------------
	// CONSTRUCTEUR
	//--------------------------
	/**
	 * Constructeur d'objet athlete
	 * @param nomAthlete String pour definir le nom de l'athlete
	 * @param prenomAthlete String pour definir le prenom de l'athlete
	 */
	public Athlete(String nomAthlete, String prenomAthlete) {
		if(!nomAthlete.isEmpty() && !prenomAthlete.isEmpty()) {
			this.nomAthlete=nomAthlete;
			this.prenomAthlete=prenomAthlete;
			idAthlete=nbAthlete++;
			lesAthletes.add(this);
		}
	}
	
	//--------------------------
	// METHODES
	//--------------------------
	/**
	 * Cette methode permet d'ajouter une equipe a l'athlete
	 * @param e objet equipe
	 */
	public void ajouteEquipeA(Equipe e) {
		sesEquipe.add(e);
	}
	/**
	 * Cette méthode permet de retirer une equipe a l'athlete
	 * @param e objet equipe
	 */
	public void removeEquipeA(Equipe e) {
		sesEquipe.remove(e);
	}
	//--------------------------
	// ACCESSEURS
	//--------------------------
	/**
	 * @return l'id de l'athlete
	 */
	
	public int getIdAthlete() {
		return this.idAthlete;
	}
	
	/**
	 * @return le nom de l'athlete
	 */
	public String getNomAthlete() {
		return this.nomAthlete;
	}
	/** 
	 * @return le prenom de l'athlete
	 */
	public String getPrenomAthlete() {
		return this.prenomAthlete;
	}	
	
}