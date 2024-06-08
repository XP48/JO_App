package controleurs;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import vues.*;
import modeles.*;
import App.app;
/**
 * Classe Ecouteur du bouton valider de la creation d'un athlete
 *  @author alances
 */
public class EcouteurValidCreerAthlete implements ActionListener {
	//--------------------------
	// ATTRIBUTS
	//--------------------------
	EcouteurBtnCreerAthlete data;
	AjoutAthlete page;
	//--------------------------
	// CONSTRUCTEUR
	//--------------------------
	public EcouteurValidCreerAthlete(EcouteurBtnCreerAthlete data, AjoutAthlete page) {
		this.data = data;
		this.page = page;
	}
	
	public void actionPerformed(ActionEvent e) {
		new Athlete(data.InputNom.getText(), data.InputPrenom.getText());
		data.InputNom.setText("");
		data.InputPrenom.setText("");
		page.refreshListe();
		page.main.updateUI();
	}

}
