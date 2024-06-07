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
