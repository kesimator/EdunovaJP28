package edunova.zavrsniRad;

public class Ekipa extends Entitet {
	
	private String naziv;
	private String pogonskaJedinica;
	
	
	
	
	
	
	public Ekipa() {
		super();
	}
	public Ekipa(int sifra, String naziv, String pogonskaJedinica) {
		super(sifra);
		this.naziv = naziv;
		this.pogonskaJedinica = pogonskaJedinica;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getPogonskaJedinica() {
		return pogonskaJedinica;
	}
	public void setPogonskaJedinica(String pogonskaJedinica) {
		this.pogonskaJedinica = pogonskaJedinica;
	}
	
	

}
