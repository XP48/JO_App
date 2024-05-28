package controleurs;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import vues.*;

public class EcouteurBtnEquipe implements ActionListener {

	PageEquipes pageEquipe;
	JPanel old;
	
	public EcouteurBtnEquipe(JPanel old) {
		pageEquipe = new PageEquipes();
		this.old = old;
	}
	
	public void actionPerformed(ActionEvent e) {
		old.getParent().add(pageEquipe.main);
		old.getParent().remove(old);
		pageEquipe.main.updateUI();
	}
	
}
