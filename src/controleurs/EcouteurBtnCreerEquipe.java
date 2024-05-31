package controleurs;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import vues.*;

public class EcouteurBtnCreerEquipe implements ActionListener {

	JPanel panneau;
	
	public EcouteurBtnCreerEquipe(JPanel panneau) {
		this.panneau = panneau;
	}
	
	public void actionPerformed(ActionEvent e) {
		creerEquipe(panneau);
		panneau.updateUI();
	}
	
	private void creerEquipe(JPanel input) {
		
		
		JPanel container = new JPanel();
		JLabel titre = new JLabel("Entrez le nom de la nouvelle equipe :");
		JTextField InputNom = new JTextField(20);
		JTextField InputPays = new JTextField(20);
		JButton valider = new JButton("Valider");
		
		EcouteurValidCreerEquipe clickValid = new EcouteurValidCreerEquipe(InputNom, InputPays);
		valider.addActionListener(clickValid);
		
		container.add(titre);
		container.add(InputNom);
		container.add(InputPays);
		container.add(valider);
		input.add(container, BorderLayout.SOUTH);
	}
	
}
