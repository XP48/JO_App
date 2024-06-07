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
	 * @return l'id du pays
	 */
	public int getIdPays() {
		return this.idPays;
		
	}
	/**
	 * @return le nom du pays
	 */
	public String getNomPays() {
		return this.nomPays;
	}
}
