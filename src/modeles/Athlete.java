package modeles;

import java.util.ArrayList;

public class Athlete {

	private ArrayList<Equipe> sesEquipe = new ArrayList<Equipe>();
	public static ArrayList<Athlete> lesAthletes = new ArrayList<Athlete>();
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
	
	public Athlete(String nomAthlete, String prenomAthlete) {
		this.nomAthlete=nomAthlete;
		this.prenomAthlete=prenomAthlete;
		idAthlete=nbAthlete++;
	}
	public void ajouteEquipeA(Equipe e) {
		sesEquipe.add(e);
	}
	public void removeEquipeA(Equipe e) {
		sesEquipe.remove(e);
	}

}