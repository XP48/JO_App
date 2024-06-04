package vues;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import controleurs.*;
import modeles.*;

public class AjoutAthlete {
	
public JPanel main = new JPanel();
	
	JPanel buttons = new JPanel();
	
	JPanel affichage = new JPanel();
	
	JButton CreerAthlete = new JButton("Créer une équipe");
	public JButton SupprimerAthlete = new JButton("Supprimer l'équipe");
	public JButton AjouterAthlete = new JButton("Ajouter un athlète à l'équipe");
	
	JLabel titre = new JLabel("Nom de l'équipe | Nom du pays de l'équipe");
	
	
	JList<String> listeAthlete = new JList<String>();
		
	public AjoutAthlete() {
		
			EcouteurBtnCreerAthlete clickCreationAthlete = new EcouteurBtnCreerAthlete(this);
			
			main.setLayout(new BorderLayout());

			CreerAthlete.addActionListener(clickCreationAthlete);
			SupprimerAthlete.setEnabled(false);
			AjouterAthlete.setEnabled(false);
			
			buttons.setLayout(new GridLayout(3, 1));
			
			buttons.add(CreerAthlete);
			buttons.add(SupprimerAthlete);
			buttons.add(AjouterAthlete);
			System.out.println(Athlete.lesAthletes.size());
			//main.add(titre, BorderLayout.CENTER);
			//main.add(listeAthlete, BorderLayout.CENTER); INUTILE pour l'instant car au départ il n'y a aucune équipe
			refreshListe();

			
			main.add(buttons, BorderLayout.EAST);
			
			
		}
	public void refreshListe() {
		main.remove(listeAthlete);
		String[] tabAthletes = new String[(Athlete.lesAthletes).size()];
		 
        for (int i = 0; i < Athlete.lesAthletes.size(); i++) {
            tabAthletes[i] = "Athlete " + Athlete.lesAthletes.get(i).getPrenomAthlete() + " " + Athlete.lesAthletes.get(i).getNomAthlete();
        }
		
		listeAthlete = new JList<String>(tabAthletes);
		
		listeAthlete.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		listeAthlete.setForeground(Color.BLUE);
		
		ActionListener[] listenersE = SupprimerAthlete.getActionListeners();
		for (ActionListener listener : listenersE) {
			SupprimerAthlete.removeActionListener(listener);
        }
		
		ActionListener[] listenersA = AjouterAthlete.getActionListeners();
		for (ActionListener listener : listenersA) {
			AjouterAthlete.removeActionListener(listener);
        }
		
		EcouteurBtnSupprimerAthlete clickSupprAthlete = new EcouteurBtnSupprimerAthlete(listeAthlete, this);
		SupprimerAthlete.addActionListener(clickSupprAthlete);
		
		//EcouteurBtnAjoutAthlete clickAjoutAthlete = new EcouteurBtnAjoutAthlete(listeAthlete, this);
		//AjouterAthlete.addActionListener(clickAjoutAthlete);
		
		EcouteurJListeAthlete clickListe = new EcouteurJListeAthlete(this);
		listeAthlete.addListSelectionListener(clickListe);
		main.add(listeAthlete, BorderLayout.CENTER);
	}
	
}