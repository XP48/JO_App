package vues;
import javax.swing.*;
import java.awt.BorderLayout;


public class Accueil extends JPanel {
	
	JTable Planning;
	JButton Equipes;
	JButton Epreuves;
	
	
	public JPanel main = new JPanel();
	
	
	public Accueil() {
		
		main.setLayout(new BorderLayout());
		
		Planning = new JTable(10,5);
		
		main.add(Planning, BorderLayout.CENTER);
		
		// Ajout de JPanel sur les cotes pour creer de la marge
		main.add(new JPanel(), BorderLayout.NORTH);
		main.add(new JPanel(), BorderLayout.WEST);
		
	}
	
	
}
