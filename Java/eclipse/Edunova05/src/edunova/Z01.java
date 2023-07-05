package edunova;

import javax.swing.JOptionPane;

public class Z01 {
	
	// Program osigurava učitanje broja od korisnika
	// broj je u rasponu 20 do 50 i nije 30
	// koristiti while petlju
	
	
	
	public static void main(String[] args) {
		
		
		int x1; 	// =Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		while(true) {
			x1=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
			if(x1>=20 && x1<=50 && x1!=30) {
				break;
			}
			JOptionPane.showMessageDialog(null, "Nije dobro");
		}
		System.out.println(x1);
	}

}
