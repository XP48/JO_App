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
		String h1="10h00";
		String h2="10h30";
		String h3="11h00";
		String h4="11h30";
		String h5="14h00";
		String h6="14h30";
		String h7="15h00";
		String h8="15h30";
		String h9="16h00";
		int x;
		int y;
		boolean test;
		
		Planning.setValueAt("JOURS/HEURES", 0, 0);
		Planning.setValueAt("Lundi 03/06/24", 1, 0);
		Planning.setValueAt("Mardi 04/06/24", 2, 0);
		Planning.setValueAt("Mercredi 05/06/24", 3, 0);
		Planning.setValueAt("Jeudi 06/06/24", 4, 0);
		Planning.setValueAt("Vendredi 07/06/24", 5, 0);
		Planning.setValueAt("Samedi 08/06/24", 6, 0);
		Planning.setValueAt("Dimanche 09/06/24", 7, 0);
		
		Planning.setValueAt(h1, 0, 1);
		Planning.setValueAt(h2, 0, 2);
		Planning.setValueAt(h3, 0, 3);
		Planning.setValueAt(h4, 0, 4);
		Planning.setValueAt(h5, 0, 5);
		Planning.setValueAt(h6, 0, 6);
		Planning.setValueAt(h7, 0, 7);
		Planning.setValueAt(h8, 0, 8);
		Planning.setValueAt(h9, 0, 9);
		
		System.out.println(Epreuve.lesEpreuves.size());
        for (int i = 0; i < Epreuve.lesEpreuves.size(); i++) {
        	for (int j = 0; j < Epreuve.lesEpreuves.get(i).sesSession.size(); j++) {
        		while (test)
        			{
        				
        				if (Epreuve.lesEpreuves.get(i).sesSession.get(j).getHeureDebutEpreuve() == );
        			}
        		System.out.println(Epreuve.lesEpreuves.get(i).sesSession.size());
                Planning.setValueAt(Epreuve.lesEpreuves.get(i).sesSession.get(j).getNomSession(), 5, 5);
            }
        }
	}
}
