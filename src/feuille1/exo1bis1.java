package feuille1;

import java.util.Scanner;

public class exo1bis1 {

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez saisir un entier");

		try { // permet d'afficher une erreur (if)

			int i = sc.nextInt();
			System.out.println("veuillez saisir un second entier : ");
			int d = sc.nextInt();
			System.out.println("votre résultat est : " +(i + d));
		}

		catch(Exception e) { // permet d'afficher une erreur (else)
			System.out.println("Erreur !");
		}
	}
}


	// Correction
	/* public static void main (String[]args) {
	 * try{
	 * int nb1 = Integer.parseInt(args[0]);
	 * int nb2 = Integer.parseInt(args[1]);
	 * System.out.println(nb1+"+"+nb2+"="+(nb1+nb2));
	 * }catch (Exception e){
	 * System.out.println("Il faut saisir des chiffres"+e.getMessage());
	 * }
	 * }
	 * }
	 */


