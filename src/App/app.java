package App;
import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import modeles.*;
import vues.*;
import controleurs.*;


public class app {

	public static void main(String[] args) {
		Athlete p = new Athlete("Portal", "Kylian");
		Equipe e = new Equipe("test", new Pays("t"));
		Epreuve Basket = new Epreuve ("Basket");
		Session Basket1 = new Session (Basket, "10/06/24", "10h00", "10h30", "Demi-Final NBA");
		Session Basket2 = new Session (Basket, "10/06/24", "11h00", "11h30", "Final NBA");
		// Creation de la fenetre de l'app
		JFrame app = new JFrame("JO_APP");
		
		// Taille de la fenetre
		app.setSize(1920, 1080);
		
		// Pour pouvoir fermer la fenetre
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Accueil acc = new Accueil();
		
		app.add(acc.main);
		app.pack();
		app.setVisible(true);
		
		
	}
}
