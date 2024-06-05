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
	JLabel DateSession;
	JLabel HeureDebSession;
	JLabel HeureFinSession;
	JTextField InputNom;
	JTextField Inputsession;
	JTextField InputDateSession;
	JTextField InputHeureDebSession;
	JTextField InputHeureFinSession;
	JPanel container = new JPanel();
	
	public EcouteurBtnCreerEpreuve(PageEpreuves page) {
		this.page = page;
		this.valider = new JButton("Valider");
		this.titre  = new JLabel("Entrez le nom de la nouvelle épreuve :");
		this.titreepreuve = new JLabel("Entrez le nom de la session de la nouvelle épreuve :");
		this.DateSession  = new JLabel("Entrez la date de la Session :");
		this.HeureDebSession  = new JLabel("Entrez l'heure de debut de la Session :");
		this.HeureFinSession  = new JLabel("Entrez l'heure de fin de la Session :");
		this.InputNom = new JTextField(20);
		this.Inputsession = new JTextField(20);
		this.InputDateSession = new JTextField(20);
		this.InputHeureDebSession = new JTextField(20);
		this.InputHeureFinSession = new JTextField(20);
	}
	
	public void actionPerformed(ActionEvent e) {
		creerEpreuve(page.main);
		page.main.updateUI();
	}
	
	private void creerEpreuve(JPanel input) {
		
		container.removeAll();
		EcouteurValidCreerEpreuve clickValid = new EcouteurValidCreerEpreuve(this, page);
		valider.addActionListener(clickValid);
		
		container.add(titre);
		container.add(InputNom);
		container.add(titreepreuve);
		container.add(Inputsession);
		container.add(InputDateSession);
		container.add(InputHeureDebSession);
		container.add(InputHeureFinSession);
		container.add(valider);
		input.add(container, BorderLayout.SOUTH);
	}
	
}