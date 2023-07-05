package edunova;

public class E04PrimBroj {
	
	public static void main(String[] args) {
		
		
		// prim/prosi/prime number
		
		// prim broj je cjelobrojno djeljiv s jedan i sam sa sobom
		
		
		
		int broj=7;
		
		
		
		// hipoteza
		boolean prim=true;
		for(int i=2;i<broj;i++) {
			if(broj%i==0) {
				prim=false;
				break;		// čitati https://www.bigocheatsheet.com/
			}
		}
		
		
		System.out.println(broj + (prim ? " je" : " nije") + " prim broj");
		
		
		// nastavak doma: Ispisati sve prim brojeve između dva unesena broja
		
	}

}
