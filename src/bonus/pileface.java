package bonus;

import java.util.Arrays;
import java.util.Scanner;

public class pileface {


	public static double pourcent(int calc , int total) {

		double pourcent = (double)calc * 100 / total;

		return pourcent;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrer la taille du tableau");
		int saisie = sc.nextInt();
		
		
		String[] tab = new String[saisie];
		int pile = 0;
		int face = 0;

		for(int i=0; i<tab.length; i ++) {
			int r = (int)(Math.random()*2); //caster le string

			//double d = (Math.random()*2); //caster le string
			//System.out.println(r);

			if ( r == 0) {
				//System.out.println("face");
				tab[i] = "face";
				face++;
			}

			else {
				//System.out.println("pile");
				tab[i] = "pile";
				pile++;
			}

		}
		System.out.println(Arrays.toString(tab));
		System.out.println("il y a " + face + " face " + pile + " et pile");
		System.out.println("il y a " + pourcent(face, tab.length) + " %");
		System.out.println("il y a " + pourcent(pile, tab.length) + " %");

	}
}
