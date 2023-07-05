package edunova;

public class E08Konverzije {
	
	public static void main(String[] args) {
		
		int i=24;
		// Implicitna konverzija
		double d=i;
		
		System.out.println(d);
		
		// Eksplicitna konverzija
		i=Integer.parseInt(String.valueOf(d).replace(".0", ""));
		
		// Cast metoda
		i=(int)d;
		
		
		
	}

}
