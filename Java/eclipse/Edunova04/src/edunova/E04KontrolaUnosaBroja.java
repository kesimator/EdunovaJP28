package edunova;

import javax.swing.JOptionPane;

public class E04KontrolaUnosaBroja {

	public static void main(String[] args) {
		
		
		// Program traži od korisnika unos broja između 1 i 10
		
		int broj;
		
		for(;;) {
			broj=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj od 1 do 10"));
			if(broj>=1 && broj<=10) {
				break;
			}
			System.out.println("Nije dobar");
		}
		
		System.out.println(broj);
		
	}
}
