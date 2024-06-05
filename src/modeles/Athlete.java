package modeles;
import java.util.ArrayList;

/**
 * Classe Athlete
 * @author atirant
 *
 */

public class Athlete {
	
	//--------------------------
	// ATTRIBUTS
	//--------------------------
	private ArrayList<Equipe> sesEquipe = new ArrayList<Equipe>();
	public static ArrayList<Athlete> lesAthletes = new ArrayList<Athlete>();
	private Pays sonPays;
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
		this.nomAthlete=nomAthlete;
		this.prenomAthlete=prenomAthlete;
		idAthlete=nbAthlete++;
		lesAthletes.add(this);
	}
	
	//--------------------------
	// METHODES
	//--------------------------
	/**
	 * Cette méthode permet d'ajouter une equipe a l'athlete
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
	
	public void ajouteSonPays(Pays p) {
		this.sonPays=sonPays;
	}
	//--------------------------
	// ACCESSEURS
	//--------------------------
	/**
	 * retourne l'id de l'athlete
	 * @return
	 */
	
	public int getIdAthlete() {
		return this.idAthlete;
	}
	
	/**
	 * retourne le nom de l'athlete
	 * @return
	 */
	public String getNomAthlete() {
		return this.nomAthlete;
	}
	/**
	 * retourne le prenom de l'athlete
	 * @return
	 */
	public String getPrenomAthlete() {
		return this.prenomAthlete;
	}
}