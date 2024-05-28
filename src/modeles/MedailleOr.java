package modeles;

public class MedailleOr extends Medaille{
	
	private final String type="gold";

	public MedailleOr() {
		super();
		this.setNomTypeMedaille(type);
	}
	
	public int getIdMedaille() {
		return super.idMedaille;
	}
	public String getNomTypeMedaille() {
		return super.nomTypeMedaille;
	}
	
}
