package edunova;

public class Sisavac extends Zivotinja {
	
	private int danaGraviditeta;
	
	

	public Sisavac() {
		super();
	}

	public Sisavac(String latinicniNaziv, int danaGraviditeta) {
		super(latinicniNaziv);
		this.danaGraviditeta = danaGraviditeta;
	}

	public int getDanaGraviditeta() {
		return danaGraviditeta;
	}

	public void setDanaGraviditeta(int danaGraviditeta) {
		this.danaGraviditeta = danaGraviditeta;
	} 

}
