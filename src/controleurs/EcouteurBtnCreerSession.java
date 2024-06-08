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
 * Classe de l'ecouteur du bouton Creer session
 *  @author alances
 */
public class EcouteurBtnCreerSession implements ActionListener {
	//--------------------------
	// ATTRIBUTS
	//--------------------------
	JButton valider;
	PageEpreuves page;
	JLabel nomSession;
	JLabel DateSession;
	JLabel HeureDebSession;
	JLabel HeureFinSession;
	JTextField Inputsession;
	JTextField InputDateSession;
	JTextField InputHeureDebSession;
	JTextField InputHeureFinSession;
	JPanel container = new JPanel();
	int index;
	//--------------------------
	// CONSTRUCTEUR
	//--------------------------
	
	/**
	 * Copnstructeur du pop up en bas de la page aprés appuie sur ajouter une session
	 * @param page
	 * @param index
	 */
	public EcouteurBtnCreerSession(PageEpreuves page, int index) {
		this.index = index;
		this.page = page;
		this.valider = new JButton("Valider");
		this.nomSession = new JLabel("Nom :");
		this.DateSession  = new JLabel("Date :");
		this.HeureDebSession  = new JLabel("Heure de debut :");
		this.HeureFinSession  = new JLabel("Heure de fin :");
		this.Inputsession = new JTextField(20);
		this.InputDateSession = new JTextField(8);
		this.InputHeureDebSession = new JTextField(20);
		this.InputHeureFinSession = new JTextField(20);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		BorderLayout layout = (BorderLayout) page.main.getLayout();
        Component southComponent = layout.getLayoutComponent(BorderLayout.SOUTH);
        if(southComponent != null) {
        	page.main.remove(southComponent);
        }
		
		creerSession(page.main);
		page.main.updateUI();
	}
	
	/**
	 * Cette methode permet de creer une session depuis l'application
	 * @param input
	 */
	private void creerSession(JPanel input) {
		
		container.removeAll();
		EcouteurValidCreerSession clickValid = new EcouteurValidCreerSession(this, page, index);
		valider.addActionListener(clickValid);
		
		container.add(nomSession);
		container.add(Inputsession);
		container.add(DateSession);
		container.add(InputDateSession);
		container.add(HeureDebSession);
		container.add(InputHeureDebSession);
		container.add(HeureFinSession);
		container.add(InputHeureFinSession);

		container.add(valider);
		input.add(container, BorderLayout.SOUTH);
	}
	
}
