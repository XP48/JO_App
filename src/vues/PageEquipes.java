package vues;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import controleurs.*;
import modeles.*;

public class PageEquipes extends JPanel{
	
	
	public JPanel main = new JPanel();
	
	JPanel buttons = new JPanel();
	
	JButton CreerEquipe = new JButton("Créer une équipe");
	JButton SupprimerEquipe = new JButton("Supprimer une équipe");
	
	
	JList<String> listeEquipe;
		
	public PageEquipes() {
		
			EcouteurBtnCreerEquipe clickCreationEquipe = new EcouteurBtnCreerEquipe(main, this);
			
			main.setLayout(new BorderLayout());

			CreerEquipe.addActionListener(clickCreationEquipe);
			SupprimerEquipe.setEnabled(false);
			
			buttons.setLayout(new GridLayout(2, 1));
			
			buttons.add(CreerEquipe);
			buttons.add(SupprimerEquipe);
			
			//refreshListe();
			
			//main.add(listeEquipe, BorderLayout.CENTER);
			
			main.add(buttons, BorderLayout.EAST);
			
			
		}
	public void refreshListe() {
		String[] tabEquipes = new String[(Equipe.lesEquipes).size()];
		 
        for (int i = 0; i < Equipe.lesEquipes.size(); i++) {
            tabEquipes[i] = Equipe.lesEquipes.get(i).getNomEquipe();
        }
		
		listeEquipe = new JList<String>(tabEquipes);
		main.add(listeEquipe, BorderLayout.CENTER);
	}

}
