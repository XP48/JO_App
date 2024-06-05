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
		Epreuve E = new Epreuve(data.InputNom.getText());
		new Session(E, data.Inputsession.getText(), data.InputDateSession.getText(), data.InputHeureDebSession.getText(), data.InputHeureFinSession.getText());
		data.InputNom.setText("");
		data.Inputsession.setText("");
		data.InputDateSession.setText("");
		data.InputHeureDebSession.setText("");
		data.InputHeureFinSession.setText("");
		page.refreshListe();
		page.main.updateUI();
	}

}