package vues;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import controleurs.*;

public class PageEquipes extends JPanel{
	
	
	public JPanel main = new JPanel();
	
	JPanel buttons = new JPanel();
	
	JButton CreerEquipe = new JButton("Créer une équipe");
	JButton SupprimerEquipe = new JButton("Supprimer une équipe");
	
	
	JList<String> listeEquipe;
		
	public PageEquipes() {
			
			main.setLayout(new BorderLayout());

			SupprimerEquipe.setEnabled(false);
			
			buttons.add(CreerEquipe);
			buttons.add(SupprimerEquipe);
			
			String [] tabLivres = {"Au guet !", "La Huitieme Couleur", "Le Dernier Restaurant avant la fin du monde", "Le Guide du voyageur galactique", "Mortimer", "Sandman : Préludes et Nocturnes"};
			
			
			listeEquipe = new JList<String>(tabLivres);
			
			
			main.add(listeEquipe, BorderLayout.CENTER);
			
			main.add(buttons, BorderLayout.EAST);
			
		}

}
