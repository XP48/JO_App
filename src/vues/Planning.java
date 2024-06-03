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
		
		Planning = new JTable(10,5);
		
		main.add(Planning, BorderLayout.CENTER);
		
	}
	
	public void rempliTableau() {
		Planning.setValueAt("Lundi", 0, 0);
		Planning.setValueAt("Mardi", 0, 1);
		Planning.setValueAt("Mercredi", 0, 2);
		Planning.setValueAt("Jeudi", 0, 3);
		Planning.setValueAt("Vendredi", 0, 4);
		Planning.setValueAt("Samedi", 0, 5);
		Planning.setValueAt("Dimanche", 0, 6);
		
		/*String[] tabSession = new String[(Session.EpreuveExistante).size()];
		 
        for (int i = 0; i < Session.EpreuveExistante.size(); i++) {
            tabSession[i] = Session.EpreuveExistante.get(i).getnomEpreuve();
        }*/
	}
	
	
}
