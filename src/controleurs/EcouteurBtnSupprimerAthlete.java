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
 *  @author Antonin
 */
public class EcouteurBtnSupprimerAthlete implements ActionListener {
	
	JList<String> list;
	AjoutAthlete page;
	
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
