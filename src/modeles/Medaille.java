package modeles;
/**
 * Classe abstraite medaille
 * @author atirant
 *
 */

public abstract class Medaille {
	
	//--------------------------
	// ATTRIBUTS
	//--------------------------
	Epreuve sonEpreuve;
	protected int idMedaille;
	protected String nomTypeMedaille;
	protected static int nbMedaille = 0;
	
	//--------------------------
	// CONSTRUCTEUR
	//--------------------------
	/**
	 * Constructeur de medaille
	 */
	Medaille() {
		idMedaille=nbMedaille++;
	}
	
	//--------------------------
	// ACCESSEURS
	//--------------------------
	/**
	 * Retourne l'id de la medaille
	 * @return
	 */
	public abstract int getIdMedaille();
	/**
	 * Retourne le type de la medaille
	 * @return
	 */
	public abstract String getNomTypeMedaille();
	
	/**
	 * Setter pour le nom de la medaille;
	 * @param nomTypeMedaille
	 */
	public void setNomTypeMedaille(String nomTypeMedaille)
	{
		this.nomTypeMedaille = nomTypeMedaille;
	}
	
	
}