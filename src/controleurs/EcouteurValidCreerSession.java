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
public class EcouteurValidCreerSession implements ActionListener {
	//--------------------------
	// ATTRIBUTS
	//--------------------------
	EcouteurBtnCreerSession data;
	PageEpreuves page;
	int index;
	//--------------------------
	// CONSTRUCTEUR
	//--------------------------
	public EcouteurValidCreerSession(EcouteurBtnCreerSession data, PageEpreuves page, int index) {
		this.data = data;
		this.page = page;
		this.index = index;
	}
	
	public void actionPerformed(ActionEvent e) {
		Epreuve E = Epreuve.lesEpreuves.get(index);
		new Session(E, data.InputDateSession.getText().toString(), data.InputHeureDebSession.getText(), data.InputHeureFinSession.getText(), data.Inputsession.getText());
		data.Inputsession.setText("");
		data.InputDateSession.setText("");
		data.InputHeureDebSession.setText("");
		data.InputHeureFinSession.setText("");
		page.refreshListe();
		page.main.updateUI();
	}

}