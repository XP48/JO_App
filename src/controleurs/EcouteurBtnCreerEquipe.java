package controleurs;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import modeles.Equipe;
import modeles.Pays;
import vues.*;

public class EcouteurBtnCreerEquipe implements ActionListener {

	JPanel panneau;
	JButton valider = new JButton("Valider");
	PageEquipes page;
	JLabel titre = new JLabel("Entrez le nom de la nouvelle equipe :");
	JTextField InputNom = new JTextField(20);
	JTextField InputPays = new JTextField(20);
	
	public EcouteurBtnCreerEquipe(JPanel panneau, PageEquipes page) {
		this.panneau = panneau;
		this.page = page;
	}
	
	public void actionPerformed(ActionEvent e) {
		creerEquipe(panneau);
		panneau.updateUI();
	}
	
	private void creerEquipe(JPanel input) {
		
		
		JPanel container = new JPanel();
		EcouteurValidCreerEquipe clickValid = new EcouteurValidCreerEquipe(this, page);
		valider.addActionListener(clickValid);
		
		container.add(titre);
		container.add(InputNom);
		container.add(InputPays);
		container.add(valider);
		input.add(container, BorderLayout.SOUTH);
	}
	
}
