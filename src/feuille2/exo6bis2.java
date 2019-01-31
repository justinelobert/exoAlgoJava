
package feuille2;

import java.util.Scanner;

public class exo6bis2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int n = Integer.parseInt(args[0]);
		double somme = 0;

		//n = Integer.parseInt(args[0]);
		System.out.print("Donnez la valeur de n : ");
		n = sc.nextInt();

		for (int j = 1; j <= n; j++) {
			somme +=  1.0/ j;
			System.out.println("La sommes est : " + somme);

		}

	}
}


