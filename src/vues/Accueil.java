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
<<<<<<< HEAD
		Equipes.addActionListener(clickEquipe);

=======
		Epreuves = new JButton("Epreuves");
		
		Equipes.addActionListener(clickEquipe);
		Epreuves.addActionListener(clickEquipe);
>>>>>>> bb2c7444e05a1d58a5a026466bc068aef2d65a97
		
		Accueil = new JButton("Accueil");
		Accueil.addActionListener(clickPlanning);
		
		
		
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
