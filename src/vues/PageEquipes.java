package vues;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import controleurs.*;

public class PageEquipes extends JPanel{
	
	
	public JPanel main = new JPanel();
	JLabel t = new JLabel("test");
		
	public PageEquipes() {
			
			main.setLayout(new GridLayout(2,1));
			main.add(t);
			
			
		}

}
