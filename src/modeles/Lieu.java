package modeles;

public class Lieu {

	Epreuve uneEpreuve;
	private int idLieu;
	private String nomLieu;
	private int nbPlacesLieu;
	private static int nbLieu = 0;

	public int getIdLieu() {
		return this.idLieu;
	}

	public Lieu(String nomLieu, int nbPlacesLieu) {
		this.nomLieu=nomLieu;
		this.nbPlacesLieu=nbPlacesLieu;
		idLieu=nbLieu++;
	}

}