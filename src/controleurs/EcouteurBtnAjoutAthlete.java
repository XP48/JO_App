package controleurs;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import modeles.Equipe;
import modeles.Pays;
import vues.*;

/**
 *  @author Antonin
 */
public class EcouteurBtnAjoutAthlete implements ActionListener {
	//--------------------------
	// ATTRIBUTS
	//--------------------------
	JList<String> list;
	PageEquipes page;
	int indiceEquipe;
	EcouteurJListeEquipe ec;
	//--------------------------
	// CONSTRUCTEUR
	//--------------------------
	public EcouteurBtnAjoutAthlete(JList<String> list, PageEquipes page, int indice, EcouteurJListeEquipe ec) {
		this.list = list;
		this.page = page;
		this.indiceEquipe = indice;
		this.ec = ec;
	}

	public void actionPerformed(ActionEvent e) {
		int index = list.getSelectedIndex();
		if(index <= Equipe.lesEquipes.size()) {
			
			
			JFrame app = new JFrame("JO_APP");
			
			// Taille de la fenetre
			app.setSize(800, 200);
			
			AjoutAthlete acc = new AjoutAthlete(indiceEquipe, app, ec);
			
			app.add(acc.main);
			app.pack();
			app.setVisible(true);
			
			//Equipe.lesEquipes.remove(index);
			//page.refreshListe();
			//page.main.updateUI();
		}
	}
	
}
