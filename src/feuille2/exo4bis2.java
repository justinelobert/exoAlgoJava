
package feuille2;

import java.util.Arrays;
import java.util.Scanner;

public class exo4bis2 {

	public static int fibo(int i ) {
		if(i == 1 || i == 0) {
			return 1;

		}
		else {
			return fibo(i-1) + fibo(i-2);
		}

	}

	public static int[] tableauFibo(int longeurTab) {

		int [] tab = new int [longeurTab];
		tab[0] = 0;

		if (longeurTab > 1) {
			tab[1]=1;
		}

		for (int i = 2; i < longeurTab; i++) {
			tab[i] = tab[i -1] + tab[i - 2];
		}

		return tab;
	}

	public static void main (String[]args) {

		Scanner sc= new Scanner(System.in);

		System.out.println("entrez un entier stocké dans i");

		int i=sc.nextInt();

		System.out.println("fibo "+ i+ "et la suite est "+ fibo(i));

		System.out.println(Arrays.toString(tableauFibo(i)));

		sc.close();
	}
}