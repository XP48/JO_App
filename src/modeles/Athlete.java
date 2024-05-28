package modeles;

public class Athlete {

	Equipe SesEquipe;
	private int idAthlete;
	private String nomAthlete;
	private String prenomAthlete;
	private static int nbAthlete = 0;

	public int getIdAthlete() {
		return this.idAthlete;
	}

	public String getNomAthlete() {
		return this.nomAthlete;
	}

	public String getPrenomAthlete() {
		return this.prenomAthlete;
	}

	/**
	 * 
	 * @param nomAthlete
	 * @param prenomAthlete
	 */
	public Athlete(String nomAthlete, String prenomAthlete) {
		// TODO - implement Athlete.Athlete
		throw new UnsupportedOperationException();
	}

}