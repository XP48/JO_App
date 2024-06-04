package controleurs;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import modeles.Equipe;
import modeles.Pays;
import vues.*;

public class EcouteurBtnCreerEquipe implements ActionListener {

	JButton valider;
	PageEquipes page;
	JLabel titre;
	JLabel titreequipe;
	JTextField InputNom;
	JTextField InputPays;
	JPanel container = new JPanel();
	
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
	
	private void creerEquipe(JPanel input) {
		
		container.removeAll();
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
