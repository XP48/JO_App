package modeles;

public class MedailleBronze extends Medaille {

	
	private final String type="Silver";
	public MedailleBronze() {
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
