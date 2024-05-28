package modeles;

import java.util.ArrayList;

public class Ville {

	private int idVille;
	private String nomVille;
	private static int nbVille;
	private ArrayList<Lieu> sesLieux = new ArrayList<Lieu>();
	public int getIdVille() {
		return this.idVille;
	}

	/*Ici on créer une ville et on lui attribue un id pour la démarquer*/
	public Ville(String nomVille) {
		this.nomVille=nomVille;
		idVille=nbVille++;
	}
	public String getNomVille() {
		return nomVille;
	}
	public void addLieu(Lieu Lieu) {
		sesLieux.add(Lieu);
	}

}