package vues;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import controleurs.*;

public class PageEquipes extends JPanel{
	
	
	public JPanel main = new JPanel();
	JLabel t = new JLabel("test");
		
	public PageEquipes() {
			
<<<<<<< HEAD
			main.setLayout(new GridLayout(2,1));
			main.add(t);
			
=======
			//EcouteurBtnAccueil clickAccueil = new EcouteurBtnAccueil(main);
		
			main.setLayout(new BorderLayout());
			
			top.setLayout(new BorderLayout());
			
			PanneauCentral.setLayout(new GridLayout(2,1));
			
			
			Accueil = new JButton("Accueil");
			//Accueil.addActionListener(clickAccueil);
			
			Equipes = new JButton("Equipes");
			Equipes.setEnabled(false);

			Epreuves = new JButton("Epreuves");
			
			main.add(PanneauCentral, BorderLayout.CENTER);
			
			top.add(Accueil, BorderLayout.WEST);
			top.add(Equipes, BorderLayout.CENTER);
			top.add(Epreuves, BorderLayout.EAST);
			
			main.add(top, BorderLayout.NORTH);
>>>>>>> bb2c7444e05a1d58a5a026466bc068aef2d65a97
			
		}

}
