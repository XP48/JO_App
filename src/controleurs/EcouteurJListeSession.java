package controleurs;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import vues.*;
import modeles.*;
import App.app;
/**
 * Classe ecouteur de la JListe des session
 *  @author alances
 */
public class EcouteurJListeSession implements ListSelectionListener {
	//--------------------------
	// ATTRIBUTS
	//--------------------------
	PageEpreuves page;
	JList<String> liste;
	JPanel infos = new JPanel();
	JLabel nom = new JLabel("");
	JLabel date = new JLabel("");
	JLabel heureDeb = new JLabel("");
	JLabel heureFin = new JLabel("");
	//--------------------------
	// CONSTRUCTEUR
	//--------------------------
	public EcouteurJListeSession(JList<String> liste, PageEpreuves page) {
		this.page = page;
		this.liste = liste;
	}
	public void valueChanged(ListSelectionEvent e) {
		Epreuve epreuve = Epreuve.lesEpreuves.get(page.listeEpreuve.getSelectedIndex());
		Session elem = epreuve.sesSession.get(liste.getSelectedIndex());

		BorderLayout layout = (BorderLayout) page.main.getLayout();
        Component westComponent = layout.getLayoutComponent(BorderLayout.WEST);
        if(westComponent != null) {
        	page.main.remove(westComponent);
        }
        
		
		infos.setLayout(new GridLayout(4,1));
		
		nom.setText("Nom : " + elem.getNomSession());
		date.setText("Date : " + elem.getDateSession());
		heureDeb.setText("Heure début : " + elem.getHeureDebutEpreuve());
		heureFin.setText("Heure fin : " + elem.getHeureFinEpreuve());
		
		infos.add(nom);
		infos.add(date);
		infos.add(heureDeb);
		infos.add(heureFin);
		
		
		page.main.add(infos, BorderLayout.WEST);
		page.main.updateUI();
	}

}
