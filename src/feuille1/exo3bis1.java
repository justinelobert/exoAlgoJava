package feuille1;

public class exo3bis1 {

	public static void affiche(int[][] tableau20) {
		for ( int i = 0; i< tableau20.length; i++) {
			for(int j = 0; j < tableau20[i].length; j++) {
				System.out.println(tableau20[i][j]+ "");
			}
			System.out.println("");
			}
		System.out.println("");
		}
	public static void main(String[]args) {
		int matrice1[][]= {{2,4,5},{3,33,35}};
		int matrice2[][]= {{3},{3,4,5},{3,5},{3,1,0}};
		affiche(matrice1);
		affiche(matrice2);
		}
	}


