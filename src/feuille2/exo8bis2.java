/* Écrire un programme qui affiche un triangle isocèle formé d’étoiles. La hauteur du triangle
(c’est-à-dire son nombre de lignes) sera fournie en donnée. */

package feuille2;

import java.util.Scanner;

public class exo8bis2 {

	public static void main(String[] args) {

		Scanner x = new Scanner(System.in);

		int n, i, j;
		System.out.print("Combien de lignes ? ");

		n = x.nextInt();
		for (i = 0; i < n; i++) {

			for (j = 0; j < n - i - 1; j++)
				System.out.print(" ");

			for (j = 0; j <= i * 2; j++)
				System.out.print("*");
			System.out.println();
		}

	}
}
