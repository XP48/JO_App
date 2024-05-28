package modeles;

import java.util.*;

public class Equipe {

	private ArrayList<Epreuve> sesEpreuve = new ArrayList<Epreuve>();
	private ArrayList<Athlete> sesAthlete = new ArrayList<Athlete>();
	Pays SonPays;
	private int idEquipe;
	private String nomEquipe;
	private static int nbEquipe=0;

	public Equipe(String nomEquipe) {
		this.nomEquipe=nomEquipe;
		idEquipe=nbEquipe++;
	}
	public void ajouteAthlete(Athlete athlete) {
		sesAthlete.add(athlete);
	}
	public void removeAthlete(Athlete athlete) {
		sesAthlete.remove(athlete);
	}	
	public Pays getSonPays() {
		return SonPays;
	}
	public void setSonPays(Pays sonPays) {
		SonPays = sonPays;
	}
	
	
}