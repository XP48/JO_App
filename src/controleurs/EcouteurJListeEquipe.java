package controleurs;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import vues.*;
import modeles.*;
import App.app;

public class EcouteurJListeEquipe implements ListSelectionListener {
	
	PageEquipes page;
	JList<String> listeEquipe;
	String listeAthlete = "";
	JPanel infos = new JPanel();
	JTextArea athletes = new JTextArea("");
	JTextArea nom = new JTextArea("");
	JTextArea pays = new JTextArea("");
	
	public EcouteurJListeEquipe(JList<String> listeEquipe, PageEquipes page) {
		this.page = page;
		this.listeEquipe = listeEquipe;
		athletes.setEditable(false);
		nom.setEditable(false);
		pays.setEditable(false);
	}
	public void valueChanged(ListSelectionEvent e) {
		changerAffichage();
		page.SupprimerEquipe.setEnabled(true);
		page.AjouterAthlete.setEnabled(true);
		ActionListener[] listenersA = page.AjouterAthlete.getActionListeners();
		
		for (ActionListener listener : listenersA) {
			page.AjouterAthlete.removeActionListener(listener);
        }
		
		EcouteurBtnAjoutAthlete clickAjoutAthlete = new EcouteurBtnAjoutAthlete(listeEquipe, page, listeEquipe.getSelectedIndex(), this);
		page.AjouterAthlete.addActionListener(clickAjoutAthlete);
	}
	public void changerAffichage() {
		listeAthlete = "";
		Equipe elem = Equipe.lesEquipes.get(listeEquipe.getSelectedIndex());
		
		BorderLayout layout = (BorderLayout) page.main.getLayout();
        Component westComponent = layout.getLayoutComponent(BorderLayout.WEST);
        if(westComponent != null) {
        	page.main.remove(westComponent);
        }
        		
		for (int i = 0; i < elem.sesAthlete.size(); i++) 
        {
			listeAthlete = listeAthlete + "\n" + elem.sesAthlete.get(i).getPrenomAthlete() + ", " + elem.sesAthlete.get(i).getNomAthlete();
        }
		athletes.setText("Athlètes : " + listeAthlete);
		
		infos.setLayout(new BoxLayout(infos, BoxLayout.Y_AXIS));
		
		nom.setText("Nom : " + elem.getNomEquipe());
		pays.setText("Pays : " + elem.getSonPays().getNomPays());
		
		infos.add(nom);
		infos.add(pays);
		infos.add(athletes);
		
		page.main.add(infos, BorderLayout.WEST);
		page.main.updateUI();
	}

}
