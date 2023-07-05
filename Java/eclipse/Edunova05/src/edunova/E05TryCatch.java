package edunova;

public class E05TryCatch {
	
	public static void main(String[] args) {
		
		int[] niz= {1,2};
		
		
		
		// Iznimke se obrađuju s try catch finally blokom
		try {
			// Ovdje se uvijek dolazi
			System.out.println(niz[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// Ovdje se dolazi ako je iznimka bačena ArrayIndexOutOfBoundsException
			System.out.println("Ideš na index koji ne postoji.");
		} catch (NumberFormatException | StackOverflowError e) {
			// Ovdje se dolazi ako je iznimka bačena NumberFormatException ili StackOverflowError
		} catch (Exception e) {
			// Ovaj će uhvatiti sve što nije prethodno navedeno
		} finally {
			// Ovdje se uvijek dolazi
		}
		
		// U nastavku ću koristiti
		try {
			System.out.println(niz[2]);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
