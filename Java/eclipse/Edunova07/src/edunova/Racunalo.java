package edunova;

public class Racunalo {
	
	private String marka;
	
	private float cijena;
	
	private int garancija;
	
	

	public Racunalo() {
		super();
	}

	public Racunalo(String marka, float cijena, int garancija) {
		super();
		this.marka = marka;
		this.cijena = cijena;
		this.garancija = garancija;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public float getCijena() {
		return cijena;
	}

	public void setCijena(float cijena) {
		this.cijena = cijena;
	}

	public int getGarancija() {
		return garancija;
	}

	public void setGarancija(int garancija) {
		this.garancija = garancija;
	}
	
	

}
