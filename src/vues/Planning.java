package vues;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import controleurs.*;
import modeles.*;



public class Planning extends JPanel {
	
	JTable Planning;
	private int hauteur = 8;
	private int longeur = 12;
	
	public JPanel main = new JPanel();	
	
	public Planning() {
		
		main.setLayout(new BorderLayout());
		
		Planning = new JTable(hauteur,longeur);
		
		main.add(Planning, BorderLayout.CENTER);
		
	}
	
	public void rempliTableau() 
	{
		
		Planning.setValueAt("JOURS/HEURES", 0, 0);
		Planning.setValueAt("03/06/24", 1, 0);
		Planning.setValueAt("04/06/24", 2, 0);
		Planning.setValueAt("05/06/24", 3, 0);
		Planning.setValueAt("06/06/24", 4, 0);
		Planning.setValueAt("07/06/24", 5, 0);
		Planning.setValueAt("08/06/24", 6, 0);
		Planning.setValueAt("09/06/24", 7, 0);
		
		Planning.setValueAt("9h00", 0, 1);
		Planning.setValueAt("10h00", 0, 2);
		Planning.setValueAt("11h00", 0, 3);
		Planning.setValueAt("12h00", 0, 4);
		Planning.setValueAt("13h00", 0, 5);
		Planning.setValueAt("14h00", 0, 6);
		Planning.setValueAt("15h00", 0, 7);
		Planning.setValueAt("16h00", 0, 8);
		Planning.setValueAt("17h00", 0, 9);
		Planning.setValueAt("18h00", 0, 10);
		Planning.setValueAt("19h00", 0, 11);
		
		
        for (int i = 0; i < Epreuve.lesEpreuves.size(); i++) 
        {
        	for (int j = 0; j < Epreuve.lesEpreuves.get(i).sesSession.size(); j++) 
        	{
        		Session elem = Epreuve.lesEpreuves.get(i).sesSession.get(j);
        		for (int k = 1; k < hauteur; k++) 
				{
        			System.out.println(elem.getDateSession());
        			System.out.println(Planning.getValueAt(k, 0));
					if (Planning.getValueAt(k, 0) == elem.getDateSession())
					{
						System.out.println(elem.getNomSession());
						Planning.setValueAt(elem.getNomSession(), k, Integer.parseInt(elem.getHeureDebutEpreuve())-8);
					}

				}
        		
        		
        		/*for (int k = 1; k < longeur; k++) 
        		{
        			System.out.println(Planning.getValueAt(0, k));
        			if (Planning.getValueAt(0, k)== Epreuve.lesEpreuves.get(i).sesSession.get(j).getHeureDebutEpreuve()) 
        			{
        				
        				System.out.println(k);
        				for (int l = 1; l < hauteur; l++) 
        				{
        					System.out.println(Planning.getValueAt(l, 0));
        					if (Planning.getValueAt(l, 0) == Epreuve.lesEpreuves.get(i).sesSession.get(j).getDateSession())
        					{
        						System.out.println(l);
        						Planning.setValueAt(Epreuve.lesEpreuves.get(i).sesSession.get(j).getNomSession(), k, l);
        					}
        					System.out.println("..");
        				}
        				System.out.println(".");
        			}
        		}    */
            }
        	
        	
        	
        } 
	}
}
