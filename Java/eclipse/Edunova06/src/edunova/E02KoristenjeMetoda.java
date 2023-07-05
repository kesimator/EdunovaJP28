package edunova;

public class E02KoristenjeMetoda {
	
	public static void main(String[] args) {
		
		E01Metode.tip1();
		
		// Ne možeš pristupiti metodi pozivom na klasu ako nije static
		// System.out.println(Pomocno.valjanOIB("54896577425"));
		
		
		// Nestatične metode se pozivaju na objektu
		
		// Objekt koji je instanca klase
		Pomocno p=new Pomocno();
		// Objekti mogu pamtiti stanje
		
		// System.out.println(p.valjanOIB("69032365023")); // warning kada je metoda static
		
		System.out.println(Pomocno.valjanOIB("54896577425"));
		
	}

}
