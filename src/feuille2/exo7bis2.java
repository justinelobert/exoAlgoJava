/*Écrire un programme qui crée un tableau comportant les valeurs des carrés des n
premiers nombres impairs, la valeur de n étant lue au clavier et qui en affiche les valeurs.*/

package feuille2;

import java.util.Scanner;

public class exo7bis2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n; // declaration variable
		int [][] tab; // declaration tab 2 dimensions 
		
		System.out.print("combien de valeurs pensez vous qu'il y est ? ");
		n = sc.nextInt(); //rappel scanner
		
		tab = new int[n][2]; // je donne des valeurs au tab 

		for (int i = 0; i < n; i++) { // declaration boucle 
			tab [i][0] = 2 * i + 1;
			tab [i][1] = tab [i][0] * tab [i][0];
			
		}
		for (int i = 0; i < n; i++) // nouv boucle
			System.out.println(tab[i][0] + " a pour carre " + tab[i][1]); //affiche tableau
	}

	}
