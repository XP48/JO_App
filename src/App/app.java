package App;
import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import modeles.*;
import vues.*;
import controleurs.*;


public class app {

	public static void main(String[] args) {
		
		// Creation de la fenetre de l'app
		JFrame app = new JFrame("JO_APP");
		
		// Taille de la fenetre
		app.setSize(800, 200);
		
		// Demarrer en plein écran
		app.setSize(1500, 1500);
		
		// Pour pouvoir fermer la fenetre
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Accueil acc = new Accueil();
		
		app.add(acc.main);
		app.pack();
		app.setVisible(true);
		
		
	}
}
