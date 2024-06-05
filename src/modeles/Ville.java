package modeles;
import java.util.ArrayList;

/**
 * Classe Ville
 * @author atirant
 *
 */
public class Ville {
	
	//--------------------------
	// ATTRIBUTS
	//--------------------------
	private int idVille;
	private String nomVille;
	private static int nbVille;
	private ArrayList<Lieu> sesLieux = new ArrayList<Lieu>();
	
	//--------------------------
	// CONSTRUCTEUR
	//--------------------------
	
	/**
	 * Créer un objet Ville 
	 * @param nomVille String pour definir le nom de la ville
	 */
	public Ville(String nomVille) {
		this.nomVille=nomVille;
		idVille=nbVille++;
	}
	
	//--------------------------
	// METHODES
	//--------------------------
	/**
	 * Methode pour ajouter des lieux a une ville
	 * @param Lieu 
	 */
	public void addLieu(Lieu Lieu) {
		sesLieux.add(Lieu);
	}
	
	//--------------------------
	// ACCESSEURS
	//--------------------------
	
	/**
	 * Retourne le nom de la ville
	 * @return
	 */
	public String getNomVille() {
		return nomVille;
	}
	
	/**
	 * Retourne l'id de la ville
	 * @return
	 */
	public int getIdVille() {
		return this.idVille;
	}
	

}