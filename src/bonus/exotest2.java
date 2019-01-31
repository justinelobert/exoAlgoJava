// Créer un tab de string

package bonus;

public class exotest2 {

	public static void main(String[] args) {

		String[] tab = new String[5]; // 'new' permet d'instancier
		String mot = "mot";

		tab[0] = "histoire";
		tab[1] = "géographie";
		tab[2] = "mathématiques";
		tab[3] = "français";
		tab[4] = "svt";

		for (int i=0; i<tab.length; i++) {
			
			String pl = tab[i].charAt(0)+"";  //tab[i] = l'élèment
			String otherl = tab[i].substring(1);
			System.out.println(pl.toUpperCase()+otherl.toLowerCase());
			
		}
		String[] tab2 = {"pierre", "feuille","ciseaux","puits"};

		if (tab2.length > 1) {
			mot += "s";
		}
		System.out.println("Le tableau 2 comporte" + tab2.length + mot); // '+' = concaténation 

		for (int i=0; i<tab2.length;i++) {
			System.out.println(tab2[i]);
		}

	}
}