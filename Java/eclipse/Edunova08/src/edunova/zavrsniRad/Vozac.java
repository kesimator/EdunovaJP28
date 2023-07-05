package edunova.zavrsniRad;

import java.util.Date;

public class Vozac extends Entitet {
	
	private String ime;
	private String prezime;
	private Date datumRodenja;
	private Ekipa ekipa;
	private String drzavljanstvo;
	private String mjestoRodenja;
	private int vozacevBroj;
	
	
	
	
	
	
	public Vozac() {
		super();
	}
	public Vozac(int sifra, String ime, String prezime, Date datumRodenja, Ekipa ekipa, String drzavljanstvo,
			String mjestoRodenja, int vozacevBroj) {
		super(sifra);
		this.ime = ime;
		this.prezime = prezime;
		this.datumRodenja = datumRodenja;
		this.ekipa = ekipa;
		this.drzavljanstvo = drzavljanstvo;
		this.mjestoRodenja = mjestoRodenja;
		this.vozacevBroj = vozacevBroj;
	}
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
	public Date getDatumRodenja() {
		return datumRodenja;
	}
	public void setDatumRodenja(Date datumRodenja) {
		this.datumRodenja = datumRodenja;
	}
	public Ekipa getEkipa() {
		return ekipa;
	}
	public void setEkipa(Ekipa ekipa) {
		this.ekipa = ekipa;
	}
	public String getDrzavljanstvo() {
		return drzavljanstvo;
	}
	public void setDrzavljanstvo(String drzavljanstvo) {
		this.drzavljanstvo = drzavljanstvo;
	}
	public String getMjestoRodenja() {
		return mjestoRodenja;
	}
	public void setMjestoRodenja(String mjestoRodenja) {
		this.mjestoRodenja = mjestoRodenja;
	}
	public int getVozacevBroj() {
		return vozacevBroj;
	}
	public void setVozacevBroj(int vozacevBroj) {
		this.vozacevBroj = vozacevBroj;
	}
	
	
	
	

}
