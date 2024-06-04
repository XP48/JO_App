package controleurs;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import modeles.Athlete;
import modeles.Equipe;
import modeles.Pays;
import vues.*;

public class EcouteurBtnAjoutAthleteToEquipe implements ActionListener {
	
	JList<String> list;
	AjoutAthlete page;
	int indiceEquipe;
	
	public EcouteurBtnAjoutAthleteToEquipe(JList<String> list, AjoutAthlete page, int indice) {
		this.list = list;
		this.page = page;
		this.indiceEquipe = indice;
		System.out.println(indiceEquipe + "gg");
	}

	public void actionPerformed(ActionEvent e) {
		int index = list.getSelectedIndex();
		if(index <= Athlete.lesAthletes.size()) {	
			Equipe.lesEquipes.get(indiceEquipe).ajouteAthlete(Athlete.lesAthletes.get(index));
		}
		
	}
}
	