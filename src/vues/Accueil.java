package vues;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import controleurs.*;

/**
 * Classe accueil 
 *  @author Antonin
 */

public class Accueil extends JPanel {
	//--------------------------
	// ATTRIBUTS
	//--------------------------
	JButton Equipes;
	JButton Epreuves;
	JButton Accueil;
	
	
	public JPanel main = new JPanel();
	Planning plan = new Planning();
	public JPanel top = new JPanel();
	
	//--------------------------
	// CONSTRUCTEUR
	//--------------------------
	
	/**
	 * Constructeur de la page d'acceuil
	 */
	public Accueil() {
		EcouteurBtnEquipe clickEquipe = new EcouteurBtnEquipe(this);
		
		EcouteurBtnAccueil clickPlanning = new EcouteurBtnAccueil(this);
		
		EcouteurBtnEpreuve clickEpreuve = new EcouteurBtnEpreuve(this);
		
		main.setLayout(new BorderLayout());
		
		top.setLayout(new BorderLayout());
		
		Equipes = new JButton("Equipes");
		Equipes.addActionListener(clickEquipe);
		
		Epreuves = new JButton("Epreuves");
		Epreuves.addActionListener(clickEpreuve);
		
		Accueil = new JButton("Accueil");
		Accueil.addActionListener(clickPlanning);
		this.changeView(plan.main);
		plan.rempliTableau();
		
		top.add(Equipes, BorderLayout.WEST);
		top.add(Accueil, BorderLayout.CENTER);
		top.add(Epreuves, BorderLayout.EAST);
		
		// Ajout de JPanel sur les cotes pour creer de la marge
		main.add(top, BorderLayout.NORTH);
		
	}
	//--------------------------
	// METHODES
	//--------------------------

	/**
	 * Méthode permettant de changer la fenetre afficher
	 * @param vue
	 */
	public void changeView(JPanel vue) {
		main.removeAll();
		main.add(top, BorderLayout.NORTH);
		main.add(vue, BorderLayout.CENTER);
	}
	
}
