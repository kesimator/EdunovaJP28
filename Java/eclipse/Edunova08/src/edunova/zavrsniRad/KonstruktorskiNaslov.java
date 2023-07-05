package edunova.zavrsniRad;

public class KonstruktorskiNaslov {
	
	private int godinaOsvajanja;
	private Ekipa ekipa;
	private String opis;
	
	
	
	
	
	
	public KonstruktorskiNaslov() {
		super();
	}
	public KonstruktorskiNaslov(int godinaOsvajanja, Ekipa ekipa, String opis) {
		super();
		this.godinaOsvajanja = godinaOsvajanja;
		this.ekipa = ekipa;
		this.opis = opis;
	}
	public int getGodinaOsvajanja() {
		return godinaOsvajanja;
	}
	public void setGodinaOsvajanja(int godinaOsvajanja) {
		this.godinaOsvajanja = godinaOsvajanja;
	}
	public Ekipa getEkipa() {
		return ekipa;
	}
	public void setEkipa(Ekipa ekipa) {
		this.ekipa = ekipa;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	
	

}
