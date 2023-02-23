
public class Schtroumpf {
	// A Compl�ter	
	private String nom;
	private int age;
	private boolean con;
	private Village V;
	private boolean erm;
	
	public Schtroumpf (String pfNom, int pfAge) {
		this.nom = pfNom;
		this.age = pfAge;
		this.con = true;
		this.V = null;
		this.erm = true;
	}
	
	public Schtroumpf (String pfNom, int pfAge, Village pfV) {
		this.nom = pfNom;
		this.age = pfAge;
		this.con = true;
		this.V = pfV;
		this.erm = false;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public Village getVillage() {
		return this.V;
	}
	
	public void setVillage(Village pfVillage) {
		this.erm = false;
		this.V = pfVillage;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public boolean getEtat() {
		return this.con;
	}
	
	public String toString() {
		String fin="Je suis "+this.getNom()+", j'ai "+this.getAge()+" ans ";
		if (this.getEtat()) {
			fin += "et je suis content.";
			return fin;
		}
		fin += "et je suis PAS content. ";
		if (!(this.erm)) {
			fin += " De plus, j'habite dans le village "+this.getVillage().getNomV();
		}
		else {
			fin += " De plus, je suis ermite";
		}
		return fin;
	}
	
	public void sePresenter() {
		System.out.println(this.toString());
	}
	
	public String leChant() {
		String fin = "la,la,la Schtroumpf la,la";
		if (this.getEtat()) {
			return fin;
		}
		fin = "gloups";
		return fin;
	}
	
	public void chanter() {
		System.out.println(this.leChant());
	}
	
	public void anniversaire() {
		this.age += 1;
	}
	
	public void manger(int pfQte) {
		if (pfQte > 0) {
			if (!(this.getEtat())) {
				this.con = true;
			}
		}
	}
	
	public void travailler() {
		if (this.getEtat()) {
			this.con = false;
		}
	}
	
	public void recolterSalsepareille() {
		this.travailler();
		if (!(this.erm)) {
			this.V.monterStock(5);
		}
		else {
			this.manger(5);
		}
	}
	
	public void dinerAuVillage() {
		if (this.erm) {
			this.con = false;
		}
		else {
			if ((this.getVillage().getNbSalse() - 3) >= 0) {
				this.V.baisserStock(3);
				this.manger(3);
				
			}
		}
	}
}
