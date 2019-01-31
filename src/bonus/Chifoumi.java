package bonus;

import java.util.Scanner;

public class Chifoumi {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Bienvenue dans le Chifoumi ");
		System.out.println("Essayez de battre l'ordinateur ");

		String choixJeu;
		String[] alea = {"pierre","feuille","ciseaux"};

		for (int i = 0; i <3; i++) {

			System.out.println("Choisis entre pierre,feuille,ciseaux");
			String choixUser = sc.nextLine();

			int nombre = (int)(Math.random()*3);
			choixJeu = alea[nombre];


			if (choixJeu.equals(choixUser)) {
				System.out.println("Egalité ! ");
			}
			else if ((choixUser.equals("pierre") && choixJeu.equals("ciseaux")) || 
					(choixUser.equals("ciseaux") && choixJeu.equals("feuille")) || 
					(choixUser.equals("feuille") && choixJeu.equals("pierre"))) {
				System.out.println("Bravo !!! vous avez gagné " + "l'ordinateur a choisi" + choixJeu);
			}
			else {
				System.out.println("Perdu l'ordinateur a choisi " + choixJeu + "Retentez votre chance ");
			}
		}


	}
}
