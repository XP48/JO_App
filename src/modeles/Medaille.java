package modeles;


public abstract class Medaille {

	Epreuve sonEpreuve;
	protected int idMedaille;
	protected String nomTypeMedaille;
	protected static int nbMedaille = 0;

	public abstract int getIdMedaille();
	public abstract String getNomTypeMedaille();
	
	
	Medaille() {
		idMedaille=nbMedaille++;
	}
	public void setNomTypeMedaille(String nomTypeMedaille)
	{
		this.nomTypeMedaille = nomTypeMedaille;
	}
	
	
}