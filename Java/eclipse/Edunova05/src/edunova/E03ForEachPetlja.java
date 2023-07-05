package edunova;

public class E03ForEachPetlja {
	
	public static void main(String[] args) {
		
		
		// deklarirajte niz od 7 int vrijednosti i svima dodijeli brojeve 1 do 7
		
		int[] niz= {1,2,3,4,5,6,7};
		
		for(int i=0;i<niz.length;i++) {
			System.out.println(niz[i]);
		}
		
		
		// for each ide uvijek otpočetka do kraja
		for(int en : niz) {
			System.out.println(en);
		}
		
		// prekidanje, nastavak ugnježđivanje je isto kao kod for, while i do while
		
		
		
		
		
	}

}
