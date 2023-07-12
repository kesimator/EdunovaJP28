package edunova.model;

public class Predavac extends Osoba {
	
	private String iban;
	
	
	
	

	public Predavac() {
		super();
	}

	public Predavac(String ime, String prezime) {
		super(ime, prezime);
		
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}
	
	

}
