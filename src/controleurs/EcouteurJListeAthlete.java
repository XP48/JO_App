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

public class EcouteurJListeAthlete implements ListSelectionListener {
	
	AjoutAthlete page;
	
	public EcouteurJListeAthlete(AjoutAthlete page) {
		this.page = page;
	}
	public void valueChanged(ListSelectionEvent e) {
		//(((JList<String>)(e.getSource())).getSelectedValuesList())
		page.SupprimerAthlete.setEnabled(true);
		page.AjouterAthlete.setEnabled(true);
	}

}
