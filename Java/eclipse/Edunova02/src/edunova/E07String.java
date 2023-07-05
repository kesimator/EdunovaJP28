package edunova;

public class E07String {
	
	public static void main(String[] args) {
		
		// Prema OOP pravilima
		String s = new String();
		
		// Kraća sintaksa
		
		String grad="Osijek" + " je najbolji. " + 9;
		
		System.out.println(grad.toLowerCase());
		System.out.println(grad.toUpperCase());
		System.out.println(grad.substring(2,6));
		
		
	}

}
