package modeles;
/**
 * Classe Lieu
 * @author atirant
 *
 */
public class Lieu {

	Epreuve uneEpreuve;
	private int idLieu;
	private String nomLieu;
	private int nbPlacesLieu;
	private static int nbLieu = 0;
	
	//--------------------------
	// CONSTRUCTEUR
	//--------------------------
	/**
	 * Creer un objet de lieu
	 * @param nomLieu String pour definir le nom du lieu
	 * @param nbPlacesLieu Entier pour definir le nombre de place du lieu
	 */
	public Lieu(String nomLieu, int nbPlacesLieu) {
		this.nomLieu=nomLieu;
		this.nbPlacesLieu=nbPlacesLieu;
		idLieu=nbLieu++;
	}
	
	//--------------------------
	// ACCESSEURS
	//--------------------------
	/**
	 * Retourne l'id du lieu
	 * @return
	 */
	public int getIdLieu() {
		return this.idLieu;
	}
	/**
	 * Retourne le nom du lieu
	 * @return
	 */
	public String getNomLieu() {
		return nomLieu;
	}
	/**
	 * Retourne le nombre de place d'un lieu
	 * @return
	 */
	public int getNbPlacesLieu() {
		return nbPlacesLieu;
	}
}