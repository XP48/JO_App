package modeles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Save implements Serializable {
	
	private static ArrayList<Athlete> lesAthletes = new ArrayList<Athlete>();
	private static ArrayList<Epreuve> lesEpreuves = new ArrayList<Epreuve>();
	private static ArrayList<Equipe> lesEquipes = new ArrayList<Equipe>();
	private static final long serialVersionUID = -1892561327013038124L;

	
	public void charger() throws IOException, ClassNotFoundException {
		
		
		File f = new File ("save.dat");
		Save sauvegarde = new Save();

		if (!f.exists()) {

			// Si le fichier save.dat n'existe pas 
			System.out.println ("Le fichier save.dat n'existe pas !");

			// Créer des objets
			System.out.println ("Creation de quelques films et ajout dans un objet favoris");
			/* Creer des epreuves des equipes et des athletes propres (3) */
			Epreuve t = new Epreuve("Break-Dance");
			Athlete test = new Athlete("Usain", "Bold");

			// Serialiser l'objet save : on le transforme en une SERIE d'octets qu'on écrit sur disque
			System.out.println ("Enregistrement de l'objet favoris sur disque");
			FileOutputStream fichier = new FileOutputStream("save.dat");
			ObjectOutputStream flotObjet = new ObjectOutputStream(fichier);
			flotObjet.writeObject(sauvegarde);
			flotObjet.close();
		} 
		else {
			// Si le fichier save.dat existe déjà
			System.out.println ("Le fichier save.dat existe !");
			FileInputStream fichier = new FileInputStream("save.dat");
			ObjectInputStream flotObjet = new ObjectInputStream(fichier);
			sauvegarde = (Save) (flotObjet.readObject());
			flotObjet.close();
						
			System.out.println ("Affichage de l'objet de type Favoris");
			System.out.println (sauvegarde);
			
			for(int i=0; i < sauvegarde.lesAthletes.size(); i++) {
				System.out.println(Athlete.lesAthletes.get(i).getNomAthlete());
				Athlete.lesAthletes.add(Athlete.lesAthletes.get(i));
				System.out.println(sauvegarde.lesAthletes.get(i).getNomAthlete());
			}
			for(int i=0; i < sauvegarde.lesEpreuves.size(); i++) {
				Epreuve.lesEpreuves.add(Epreuve.lesEpreuves.get(i));
			}
			for(int i=0; i < sauvegarde.lesEquipes.size(); i++) {
				Equipe.lesEquipes.add(Equipe.lesEquipes.get(i));
			}
			
		}

		
		
	}
	
	public void sauver() throws IOException, ClassNotFoundException{
		
		
		File f = new File ("save.dat");
		Save sauvegarde = new Save();
		
		for(int i=0; i < Athlete.lesAthletes.size(); i++) {
			sauvegarde.lesAthletes.add(Athlete.lesAthletes.get(i));
			System.out.println(sauvegarde.lesAthletes.get(i).getNomAthlete() + "here");
		}
		for(int i=0; i < Epreuve.lesEpreuves.size(); i++) {
			sauvegarde.lesEpreuves.add(Epreuve.lesEpreuves.get(i));
		}
		for(int i=0; i < Equipe.lesEquipes.size(); i++) {
			sauvegarde.lesEquipes.add(Equipe.lesEquipes.get(i));
		}
		
		FileOutputStream fichier = new FileOutputStream("save.dat");
		ObjectOutputStream flotObjet = new ObjectOutputStream(fichier);
		flotObjet.writeObject(sauvegarde);
		flotObjet.close();
	}
	
}
