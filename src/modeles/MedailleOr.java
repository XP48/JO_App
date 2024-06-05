package modeles;

/**
 * Classe MedailleOr abstraite de la classe medaille
 * @author atirant
 *
 */
public class MedailleOr extends Medaille{
	
	//--------------------------
	// ATTRIBUTS
	//--------------------------
	private final String type="gold";
	
	//--------------------------
	// CONSTRUCTEUR
	//--------------------------
	public MedailleOr() {
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
