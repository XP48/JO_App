package controleurs;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import vues.*;
import modeles.*;
import App.app;

public class EcouteurValidCreerEpreuve implements ActionListener {
	
	EcouteurBtnCreerEpreuve data;
	PageEpreuves page;
	
	public EcouteurValidCreerEpreuve(EcouteurBtnCreerEpreuve data, PageEpreuves page) {
		this.data = data;
		this.page = page;
	}
	
	public void actionPerformed(ActionEvent e) {
		new Epreuve(data.InputNom.getText(), new Session(data.InputSession.getText()));
		data.InputNom.setText("");
		data.InputSession.setText("");
		page.refreshListe();
		page.main.updateUI();
	}

}