package controleurs;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import vues.*;
import modeles.*;
import App.app;
/**
 *  @author Antonin
 */
public class EcouteurValidCreerEquipe implements ActionListener {
	//--------------------------
	// ATTRIBUTS
	//--------------------------
	EcouteurBtnCreerEquipe data;
	PageEquipes page;
	//--------------------------
	// CONSTRUCTEUR
	//--------------------------
	public EcouteurValidCreerEquipe(EcouteurBtnCreerEquipe data, PageEquipes page) {
		this.data = data;
		this.page = page;
	}
	
	public void actionPerformed(ActionEvent e) {
		new Equipe(data.InputNom.getText(), new Pays(data.InputPays.getText()));
		data.InputNom.setText("");
		data.InputPays.setText("");
		page.refreshListe();
		page.main.updateUI();
		
	}

}
