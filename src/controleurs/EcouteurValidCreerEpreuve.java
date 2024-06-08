package controleurs;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import vues.*;
import modeles.*;
import App.app;

/**
 * Classe ecouteur du bouton valider de la creation d'une epreuve
 * @author aksanti
 *
 */

public class EcouteurValidCreerEpreuve implements ActionListener {
	
	EcouteurBtnCreerEpreuve data;
	PageEpreuves page;
	
	public EcouteurValidCreerEpreuve(EcouteurBtnCreerEpreuve data, PageEpreuves page) {
		this.data = data;
		this.page = page;
	}
	
	public void actionPerformed(ActionEvent e) {
		Epreuve E = new Epreuve(data.InputNom.getText());
		data.InputNom.setText("");
		page.refreshListe();
		page.main.updateUI();
	}

}