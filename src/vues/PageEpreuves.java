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
	
	
	public JPanel main = new JPanel();
	
	JPanel buttons = new JPanel();
	
	JPanel affichage = new JPanel();
	
	public JPanel grid = new JPanel();
	
	JButton CreerEpreuve = new JButton("Créer une épreuve");
	public JButton CreerSession = new JButton("Créer une Session à l'épreuve");
	public JButton SupprimerEpreuve = new JButton("Supprimer l'épreuve");
	public JButton AjouterSession = new JButton("Ajouter une session à l'épreuve");
	
	public JLabel titreEpreuve = new JLabel("Nom de l'épreuve");
	public JLabel titreSession = new JLabel("Nom des sessions");
	
	
	public JList<String> listeEpreuve = new JList<String>();
		
	public PageEpreuves() {
		
			EcouteurBtnCreerEpreuve clickCreationEpreuve = new EcouteurBtnCreerEpreuve(this);
			
			main.setLayout(new BorderLayout());
			
			grid.setLayout(new GridLayout(1, 2));

			CreerEpreuve.addActionListener(clickCreationEpreuve);
			SupprimerEpreuve.setEnabled(false);
			CreerSession.setEnabled(false);
			
			buttons.setLayout(new GridLayout(3, 1));
			
			buttons.add(CreerEpreuve);
			buttons.add(SupprimerEpreuve);
			buttons.add(CreerSession);
			
			//main.add(titre, BorderLayout.CENTER);
			//main.add(listeEpreuve, BorderLayout.CENTER); INUTILE pour l'instant car au départ il n'y a aucune épreuve
			refreshListe();

			
			main.add(buttons, BorderLayout.EAST);
			
			
		}
	public void refreshListe() {
		main.remove(listeEpreuve);
		String[] tabEpreuve = new String[(Epreuve.lesEpreuves).size()];
		 
		for (int i = 0; i < Epreuve.lesEpreuves.size(); i++) 
        {
			tabEpreuve[i] = Epreuve.lesEpreuves.get(i).getnomEpreuve();
        }
		
		listeEpreuve = new JList<String>(tabEpreuve);
		
		listeEpreuve.setFont(new Font("Arial", Font.BOLD, 14));
		listeEpreuve.setForeground(Color.BLUE);
		
		ActionListener[] listenersE = SupprimerEpreuve.getActionListeners();
		for (ActionListener listener : listenersE) {
			SupprimerEpreuve.removeActionListener(listener);
        }
		
		EcouteurBtnSupprimerEpreuve clickSupprEpreuve = new EcouteurBtnSupprimerEpreuve(listeEpreuve, this);
		SupprimerEpreuve.addActionListener(clickSupprEpreuve);
		
		EcouteurJListeEpreuve clickListe = new EcouteurJListeEpreuve(listeEpreuve, this);
		listeEpreuve.addListSelectionListener(clickListe);
		grid.removeAll();
		grid.add(listeEpreuve);
		main.add(grid, BorderLayout.CENTER);
	}

}