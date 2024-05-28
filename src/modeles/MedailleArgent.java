package modeles;

public class MedailleArgent extends Medaille {

	private final String type="Silver";
	
	public MedailleArgent() {
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
