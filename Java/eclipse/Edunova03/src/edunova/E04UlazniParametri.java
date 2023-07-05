package edunova;

public class E04UlazniParametri {
	
	public static void main(String[] args) {
		
		
		// Program mora primiti dva parametra
		
		if(args.length!=2) {
			System.out.println("Obavezno dva parametra");
			return; // prekida izvođenje metode - short circuiting
		}
		
		System.out.println(args[0]);
	}

}
