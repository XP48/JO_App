package vues;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import controleurs.*;


public class Accueil extends JPanel {
	
	JTable Planning;
	JButton Equipes;
	JButton Epreuves;
	JButton Accueil;
	
	
	public JPanel main = new JPanel();
	
	JPanel top = new JPanel();
	
	
	public Accueil() {
				
		EcouteurBtnEquipe clickEquipe = new EcouteurBtnEquipe(main);
		
		main.setLayout(new BorderLayout());
		
		top.setLayout(new BorderLayout());
		
		Planning = new JTable(10,5);
		
		Equipes = new JButton("Equipes");
		Epreuves = new JButton("Epreuves");
		
		Equipes.addActionListener(clickEquipe);
		Epreuves.addActionListener(clickEquipe);
		
		Accueil = new JButton("Accueil");
		Accueil.setEnabled(false);
		
		
		
		main.add(Planning, BorderLayout.CENTER);
		
		top.add(Equipes, BorderLayout.WEST);
		top.add(Accueil, BorderLayout.CENTER);
		top.add(Epreuves, BorderLayout.EAST);
		
		// Ajout de JPanel sur les cotes pour creer de la marge
		main.add(top, BorderLayout.NORTH);
		
	}
	
	
}
