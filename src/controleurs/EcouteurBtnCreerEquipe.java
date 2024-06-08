package controleurs;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import modeles.Equipe;
import modeles.Pays;
import vues.*;
/**
 *  @author Antonin
 */
public class EcouteurBtnCreerEquipe implements ActionListener {
	//--------------------------
	// ATTRIBUTS
	//--------------------------
	JButton valider;
	PageEquipes page;
	JLabel titre;
	JLabel titreequipe;
	JTextField InputNom;
	JTextField InputPays;
	JPanel container = new JPanel();
	//--------------------------
	// CONSTRUCTEUR
	//--------------------------
	/**
	 * Constructeur de l'ecouteur du bouton Creer Equipe
	 * @param page
	 */
	public EcouteurBtnCreerEquipe(PageEquipes page) {
		this.page = page;
		this.valider = new JButton("Valider");
		this.titre  = new JLabel("Entrez le nom de la nouvelle equipe :");
		this.titreequipe = new JLabel("Entrez le nom du pays de la nouvelle equipe :");
		this.InputNom = new JTextField(20);
		this.InputPays = new JTextField(20);
	}
	
	public void actionPerformed(ActionEvent e) {
		creerEquipe(page.main);
		page.main.updateUI();
	}
	
	/**
	 * Cette methode permet de creer une equipe depuis l'application
	 * @param input
	 */
	private void creerEquipe(JPanel input) {
		
		BorderLayout layout = (BorderLayout) page.main.getLayout();
        Component southComponent = layout.getLayoutComponent(BorderLayout.SOUTH);
        if(southComponent != null) {
        	page.main.remove(southComponent);
        }
		
		EcouteurValidCreerEquipe clickValid = new EcouteurValidCreerEquipe(this, page);
		valider.addActionListener(clickValid);
		
		container.add(titre);
		container.add(InputNom);
		container.add(titreequipe);
		container.add(InputPays);
		container.add(valider);
		input.add(container, BorderLayout.SOUTH);
	}
	
}
