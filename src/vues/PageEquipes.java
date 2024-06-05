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

public class PageEquipes extends JPanel{
	
	
	public JPanel main = new JPanel();
	
	JPanel buttons = new JPanel();
	
	JPanel affichage = new JPanel();
	
	JButton CreerEquipe = new JButton("Créer une équipe");
	public JButton SupprimerEquipe = new JButton("Supprimer l'équipe");
	public JButton AjouterAthlete = new JButton("Ajouter un athlète à l'équipe");
	
	JLabel titre = new JLabel("Nom de l'équipe | Nom du pays de l'équipe");
	
	
	JList<String> listeEquipe = new JList<String>();
		
	public PageEquipes() {
		
			EcouteurBtnCreerEquipe clickCreationEquipe = new EcouteurBtnCreerEquipe(this);
			
			main.setLayout(new BorderLayout());

			CreerEquipe.addActionListener(clickCreationEquipe);
			SupprimerEquipe.setEnabled(false);
			AjouterAthlete.setEnabled(false);
			
			buttons.setLayout(new GridLayout(3, 1));
			
			buttons.add(CreerEquipe);
			buttons.add(SupprimerEquipe);
			buttons.add(AjouterAthlete);
			
			//main.add(titre, BorderLayout.CENTER);
			//main.add(listeEquipe, BorderLayout.CENTER); INUTILE pour l'instant car au départ il n'y a aucune équipe
			refreshListe();

			
			main.add(buttons, BorderLayout.EAST);
			
			
		}
	public void refreshListe() {
		main.remove(listeEquipe);
		String[] tabEquipes = new String[(Equipe.lesEquipes).size()];
		 
        for (int i = 0; i < Equipe.lesEquipes.size(); i++) {
            tabEquipes[i] = "Equipe " + Equipe.lesEquipes.get(i).getNomEquipe() + " du Pays " + Equipe.lesEquipes.get(i).getSonPays().getNomPays();
        }
		
		listeEquipe = new JList<String>(tabEquipes);
		
		listeEquipe.setFont(new Font("Arial", Font.BOLD, 14));
		listeEquipe.setForeground(Color.BLUE);
		
		ActionListener[] listenersE = SupprimerEquipe.getActionListeners();
		for (ActionListener listener : listenersE) {
			SupprimerEquipe.removeActionListener(listener);
        }
		
		EcouteurBtnSupprimerEquipe clickSupprEquipe = new EcouteurBtnSupprimerEquipe(listeEquipe, this);
		SupprimerEquipe.addActionListener(clickSupprEquipe);
		
		EcouteurJListeEquipe clickListe = new EcouteurJListeEquipe(listeEquipe, this);
		listeEquipe.addListSelectionListener(clickListe);
		main.add(listeEquipe, BorderLayout.CENTER);
	}

}
