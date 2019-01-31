package feuille1;

import java.util.Scanner;


// Créer une var nb aléa entre 0 & 1000 (int)
// Créer 1 syso & demander de saisie 
// Créer une varia saisie utilisateur 
// Créer une condition de limite sr la saisie entre 0 & 1000
// Créer une autre condition pr comparer la saisie avc le nb généré
// Créer une boucle pr relancer le progra si le nb n'a ps était trouvé
// Créer 1 compteur du nb de tour de la boucle
// Créer 1 boolean pr sortir de la boucle si saisie=nb aléa
// Afficher le compteur qd nb & trouvé

public class exo6bis1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //création scanner

		int nb = (int)(Math.random()*1001) ; // génère nombre entre 0 & 1001
		int count = 0; //compteur initié à 0 

		boolean verif=true; //boucle de verif tant que verif vrai on rentre dans la boucle
		while (verif) {

			System.out.println("Veuillez saisir une valeur entre 0 & 1000"); //Affichage
			System.out.println(nb);
			
			int saisie = sc.nextInt(); // créa varia

			if(saisie >= 0 && saisie <= 1000) { 
				if(saisie > nb) {
					System.out.println("C'est moins");
				}
				else if (saisie < nb) { 
					System.out.println("C'est plus");
				}

				else { //condition
					System.out.println("C'est la bonne saisie " + nb);
					verif=false;
				}

			}
			else { //condition
				System.out.println("Mauvaise saisie (entre 0 & 1000)");
			}
			count++; //compteur qd nb trouvé
		}
			System.out.println("Vous avez trouvé en " + count+ " essais");
			sc.close();	
		}

	}


