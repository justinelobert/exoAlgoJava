package feuille2;

import java.util.Scanner;

public class exo3bis2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);

		int saisie,reponse,tempo; // définir variables

		System.out.println("Bienvenue, veuillez saisir un nombre"); // demander a l'utilisateur 
		saisie = sc.nextInt(); // rappel de scanner

		tempo=1;

		if (saisie != 0) { //si saisie different de 0
			for (int i = 1; i <= saisie; i++) {
				tempo = tempo*i; 
			}
			reponse = tempo;

		}

		else { // on met une condition 
			reponse=1; // alors reponse = 1
		}
		System.out.println("Le factiorel est = " + reponse); // affichage 

	}
}






