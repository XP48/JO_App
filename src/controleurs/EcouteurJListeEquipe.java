package controleurs;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import vues.*;
import modeles.*;
import App.app;

public class EcouteurJListeEquipe implements ListSelectionListener {
	
	PageEquipes page;
	
	public EcouteurJListeEquipe(PageEquipes page) {
		this.page = page;
	}
	public void valueChanged(ListSelectionEvent e) {
		//(((JList<String>)(e.getSource())).getSelectedValuesList())
		page.SupprimerEquipe.setEnabled(true);
		page.AjouterAthlete.setEnabled(true);
		EcouteurBtnAjoutAthlete clickAjoutAthlete = new EcouteurBtnAjoutAthlete(listeEquipe, page, listeEquipe.getSelectedIndex());
		AjouterAthlete.addActionListener(clickAjoutAthlete);
	}

}
