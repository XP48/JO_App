package modeles;

import java.util.*;

public class Equipe {

	private ArrayList<Epreuve> sesEpreuve = new ArrayList<Epreuve>();
	private ArrayList<Athlete> sesAthlete = new ArrayList<Athlete>();
	public static ArrayList<Equipe> lesEquipes = new ArrayList<Equipe>();
	Pays SonPays;
	private int idEquipe;
	private String nomEquipe;
	private static int nbEquipe=0;

	public Equipe(String nomEquipe,Pays p) {
		this.nomEquipe=nomEquipe;
		lesEquipes.add(this);
		SonPays = p;
		p.ajouteEquipeP(this);
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
	
	
	public String getNomEquipe() {
		return nomEquipe;
	}
	
	
	public void setSonPays(Pays sonPays) {
		SonPays = sonPays;
		sonPays.ajouteEquipeP(this);
	}
	
	public void retireEquipe() {
		lesEquipes.remove(this);
		this.SonPays.removeEquipeP(this);
		if(sesAthlete.size()>0) {
		for(Athlete a : sesAthlete) {
			a.removeEquipeA(this);
			}
		}
	}
	
}