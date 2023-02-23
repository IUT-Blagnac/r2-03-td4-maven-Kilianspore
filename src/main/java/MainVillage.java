

public class MainVillage {

	public static void main (String[] argv) {
		// A Compl�ter	
		String[] nomsSchtroumpfs = {
		        "Grand Schtroumpf", "Schtroumpf courant (et pas ordinaire)", "Schtroumpf ordinaire (et pas courant)", "Schtroumpf moralisateur � lunettes",
		        "Schtroumpf boudeur", "Schtroumpf volant", "Schtroumpf �tonn�", "Schtroumpf acrobate", "Schtroumpf paresseux"
		};
		Village V = new Village("Vill",-1000,nomsSchtroumpfs);
		/*Village.solstice_d_ete(V);
		V.chefDuVillage().sePresenter();
		V.envoyerAuTravail();
		V.solstice_d_ete();
		*/
		V.solstice_d_ete();
		V.envoyerCueillirSalsepareille();
		V.solstice_d_ete();
		V.dinerTousEnsemble();
		V.solstice_d_ete();
	}

}
