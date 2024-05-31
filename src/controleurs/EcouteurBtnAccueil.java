package controleurs;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import vues.*;

public class EcouteurBtnAccueil implements ActionListener {

	Accueil old;
	Planning plan = new Planning();
	
	public EcouteurBtnAccueil(Accueil old) {
		this.old = old;
	}
	
	public void actionPerformed(ActionEvent e) {
		old.changeView(plan.main);
		plan.main.updateUI();
	}
	
}
