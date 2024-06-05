package modeles;

/**
 * Createur d'objet MedailleArgent abstrait de la classe medaille
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
	 * Creer un objet MedailleArgent
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
