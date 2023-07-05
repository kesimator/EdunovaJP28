package edunova.zavrsniRad;

public class VozackiNaslov {
	
	private int godinaOsvajanja;
	private Vozac vozac;
	private String opis;
	
	
	
	
	
	
	public VozackiNaslov() {
		super();
	}
	public VozackiNaslov(int godinaOsvajanja, Vozac vozac, String opis) {
		super();
		this.godinaOsvajanja = godinaOsvajanja;
		this.vozac = vozac;
		this.opis = opis;
	}
	public int getGodinaOsvajanja() {
		return godinaOsvajanja;
	}
	public void setGodinaOsvajanja(int godinaOsvajanja) {
		this.godinaOsvajanja = godinaOsvajanja;
	}
	public Vozac getVozac() {
		return vozac;
	}
	public void setVozac(Vozac vozac) {
		this.vozac = vozac;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	
	

}
