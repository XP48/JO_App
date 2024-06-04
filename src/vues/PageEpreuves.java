package vues;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import controleurs.*;
import modeles.*;
public class PageEpreuves extends JPanel{
	

	JButton CreerEpreuve = new JButton("Créer une épreuve");
	JButton SupprimerEpreuve = new JButton("Supprimer une épreuve");
	
	JList<String> listeEpreuve = new JList<String>();
	
	public JPanel main = new JPanel();
	
	JPanel buttons = new JPanel();
	
		
	public PageEpreuves() {
		
			main.setLayout(new BorderLayout());
			
			buttons.setLayout(new GridLayout(2, 1));
			
			main.add(listeEpreuve, BorderLayout.CENTER);
			refreshListe();
			
			main.add(buttons, BorderLayout.EAST);
			
		}
	
	    public void refreshListe() {
		main.remove(listeEpreuve);
		String[] tabEpreuve = new String[(Epreuve.lesEpreuves).size()];
		 
        for (int i = 0; i < Epreuve.lesEpreuves.size(); i++) {
        	tabEpreuve[i] = Epreuve.lesEpreuves.get(i).getNomEpreuve();
        }
		
        listeEpreuve = new JList<String>(tabEpreuve);
		
		
		ActionListener[] listeners = SupprimerEpreuve.getActionListeners();
		for (ActionListener listener : listeners) {
			//SupprimerEquipe.removeActionListener(listener);
        }
		
		EcouteurBtnSupprimerEquipe clickSupprEquipe = new EcouteurBtnSupprimerEpreuve(listeEpreuve, this);
		SupprimerEpreuve.addActionListener(clickSupprEpreuve);
		
		EcouteurJListeEquipe clickListe = new EcouteurJListeEpreuve(SupprimerEpreuve);
		listeEpreuve.addListSelectionListener(clickListe);
		main.add(listeEpreuve, BorderLayout.CENTER);
	}

}
