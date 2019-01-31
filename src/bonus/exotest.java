package bonus;

public class exotest {


	public static int[] tabRandom(int taille) {

		int[] tab1;
		tab1= new int[taille];

		for(int i=0; i<tab1.length; i++) {
			tab1[i]= (int)(Math.random()*100);
		}
		return tab1;
	}
	public static void affiche(int[] tab) {

		for(int i=0; i<tab.length; i++) {

			System.out.print(tab[i]);

			if(i !=tab.length -1) { // je met la , partout sauf pour le dernier emplacement

				System.out.print(",");
			}
		}
		System.out.println();
	}
	public static void main(String[]args) {

		int[] tab = tabRandom(2+5);

		affiche(tab);
		affiche(tabRandom(2));

		System.out.println();
	}
}