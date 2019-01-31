package bonus;

import java.util.Scanner;

public class Mastermind {

	public static String[] pushTableau(String[] tab , String saisie) {
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < tab.length; i++) {
			saisie = scanner.nextLine();
			
			if(saisie.indexOf(" ")> -1) {
				tab[i] = saisie.substring(0,saisie.indexOf(" "));
			}
			else {
				tab[i] = saisie;
			}
		}
		return tab;
	}
	
	public static void main(String[] args) {


	}

}
