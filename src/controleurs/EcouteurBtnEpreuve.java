package controleurs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import vues.Accueil;
import vues.PageEpreuves;
import vues.PageEpreuves;

/**
 * Classe EcouteurBtnEpreuve
 * @author aksanti
 *
 */

public class EcouteurBtnEpreuve implements ActionListener {

	PageEpreuves pEpreuve = new PageEpreuves();
	Accueil old;
	
	public EcouteurBtnEpreuve(Accueil old) {
		this.old = old;
	}
	
	public void actionPerformed(ActionEvent e) {
		old.changeView(pEpreuve.main);
		pEpreuve.main.updateUI();
		
	}
}