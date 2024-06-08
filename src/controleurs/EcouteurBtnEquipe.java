package controleurs;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import vues.*;
/**
 *  @author Antonin
 */
public class EcouteurBtnEquipe implements ActionListener {
	//--------------------------
	// ATTRIBUTS
	//--------------------------
	Accueil old;
	PageEquipes pEquipe = new PageEquipes();
	//--------------------------
	// CONSTRUCTEUR
	//--------------------------
	
	/**
	 * Constructeur de la nouvelle fenetre apres appuis sur le bouton Equipe de la nav bar
	 * @param old
	 */
	public EcouteurBtnEquipe(Accueil old) {
		this.old = old;
	}
	
	public void actionPerformed(ActionEvent e) {
		old.changeView(pEquipe.main);
		pEquipe.main.updateUI();
		
	}
	
}
