package vues;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class PageEquipes extends JPanel{
	
	JButton Equipes;
	JButton Epreuves;
	JButton Accueil;
	
	
	public JPanel main = new JPanel();
	
	JPanel top = new JPanel();
	
	JPanel PanneauCentral = new JPanel();
	
	public PageEquipes() {
			
			main.setLayout(new BorderLayout());
			
			top.setLayout(new BorderLayout());
			
			PanneauCentral.setLayout(new GridLayout(2,1));
			
			Equipes = new JButton("Equipes");
			
			Accueil = new JButton("Accueil");
			Accueil.setEnabled(false);
			
			Epreuves = new JButton("Epreuves");
			
			main.add(PanneauCentral, BorderLayout.CENTER);
			
			top.add(Accueil, BorderLayout.CENTER);
			top.add(Equipes, BorderLayout.WEST);
			top.add(Epreuves, BorderLayout.EAST);
			
			// Ajout de JPanel sur les cotes pour creer de la marge
			main.add(top, BorderLayout.NORTH);
			main.add(new JPanel(), BorderLayout.WEST);
			
		}

}
