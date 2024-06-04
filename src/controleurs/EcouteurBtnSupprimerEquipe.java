package controleurs;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import modeles.Equipe;
import modeles.Pays;
import vues.*;

public class EcouteurBtnSupprimerEquipe implements ActionListener {
	
	JList<String> list;
	PageEquipes page;
	
	public EcouteurBtnSupprimerEquipe(JList<String> list, PageEquipes page) {
		this.list = list;
		this.page = page;
	}

	public void actionPerformed(ActionEvent e) {
		int index = list.getSelectedIndex();
		if(index < Equipe.lesEquipes.size()) {			
			Equipe.lesEquipes.remove(index);
			page.refreshListe();
			page.main.updateUI();
		}
	}
	
}
