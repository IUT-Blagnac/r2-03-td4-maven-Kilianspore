

import java.util.ArrayList;

public class Village {
	// A Compl�ter
	
	private String nom;
	private ArrayList<Schtroumpf> membres;
	private int nbS;
	private int nbSalse;
	
	public Village(String pfNom, int pfStock, String[] pfNoms) {
		this.nom = pfNom;
		this.nbSalse = pfStock;
		this.nbS = pfNoms.length;
		this.membres = new ArrayList<Schtroumpf> ();
		for (int i = 0; i < pfNoms.length; i++) {
			int age = (int)(Math.random()*150);
			Schtroumpf S = new Schtroumpf(pfNoms[i], age, this);
			membres.add(S);
			}
	}
	
	public String getNomV() {
		return this.nom;
	}
	
	public int getNbS() {
		return this.nbS;
	}
	
	public int getNbSalse() {
		return this.nbSalse;
	}
	
	public void solstice_d_ete() {
		System.out.println("Dans le village "+this.nom+", il y a "+this.nbS+" Schtroumpfs.");
		int nbHeureux = 0;
		for (int i = 0; i < this.nbS; i++) {
			if (this.membres.get(i).getEtat()) {
				nbHeureux += 1;
			}
			this.membres.get(i).sePresenter();
			this.membres.get(i).chanter();
		}
		System.out.println("Parmis eux, il y a "+nbHeureux+" Schtroumpfs heureux");
	}
	
	public Schtroumpf chefDuVillage() {
		Schtroumpf vieux = this.membres.get(0);
		int age_vieux = 0;
		for (int i = 0; i < this.nbS; i++) {
			if (this.membres.get(i).getAge() > age_vieux) {
				vieux = this.membres.get(i);
				age_vieux = this.membres.get(i).getAge();
			}
		}
		return vieux;
	}

	public void schtroumpfsHeureux() {
		for (int i = 0; i < this.nbS; i++) {
			if (this.membres.get(i).getEtat()) {
				this.membres.get(i).sePresenter();
				this.membres.get(i).chanter();
			}
		}
	}
	
	public void monterStock(int pfQte) {
		this.nbSalse += pfQte;
	}
	
	public void baisserStock(int pfQte) {
		this.nbSalse -= pfQte;
	}
	
	public void dinerTousEnsemble() {
		for (int i = 0; i < this.nbS; i++) {
			this.membres.get(i).dinerAuVillage();
		}
	}
		
	public ArrayList <Schtroumpf> heureux() {
		ArrayList <Schtroumpf> liste = new ArrayList <Schtroumpf> ();
		for (int i = 0; i < this.nbS; i++) {
			if (this.membres.get(i).getEtat()) {
				liste.add(this.membres.get(i));
			}
		}
		return liste;
	}
			
	public void envoyerAuTravail() {
		int cpt = 0;
		int max;
		ArrayList<Schtroumpf> S = this.heureux();
		if (((this.nbS - 1)%2) == 0) {
			max = this.heureux().size();
		}
		else {
			max = this.heureux().size() - 1;
		}
		while (cpt < max) {
			S.get(cpt).travailler();
			cpt += 2;
		}
	}
	
	public void envoyerCueillirSalsepareille() {
		int cpt = 0;
		int max;
		ArrayList<Schtroumpf> S = this.heureux();
		if (((this.nbS - 1)%2) == 0) {
			max = this.heureux().size();
		}
		else {
			max = this.heureux().size() - 1;
		}
		while (cpt < max) {
			S.get(cpt).recolterSalsepareille();
			cpt += 2;
		}
	}
}
