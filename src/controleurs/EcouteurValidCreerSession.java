package controleurs;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import vues.*;
import modeles.*;
import App.app;

public class EcouteurValidCreerSession implements ActionListener {
	
	EcouteurBtnCreerSession data;
	PageEpreuves page;
	int index;
	
	public EcouteurValidCreerSession(EcouteurBtnCreerSession data, PageEpreuves page, int index) {
		this.data = data;
		this.page = page;
		this.index = index;
	}
	
	public void actionPerformed(ActionEvent e) {
		Epreuve E = Epreuve.lesEpreuves.get(index);
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