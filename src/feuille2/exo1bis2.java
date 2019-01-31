package feuille2;

import java.util.Scanner;

public class exo1bis2 {

	public static void main (String[]args) {

		Scanner sc = new Scanner(System.in); // saisie utilisateur 

		char[] voyelle= {'a','e','i','o','u','y'}; // chaine caracteres de voyelle 
		int [] count= new int[voyelle.length]; // compteur chaine 

		System.out.println("donner un mot"); // affichage 
		String saisie = sc.nextLine();
		saisie=saisie.toLowerCase(); // compte aussi majuscules
		
		char[] carac = saisie.toCharArray(); // sépare chaine caracs à caracs 

		for(int i=0; i<carac.length; i++) { // boucle 'for' pour carac

			for(int j=0; j<voyelle.length; j++) { // boucle 'for' pour voyelle 
				if(carac[i]==voyelle[j]) { 
					count[j] +=1; // compteur 
				}
			}
		}
		for(int i=0; i<count.length; i++) // boucle 'for' lcount 
		
		System.out.println("la voyelle "+voyelle[i]+" est présente "+ count[i]+" fois");
		sc.close(); // fermeture méthode
	}
}