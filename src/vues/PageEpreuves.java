package vues;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import controleurs.*;

public class PageEpreuves extends JPanel{
	
	JButton Equipes;
	JButton Epreuves;
	JButton Accueil;
	
	
	public JPanel main = new JPanel();
	
	public JPanel top = new JPanel();
	
	public JPanel PanneauCentral = new JPanel();
		
	public PageEpreuves() {
			
			//EcouteurBtnAccueil clickAccueil = new EcouteurBtnAccueil(main);
		
			main.setLayout(new BorderLayout());
			
			top.setLayout(new BorderLayout());
			
			PanneauCentral.setLayout(new GridLayout(2,1));
			
			
			Accueil = new JButton("Accueil");
			//Accueil.addActionListener(clickAccueil);
			
			Epreuves = new JButton("Epreuves");
			Epreuves.setEnabled(false);

			Equipes = new JButton("Equipes");
			
			main.add(PanneauCentral, BorderLayout.CENTER);
			
			
			top.add(Accueil, BorderLayout.WEST);
			top.add(Epreuves, BorderLayout.CENTER);
			top.add(Equipes, BorderLayout.EAST);
			main.add(top, BorderLayout.NORTH);
			
		}

}
