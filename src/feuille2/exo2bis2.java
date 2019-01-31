package feuille2;

import java.util.Scanner;

public class exo2bis2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("afficher un nombre");
		int a = sc.nextInt();
		String s = String.valueOf(a);
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
			
		}
		
	}

}
