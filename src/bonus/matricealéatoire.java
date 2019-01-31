// fonction qui a pr paramètre 1 entier t qui génère une matrice aléa (compris entre 0&100)
// fonction qui a pr param. ine matrice et qui affiche cette matrice


package bonus;

import java.util.Arrays;

public class matricealéatoire {

	public static int[][] matriceAléa (int ligne, int colonne, int aleaMax) { 

		int [][] tab = new int [ligne][colonne]; // [][] = 2 dimensions

		for(int i=0; i<ligne; i++) {
			for(int j=0; j<colonne; j++) {

				tab[i][j] += nbAlea(aleaMax);
				
				/* System.out.println(" i = " + i + " j = " + j);
				System.out.println(" table de i " + Arrays.toString(tab[i]));
				System.out.println(" élement de i j " + tab[i][j]); */
			}
		}
		
		return tab;
	}

	public static void affiche(int [][] tab) {

		for(int i=0; i<tab.length; i++) {
			
			int[] ligne = tab[i];
			
			for(int j=0; j<ligne.length; j++) {

				System.out.print(tab[i][j] + " ");
			}

			System.out.println();
		}


	}
	public static int nbAlea (int max) {

		return (int)(Math.random()*max); //fonction qui retourne le nb alea entre 0&max

	}
	public static void main(String[] args) {

		int[][] tab = matriceAléa(3,5,100);
		affiche(tab);


	}

}
