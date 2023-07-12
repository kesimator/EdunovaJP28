package edunova.model;

public class Polaznik extends Osoba {
	
	private String brojUgovora;
	
	

	public Polaznik( String ime, String prezime) {
		super(ime, prezime);
	}

	public Polaznik() {
		super();
	}


	public String getBrojUgovora() {
		return brojUgovora;
	}

	public void setBrojUgovora(String brojUgovora) {
		this.brojUgovora = brojUgovora;
	}
	
	

}
