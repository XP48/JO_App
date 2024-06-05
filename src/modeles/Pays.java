package modeles;

import java.util.ArrayList;

/**
 * Classe Pays
 * @author atirant
 *
 */

public class Pays {
	
	//--------------------------
	// ATTRIBUTS
	//--------------------------
	
	private ArrayList<Equipe> sesEquipe = new ArrayList<Equipe>();
	private int idPays;
	private static int nbPays = 0;
	private String nomPays;

	
	//--------------------------
	// CONSTRUCTEUR
	//--------------------------
	/**
	 * Creer un objet de la classe pays
	 * @param nomPays String permettant de definir le nom du pays
	 */
	public Pays(String nomPays) {
		this.nomPays=nomPays;
		idPays=nbPays++;
	}
	
	//--------------------------
	// METHODES
	//--------------------------
	/**
	 * Procédure pour ajouter une equipe au pays
	 * @param Equipe Objet equipe pour ajouter a l'arraylist du pays
	 */
	public void ajouteEquipeP(Equipe Equipe) {
		sesEquipe.add(Equipe);
		
	}
	/**
	 * Procédure pour ajouter une equipe au pays
	 * @param Equipe Objet equipe pour ajouter a l'arraylist du pays
	 */
	public void removeEquipeP(Equipe Equipe) {
		sesEquipe.remove(Equipe);
	}
	//--------------------------
	// ACCESSEURS
	//--------------------------
	/**
	 * Retourne l'id du pays
	 * @return
	 */
	public int getIdPays() {
		return this.idPays;
		
	}
	/**
	 * Retourne le nom du pays
	 * @return
	 */
	public String getNomPays() {
		return this.nomPays;
	}
}
