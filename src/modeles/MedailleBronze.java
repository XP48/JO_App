package modeles;

/**
 * Classe MedailleBronze abstraite de la classe medaille
 * @author atirant
 *
 */
public class MedailleBronze extends Medaille {
	
	//--------------------------
	// ATTRIBUTS
	//--------------------------
	private final String type="Silver";
	
	//--------------------------
	// CONSTRUCTEUR
	//--------------------------
	/**
	 * Creer un objet de la classe MedailleBronze
	 */
	public MedailleBronze() {
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
