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
		Equipe e = new Equipe("Gentle mates", new Pays("France"));
		Epreuve Basket = new Epreuve ("Basket");
		Session Basket1 = new Session (Basket, "06/06/24", "14", "15", "Demi-Final NBA");
		Session Basket2 = new Session (Basket, "08/06/24", "16", "17", "Final NBA");
		
		Epreuve Nat = new Epreuve("Natation");
		Session nat = new Session(Nat, "07/06/24", "15","16","Final 400M");
		// Creation de la fenetre de l'app
		JFrame app = new JFrame("JO_APP");
		
		
		// Taille de la fenetre
		app.setSize(1920, 1080);
		
		// Pour pouvoir fermer la fenetre
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Accueil acc = new Accueil();
		
		app.addWindowListener(new Serilization());
		app.add(acc.main);
		app.setVisible(true);
		
		
	}
}
