package controleurs;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import modeles.Epreuve;
import modeles.Session;
import vues.*;

/**
 * Classe Ecouteur du bouton supprimer Epreuve
 * @author aksanti
 *
 */

public class EcouteurBtnSupprimerEpreuve implements ActionListener {
	
	JList<String> list;
	PageEpreuves page;
	
	public EcouteurBtnSupprimerEpreuve(JList<String> list, PageEpreuves page) {
		this.list = list;
		this.page = page;
	}

	public void actionPerformed(ActionEvent e) {
		int index = list.getSelectedIndex();
		if(index <= Epreuve.lesEpreuves.size()) {			
			Epreuve.lesEpreuves.remove(index);
			page.refreshListe();
			page.main.updateUI();
		}
	}
	
}
