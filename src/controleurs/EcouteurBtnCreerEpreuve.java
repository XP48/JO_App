package controleurs;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import modeles.Epreuve;
import modeles.Session;
import vues.*;

public class EcouteurBtnCreerEpreuve implements ActionListener {

	JButton valider;
	PageEpreuves page;
	JLabel titre;
	JLabel titreepreuve;
	JTextField InputNom;
	JTextField Inputsession;
	JPanel container = new JPanel();
	
	public EcouteurBtnCreerEpreuve(PageEpreuves page) {
		this.page = page;
		this.valider = new JButton("Valider");
		this.titre  = new JLabel("Entrez le nom de la nouvelle épreuve :");
		this.titreepreuve = new JLabel("Entrez le nom du pays de la nouvelle épreuve :");
		this.InputNom = new JTextField(20);
		this.Inputsession = new JTextField(20);
	}
	
	public void actionPerformed(ActionEvent e) {
		creerEpreuve(page.main);
		page.main.updateUI();
	}
	
	private void creerEpreuve(JPanel input) {
		
		container.removeAll();
		EcouteurValidCreerEquipe clickValid = new EcouteurValidCreerEpreuve(this, page);
		valider.addActionListener(clickValid);
		
		container.add(titre);
		container.add(InputNom);
		container.add(titreepreuve);
		container.add(Inputsession);
		container.add(valider);
		input.add(container, BorderLayout.SOUTH);
	}
	
}
