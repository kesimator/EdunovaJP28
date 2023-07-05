package edunova;

public class E02UvjetnoGrananjeSwitch {

	public static void main(String[] args) {

		int ocjena = 3;

		if (ocjena == 1) {
			System.out.println("Nedovoljan");
		} else if (ocjena == 2) {
			System.out.println("Dovoljan");
		}
		// ..
		else {
			System.out.println("Nije ocjena");
		}

		switch (ocjena) {
		case 1:
			System.out.println("Nedovoljan");
			break;
		case 2: // Možemo dodati i case 3: ispod case 2: pa će uhvatiti oboje ili 2 ili 3, ako
				// je samo case 2: onda će pokazati rezultat "Nije ocjena", ako stavimo i 2 i 3,
				// onda će pokazati rezultat "Dovoljan"
		case 3:
			System.out.println("Dovoljan");
			// ..
		default:
			System.out.println("Nije ocjena");
		}

		String grad = "Osijek";

		switch (grad) {
		case "Osijek":
			System.out.println("Najbolji grad");
			break;
		default:
			System.out.println("Svi drugi");
		}

		char c = 'A';

		switch (c) {
		case 'A':
			System.out.println("Slovo A");
		}
	}

}
