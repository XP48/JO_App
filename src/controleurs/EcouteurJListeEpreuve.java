package controleurs;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import vues.*;
import modeles.*;
import App.app;

/**
 * Classe Ecouteur de la JListe des epreuves
 * @author aksanti
 *
 */

public class EcouteurJListeEpreuve implements ListSelectionListener {
	
	JButton btn;
	PageEpreuves page;
	JList<String> liste;
	JList<String> listeSession;
	
	public EcouteurJListeEpreuve(JList<String> liste, PageEpreuves page) {
		this.page = page;
		this.liste = liste;
	}
	/**
	 * Cette methode permet de mettre a jour afficher dans la jliste des session si l'equipe selectionner est modifier
	 */
	public void valueChanged(ListSelectionEvent e) {
		Epreuve elem = Epreuve.lesEpreuves.get(liste.getSelectedIndex());
		String[] tabSessions = new String[(elem.sesSession).size()];
		
		for (int i = 0; i < elem.sesSession.size(); i++) 
        {
			tabSessions[i] = elem.sesSession.get(i).getNomSession();
        }
		
		int index = liste.getSelectedIndex();
		
		EcouteurBtnCreerSession clickCreerSession = new EcouteurBtnCreerSession(page, index);
		page.CreerSession.addActionListener(clickCreerSession);
		
		listeSession = new JList<String>(tabSessions);
		EcouteurJListeSession clickListe = new EcouteurJListeSession(listeSession, page);
		listeSession.addListSelectionListener(clickListe);
		
		listeSession.setFont(new Font("Arial", Font.BOLD, 14));
		listeSession.setForeground(Color.BLUE);
		page.CreerSession.setEnabled(true);
		page.SupprimerEpreuve.setEnabled(true);
		page.grid.removeAll();
		page.grid.add(liste);
		page.grid.add(listeSession);
		page.main.add(page.grid, BorderLayout.CENTER);
		page.main.updateUI();
	}

}
