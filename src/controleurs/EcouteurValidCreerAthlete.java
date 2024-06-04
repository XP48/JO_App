package controleurs;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import vues.*;
import modeles.*;
import App.app;

public class EcouteurValidCreerAthlete implements ActionListener {
	
	EcouteurBtnCreerAthlete data;
	AjoutAthlete page;
	
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
