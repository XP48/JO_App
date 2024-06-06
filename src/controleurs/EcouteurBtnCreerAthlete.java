package controleurs;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import modeles.Athlete;
import modeles.Pays;
import vues.*;
/**
 *  @author Antonin
 */
public class EcouteurBtnCreerAthlete implements ActionListener {
	//--------------------------
	// ATTRIBUTS
	//--------------------------
	JButton valider;
	AjoutAthlete page;
	JLabel titre;
	JLabel titreAthlete;
	JTextField InputNom;
	JTextField InputPrenom;
	JPanel container = new JPanel();
	//--------------------------
	// CONSTRUCTEUR
	//--------------------------
	public EcouteurBtnCreerAthlete(AjoutAthlete page) {
		this.page = page;
		this.valider = new JButton("Valider");
		this.titre  = new JLabel("Entrez le nom de la nouvelle athlète :");
		this.titreAthlete = new JLabel("Entrez le prénom du nouvel athlète :");
		this.InputNom = new JTextField(20);
		this.InputPrenom = new JTextField(20);
	}
	
	public void actionPerformed(ActionEvent e) {
		creerAthlete(page.main);
		page.main.updateUI();
	}
	
	private void creerAthlete(JPanel input) {
		
		container.removeAll();
		EcouteurValidCreerAthlete clickValid = new EcouteurValidCreerAthlete(this, page);
		valider.addActionListener(clickValid);
		
		container.add(titre);
		container.add(InputNom);
		container.add(titreAthlete);
		container.add(InputPrenom);
		container.add(valider);
		input.add(container, BorderLayout.SOUTH);
	}
	
}
