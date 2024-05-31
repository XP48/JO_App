package vues;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import controleurs.*;


public class Accueil extends JPanel {
	
	JButton Equipes;
	JButton Epreuves;
	JButton Accueil;
	
	
	public JPanel main = new JPanel();
	
	public JPanel top = new JPanel();
	
	
	public Accueil() {
			
		EcouteurBtnEquipe clickEquipe = new EcouteurBtnEquipe(this);
		
		EcouteurBtnAccueil clickPlanning = new EcouteurBtnAccueil(this);
		
		main.setLayout(new BorderLayout());
		
		top.setLayout(new BorderLayout());
		
		Equipes = new JButton("Equipes");
		Equipes.addActionListener(clickEquipe);

		
		Accueil = new JButton("Accueil");
		Accueil.addActionListener(clickPlanning);
		
		Epreuves = new JButton("Epreuves");
		
		top.add(Equipes, BorderLayout.WEST);
		top.add(Accueil, BorderLayout.CENTER);
		top.add(Epreuves, BorderLayout.EAST);
		
		// Ajout de JPanel sur les cotes pour creer de la marge
		main.add(top, BorderLayout.NORTH);
		
	}
	
	
	public void changeView(JPanel vue) {
		main.removeAll();
		main.add(top, BorderLayout.NORTH);
		main.add(vue, BorderLayout.CENTER);
	}
	
}
