package controleurs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vues.*;

/**
 * Classe ecouteur du bouton accueil
 *  @author alances
 */
public class EcouteurBtnAccueil implements ActionListener {

	//--------------------------
	// ATTRIBUTS
	//--------------------------
	
	Accueil old;
	Planning plan = new Planning();
	//--------------------------
	// CONSTRUCTEUR
	//--------------------------
	
	public EcouteurBtnAccueil(Accueil old) {
		this.old = old;
	}
	
	public void actionPerformed(ActionEvent e) {
		old.changeView(plan.main);
		plan.rempliTableau();
		plan.main.updateUI();
		
	}
	
}
