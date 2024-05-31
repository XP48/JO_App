package controleurs;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import vues.*;

public class EcouteurBtnEquipe implements ActionListener {

	Accueil old;
	PageEquipes pEquipe = new PageEquipes();
	
	public EcouteurBtnEquipe(Accueil old) {
		this.old = old;
	}
	
	public void actionPerformed(ActionEvent e) {
		old.changeView(pEquipe.main);
		pEquipe.main.updateUI();
		
	}
	
}
