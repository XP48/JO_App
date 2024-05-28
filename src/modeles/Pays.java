package modeles;

import java.util.ArrayList;

public class Pays {
	private ArrayList<Equipe> sesEquipe = new ArrayList<Equipe>();
	private int idPays;
	private static int nbPays = 0;
	private String nomPays;

	public int getIdPays() {
		return this.idPays;
	}

	public String getNomPays() {
		return this.nomPays;
	}

	public Pays(String nomPays) {
		this.nomPays=nomPays;
		idPays=nbPays++;
	}

	public void ajouteEquipeP(Equipe Equipe) {
		sesEquipe.add(Equipe);
		Equipe.setSonPays(this);
	}
	public void removeEquipeP(Equipe Equipe) {
		sesEquipe.remove(Equipe);
	}

}
