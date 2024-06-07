package modeles;
import java.util.ArrayList;

/**
 * Classe Session
 * @author atirant
 *
 */
public class Session {
	//--------------------------
	// ATTRIBUTS
	//--------------------------
	private Epreuve sonEpreuve;
	private String heureDebutSession;
	private String heureFinSession;
	private String dateSession;
	private String nomSession;
	
	
	//--------------------------
	// CONSTRUCTEUR
	//--------------------------
	/**
	 * Construit un objet de la classe session
	 * @param e Objet Epreuve pour definir l'epreuve de la session
	 * @param dateSession String pour definir la date de la session
	 * @param heureDebutSession String pour definir l'heure de debut de la session
	 * @param heureFinSession String pour definir l'heure de fin de la session
	 * @param nomSession String pour definir le nom de la session
	 */
	public Session(Epreuve e,String dateSession, String heureDebutSession, String heureFinSession,String nomSession) {
		sonEpreuve=e;
		e.ajouteSessionE(this);
		this.dateSession=dateSession;
		this.heureDebutSession=heureDebutSession;
		this.heureFinSession=heureFinSession;
		this.nomSession=nomSession;
		}
	//--------------------------
	// ACCESSEURS
	//--------------------------
	/**
	 * @return l'heure de debut de l'epreuve
	 */
	public String getHeureDebutEpreuve() {
		return this.heureDebutSession;
	}
	
	/**
	 * @return l'heure de fin de l'epreuve
	 */
	public String getHeureFinEpreuve() {
		return this.heureFinSession;
	}
	
	/**
	 * @return la date de la session
	 */
	public String getDateSession() {
		return this.dateSession;
	}
	
	/** 
	 * @returnle nom de la session
	 */
	public String getNomSession() {
		return nomSession;
	}
}

