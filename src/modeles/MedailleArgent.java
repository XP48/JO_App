package modeles;

/**
 * Createur d'objet abstrait de la classe medaille
 * @author atirant
 *
 */

public class MedailleArgent extends Medaille {
	
	//--------------------------
	// ATTRIBUTS
	//--------------------------
	private final String type="Silver";
	
	
	//--------------------------
	// CONSTRUCTEUR
	//--------------------------
	/**
	 * Constructeur de medaille
	 */
	public MedailleArgent() {
		super();
		this.setNomTypeMedaille(type);
	}
	
	//--------------------------
	// ACCESSEURS
	//--------------------------
	

	public int getIdMedaille() {
		return super.idMedaille;
	}
	
	public String getNomTypeMedaille() {
		return super.nomTypeMedaille;
	}

}
