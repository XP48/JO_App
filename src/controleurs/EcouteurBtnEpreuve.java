package controleurs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import vues.PageEpreuves;
import vues.PageEquipes;

public class EcouteurBtnEpreuve implements ActionListener {

	PageEpreuves pageEpreuves;
	JPanel old;
	
	public EcouteurBtnEpreuve(JPanel old) {
		pageEpreuves = new PageEpreuves();
		this.old = old;
	}
	
	public void actionPerformed(ActionEvent e) {
		old.getParent().add(pageEpreuves.main);
		old.getParent().remove(old);
		pageEpreuves.main.updateUI();
	}
}