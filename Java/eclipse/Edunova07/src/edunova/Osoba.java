package edunova;


// Ovo znati u svako doba dana i noći:
// Klasa je opisnik objekta
// Za OOP čitati: https://github.com/tjakopec/OOP_JAVA_PHP_PYTHON_SWIFT

public class Osoba {
	
	
	// Ovo nije dobro jer nije po OOP principu učahurivanja
	/*
	String ime;
	String prezime;
	int godine;
	*/
	
	
	// OOP princip UČAHURIVANJE
	// 1. učahurivanje Klasa će sakriti svoja svojstva
	private String ime;
	private String prezime;
	private int godine;
	
	// Konstruktor je posebna metoda
	// koja se poziva ključnom riječju new
	// Naziv konstruktora mora biti istovjetan nazivu klase
	
	// Prazan konstruktor
	public Osoba() {
		System.out.println("Nalazim se u Osoba konstruktor");
	}
	
	// Puni konstruktor
	public Osoba(String ime, String prezime, int godine) {
		// super();		vezano za nasljeđivanje - kasnije
		this.ime = ime;
		this.prezime = prezime;
		this.godine = godine;
	}
	
	
	// 2. učahurivanje Klasa će učiniti svojstva dostupna putem javnih get/set metoda
	public String getIme() {
		return ime;
	}
	
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public int getGodine() {
		return godine;
	}
	public void setGodine(int godine) {
		this.godine = godine;
	}

}
