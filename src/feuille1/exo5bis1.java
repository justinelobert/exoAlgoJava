package feuille1;

public class exo5bis1 {

	public static boolean isPair(String nbEnString) {

		boolean verif = true;
		switch(nbEnString.substring(nbEnString.length()-1)){
		case"0":case"2":case"4":case"6":case"8": verif = true;
		break;
		default: verif = false;
		}

		return verif;
	}

	public static void main(String[] args) {
		int i = 0; //nbr d'essais
		boolean verif = true;
		while (verif) {

			String[] tab = new String[3];

			for (int j = 0; j < tab.length; j++) {
				tab[j] = String.valueOf((int) (Math.random()*1001));

			}

			i++;

			if (isPair(tab[0]) == true && isPair(tab[1]) == true && isPair(tab[2]) == false) {

				System.out.println(tab[0] + " " + tab[1] + " " + tab[2] + " " );
				verif = false;
			}
		}

		System.out.println("il en a trouvé " + i + " essais ");
	}

}


