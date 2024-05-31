package vues;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import controleurs.*;


public class Planning extends JPanel {
	
	JTable Planning;	
	
	public JPanel main = new JPanel();	
	
	public Planning() {
		
		
		Planning = new JTable(10,5);
		
		main.add(Planning);
		
	}
	
	
}
