package edunova;

public class Som extends Riba {
	
	private int duzinaBrkova;
	
	

	public Som() {
		super();
	}

	public Som(String latinicniNaziv, int dubinaZarona, int duzinaBrkova) {
		super(latinicniNaziv, dubinaZarona);
		this.duzinaBrkova = duzinaBrkova;
	}

	public int getDuzinaBrkova() {
		return duzinaBrkova;
	}

	public void setDuzinaBrkova(int duzinaBrkova) {
		this.duzinaBrkova = duzinaBrkova;
	}
	
	

}
