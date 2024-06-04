package vues;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import controleurs.*;
import modeles.*;



public class Planning extends JPanel {
	
	JTable Planning;	
	
	public JPanel main = new JPanel();	
	
	public Planning() {
		
		main.setLayout(new BorderLayout());
		
		Planning = new JTable(8,10);
		
		main.add(Planning, BorderLayout.CENTER);
		
	}
	
	public void rempliTableau() {
		Planning.setValueAt("JOURS/HEURES", 0, 0);
		Planning.setValueAt("Lundi", 1, 0);
		Planning.setValueAt("Mardi", 2, 0);
		Planning.setValueAt("Mercredi", 3, 0);
		Planning.setValueAt("Jeudi", 4, 0);
		Planning.setValueAt("Vendredi", 5, 0);
		Planning.setValueAt("Samedi", 6, 0);
		Planning.setValueAt("Dimanche", 7, 0);
		
		Planning.setValueAt("10h00", 0, 1);
		Planning.setValueAt("10h30", 0, 2);
		Planning.setValueAt("11h00", 0, 3);
		Planning.setValueAt("11h30", 0, 4);
		Planning.setValueAt("14h00", 0, 5);
		Planning.setValueAt("14h30", 0, 6);
		Planning.setValueAt("15h00", 0, 7);
		Planning.setValueAt("15h30", 0, 8);
		Planning.setValueAt("16h00", 0, 9);
		
		System.out.println(Epreuve.lesEpreuves.size());
        for (int i = 0; i < Epreuve.lesEpreuves.size(); i++) {
        	for (int j = 0; j < Epreuve.lesEpreuves.get(i).sesSession.size(); j++) {
                Planning.setValueAt(Epreuve.lesEpreuves.get(i).sesSession.get(j), 5, 5);
            }
        }
	}
}
