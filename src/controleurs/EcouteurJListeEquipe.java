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
	JList<String> listeEquipe;
	
	public EcouteurJListeEquipe(JList<String> listeEquipe, PageEquipes page) {
		this.page = page;
		this.listeEquipe = listeEquipe;
	}
	public void valueChanged(ListSelectionEvent e) {
		//(((JList<String>)(e.getSource())).getSelectedValuesList())
		page.SupprimerEquipe.setEnabled(true);
		page.AjouterAthlete.setEnabled(true);
		ActionListener[] listenersA = page.AjouterAthlete.getActionListeners();
		
		for (ActionListener listener : listenersA) {
			page.AjouterAthlete.removeActionListener(listener);
        }
		
		EcouteurBtnAjoutAthlete clickAjoutAthlete = new EcouteurBtnAjoutAthlete(listeEquipe, page, listeEquipe.getSelectedIndex());
		page.AjouterAthlete.addActionListener(clickAjoutAthlete);
	}

}
