package edunova;

import javax.swing.JOptionPane;

public class E01UvjetnoGranjanjeIf {

	public static void main(String[] args) {

		boolean uvjet = true;

		// obavezni dio if sintakse
		if (uvjet) { // ovakvu sintaksu ćete rjeđe susretati
			// true grana
			System.out.println("1");
		}
		// opcionalno
		else {
			// false grana
			System.out.println("2");
		}

		int i = 1;
		// češće susretljiva sintaksa
		if (i > 0) {
			System.out.println("3");
		}

		// Kada se if odnosi samo na jednu liniju nakon if-a, tada ne trebaju vitičaste
		// zagrade {}
		// JA ĆU UVIJEK KORISTITI {}

		// Nikada ne smijete napraviti

		boolean tocno = true;

		if (tocno == true) {
			System.out.println("6");
		}

		// Korištenje logičkih operatora: & (and) | (ili) [alt gr + w] !

		int t = 2;
		int k = 3;
		// Ugniježđeni if
		if (t != 0) {
			if (k > -8) {
				System.out.println("7");
			}
		}

		// & (and) komada 1 provjerava oba uvjeta
		if (t != 0 & k > -8) {
			System.out.println("8");
		}

		// && komada 2: Drugi uvjet se ne provjerava ako prvi nije zadovoljen
		if (t != 0 & k > -8) {
			System.out.println("9");
		}
		// Mi ćemo u nastavku koristiti &&

		// | (ili) komada 1 provjerava oba uvjeta
		if (t == 2 | k >= 7) {
			System.out.println("10");
		}

		// || (ili) komada 2: Ukoliko je prvi uvjet zadovoljen, ne provjerava se drugi
		if (t == 2 || k > 7) {
			System.out.println("11");
		}
		// Mi ćemo u nastavku koristiti ||

		if (!tocno) { // NE OVO tocno==false
			System.out.println("12");
		}

		int ocjena = 3;

		if (ocjena == 1) {
			System.out.println("Nedovoljan");
		} else if (ocjena == 2) {
			System.out.println("Dovoljan");
		} else {
			System.out.println("SUPER");
		}

		int broj = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));

		if (broj % 2 == 0) {
			System.out.println("Broj je paran.");
		} else {
			System.out.println("Broj je neparan.");
		}
		
		// Tercijarni operator ? (upitnik je operator)
		// inline if
		System.out.println("Broj je " + (broj%2!=0 ? "ne" : "") + "paran");
		
		

	}

}
