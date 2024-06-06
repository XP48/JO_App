package controleurs;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import modeles.Epreuve;
import modeles.Session;
import vues.*;

/**
 * Classe EcouteurBtnCreerEpreuve
 * @author aksanti
 *
 */

public class EcouteurBtnCreerEpreuve implements ActionListener {

	JButton valider;
	PageEpreuves page;
	JLabel titre;
	JTextField InputNom;
	JPanel container = new JPanel();
	
	public EcouteurBtnCreerEpreuve(PageEpreuves page) {
		this.page = page;
		this.valider = new JButton("Valider");
		this.titre  = new JLabel("Entrez le nom de la nouvelle épreuve :");
		this.InputNom = new JTextField(20);
	}
	
	public void actionPerformed(ActionEvent e) {
		creerEpreuve(page.main);
		page.main.updateUI();
	}
	
	private void creerEpreuve(JPanel input) {
		
		BorderLayout layout = (BorderLayout) page.main.getLayout();
        Component southComponent = layout.getLayoutComponent(BorderLayout.SOUTH);
        if(southComponent != null) {
        	page.main.remove(southComponent);
        }
        
		EcouteurValidCreerEpreuve clickValid = new EcouteurValidCreerEpreuve(this, page);
		valider.addActionListener(clickValid);
		
		container.add(titre);
		container.add(InputNom);
		container.add(valider);
		input.add(container, BorderLayout.SOUTH);
	}
	
}