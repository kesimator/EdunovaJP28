package edunova;

public class E01WhilePetlja {
	
	
	
	public static void main(String[] args) {
		
		
		// while radi s boolean tipom podatka
		// beskonačna petlja
		while(true) {
			break;
		}
		
		
		
		
		// for petlja se ne mora izvesti
		for(int i=0;i<0;i++) {
			System.out.println("01 Neće se izvesti.");
		}
		
		
		
		boolean uvjet=false;
		while(uvjet) {
			System.out.println("02 Neće se izvesti.");
		}
		
		
		// standardni primjer
		int i=0;
		while(i++<10) { 		// ako stavimo ++i onda ispisuje od 1 do 9, ako stavimo u zagradi i<10 i u print naredbi i++, onda od 0 do 9
			System.out.println(i);
		}
		
		
		
		
		// continue, break i ugnježđivanje rade kao u for
		
		
	}

}
