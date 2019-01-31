/* Écrire un programme permettant de remplir un tableau de 5 éléments, ensuite calcule et
 affiche la somme des éléments de ce tableau.*/

package feuille2;

import java.util.Scanner;

public class exo5bis2 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner (System.in);
		
		System.out.println("veuillez entrer une donnée");
		int[] tab = new int[5]; //initiliser son tab
		int varia = 0; // initia varia = 0

		for (int i = 0; i < tab.length; i++) { // boucle
			tab[i] = sc.nextInt();	//prend tout le tab

			varia += tab[i]; // ecrase la varia  
			System.out.println(varia); // affiche varia 
		}

	}
}


