package vues;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import controleurs.*;
import modeles.*;

/**
 *  @author Iliann
 */

public class Planning extends JPanel {
	//--------------------------
	// ATTRIBUTS
	//--------------------------
	JTable Planning;
	private int hauteur = 18;
	private int longeur = 23;
	
	
	public JPanel main = new JPanel();	
	//--------------------------
	// CONSTRUCTEUR
	//--------------------------
	public Planning() {
		
		main.setLayout(new BorderLayout());
		
		Planning = new JTable(hauteur,longeur);
		
		main.add(Planning, BorderLayout.CENTER);
		
	}
	//--------------------------
	// METHODES
	//--------------------------


	
	public void rempliTableau() 
	{
		
		Planning.setValueAt("JOURS/HEURES", 0, 0);
		Planning.setValueAt("26/07/24", 1, 0);
		Planning.setValueAt("27/07/24", 2, 0);
		Planning.setValueAt("28/07/24", 3, 0);
		Planning.setValueAt("29/07/24", 4, 0);
		Planning.setValueAt("30/07/24", 5, 0);
		Planning.setValueAt("31/07/24", 6, 0);
		Planning.setValueAt("01/08/24", 7, 0);
		Planning.setValueAt("02/08/24", 8, 0);
		Planning.setValueAt("03/08/24", 9, 0);
		Planning.setValueAt("04/08/24", 10, 0);
		Planning.setValueAt("05/08/24", 11, 0);
		Planning.setValueAt("06/08/24", 12, 0);
		Planning.setValueAt("07/08/24", 13, 0);
		Planning.setValueAt("08/08/24", 14, 0);
		Planning.setValueAt("09/08/24", 15, 0);
		Planning.setValueAt("10/08/24", 16, 0);
		Planning.setValueAt("11/08/24", 17, 0);
		
		
		Planning.setValueAt("9h00", 0, 1);
		Planning.setValueAt("9h30", 0, 2);
		Planning.setValueAt("10h00", 0, 3);
		Planning.setValueAt("10h30", 0, 4);
		Planning.setValueAt("11h00", 0, 5);
		Planning.setValueAt("11h30", 0, 6);
		Planning.setValueAt("12h00", 0, 7);
		Planning.setValueAt("12h30", 0, 8);
		Planning.setValueAt("13h00", 0, 9);
		Planning.setValueAt("13h30", 0, 10);
		Planning.setValueAt("14h00", 0, 11);
		Planning.setValueAt("14h30", 0, 12);
		Planning.setValueAt("15h00", 0, 13);
		Planning.setValueAt("15h30", 0, 14);
		Planning.setValueAt("16h00", 0, 15);
		Planning.setValueAt("16h30", 0, 16);
		Planning.setValueAt("17h00", 0, 17);
		Planning.setValueAt("17h30", 0, 18);
		Planning.setValueAt("18h00", 0, 19);
		Planning.setValueAt("18h30", 0, 20);
		Planning.setValueAt("19h00", 0, 21);
		Planning.setValueAt("19h30", 0, 22);
		
		
        for (int i = 0; i < Epreuve.lesEpreuves.size(); i++) 
        {
        	for (int j = 0; j < Epreuve.lesEpreuves.get(i).sesSession.size(); j++) 
        	{
        		Session elem = Epreuve.lesEpreuves.get(i).sesSession.get(j);
        		for (int k = 1; k < hauteur; k++) 
				{
        			if (elem.getHeureDebutEpreuve().equals(Planning.getValueAt(0, k)))
    				{
        				for (int l = 1; l < longeur; l++) 
        				{
            				if (elem.getDateSession().equals(Planning.getValueAt(l, 0)))
            				{
            						Planning.setValueAt(elem.getNomSession(), l, k);
            					
            				}
    				}
        			
    				}
				}  
            }
        } 
	}
}
