
package feuille1;

import java.util.Scanner;


public class exo7bis1 {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in); //création scanner

		int nb = (int)(Math.random()*1001) ; // génère nombre entre 0 & 1001
		int count = 0; //compteur initié à 0 

		double tempsdeb = System.currentTimeMillis();
		
		
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
				
					double tempsfin = System.currentTimeMillis();				
					
					double temps = (tempsfin - (tempsdeb - 60000)) /1000F;
					System.out.println(temps);
					
					double time = temps %60; 
					System.out.println(time);
					
					double calc = (temps-time) /60;
					System.out.println(calc);
					
					System.out.println("vous avez mis " + time + " secondes " + "et " + calc + " minutes");
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


