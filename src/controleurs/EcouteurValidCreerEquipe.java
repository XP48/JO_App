package controleurs;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import vues.*;
import modeles.*;
import App.app;

public class EcouteurValidCreerEquipe implements ActionListener {
	
	String NomEquipe;
	String Pays;
	
	public EcouteurValidCreerEquipe(JTextField NomEquipe, JTextField Pays) {
		this.NomEquipe = NomEquipe.getText();
		this.Pays = Pays.getText();
	}
	
	public void actionPerformed(ActionEvent e) {
		new Equipe(NomEquipe, new Pays(Pays));
		System.out.println("Equipe creee");
	}

}
