package controleurs;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import modeles.Athlete;
import modeles.Equipe;
import modeles.Pays;
import vues.*;
/**
 * Classe Ecouteur du bouton Supprimer athlete
 *  @author alances
 */
public class EcouteurBtnSupprimerAthlete implements ActionListener {
	//--------------------------
	// ATTRIBUTS
	//--------------------------
	JList<String> list;
	AjoutAthlete page;
	//--------------------------
	// CONSTRUCTEUR
	//--------------------------
	
	/*
	 *Constructeur de l'affichage de la liste des athletes
	 */
	public EcouteurBtnSupprimerAthlete(JList<String> list, AjoutAthlete page) {
		this.list = list;
		this.page = page;
	}

	public void actionPerformed(ActionEvent e) {
		int index = list.getSelectedIndex();
		if(index < Athlete.lesAthletes.size() && index >=0) {			
			Athlete.lesAthletes.remove(index);
			page.refreshListe();
			page.main.updateUI();
		}
	}
}
