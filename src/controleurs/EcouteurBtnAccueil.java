package controleurs;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import vues.*;

public class EcouteurBtnAccueil implements ActionListener {

	Accueil pageAccueil;
	JPanel old;
	
	public EcouteurBtnAccueil(JPanel old) {
		pageAccueil = new Accueil();
		this.old = old;
	}
	
	public void actionPerformed(ActionEvent e) {
		old.getParent().add(pageAccueil.main);
		old.getParent().remove(old);
		pageAccueil.main.updateUI();
	}
	
}
