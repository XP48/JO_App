/*package controleurs;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import vues.*;
import modeles.*;
import App.app;

public class EcouteurJListeSession implements ListSelectionListener {
	
	JButton btn;
	PageEpreuves page;
	JList<String> liste;
	JList<String> listeSession;
	
	public EcouteurJListeSession(JList<String> liste, PageEpreuves page) {
		this.page = page;
		this.liste = liste;
	}
	public void valueChanged(ListSelectionEvent e) {
		//(((JList<String>)(e.getSource())).getSelectedValuesList())
		//btn.setEnabled(true);;
		Session elem = Session.lesSessions.get(liste.getSelectedIndex());
		String[] tabSessions = new String[(elem.sesSession).size()];
		
		for (int i = 0; i < elem.sesSession.size(); i++) 
        {
			tabSessions[i] = elem.sesSession.get(i).getNomSession();
        }
		
		int index = liste.getSelectedIndex();
		
		EcouteurBtnCreerSession clickCreerSession = new EcouteurBtnCreerSession(page, index);
		page.CreerSession.addActionListener(clickCreerSession);
		
		listeSession = new JList<String>(tabSessions);
		
		listeSession.setFont(new Font("Arial", Font.BOLD, 14));
		listeSession.setForeground(Color.BLUE);
		page.CreerSession.setEnabled(true);
		page.SupprimerEpreuve.setEnabled(true);
		page.grid.removeAll();
		page.grid.add(liste);
		page.grid.add(listeSession);
		page.main.add(page.grid, BorderLayout.CENTER);
		page.main.updateUI();
	}*/
