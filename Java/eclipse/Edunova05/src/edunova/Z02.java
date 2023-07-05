package edunova;

import javax.swing.JOptionPane;

public class Z02 {
	
	// Program unosi od korisnika dva broja
	// između 20 i 80
	// Program ispisuje sve neparne brojeve
	// između unesenih brojeva unazad (od većeg prema manjeg)
	// koristiti do while petlju
	
	public static void main(String[] args) {
		
		int x1;
		int x2;
		
		do {
			x1=Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
			
			if(x1>=20 && x1<=80) {
				break;
			}
		}while(true);
		
		do {
			x2=Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
			
			if(x2>=20 && x2<=80) {
				break;
			}
			
			
		}while(true);
		
		int manji=x1<x2 ? x1 : x2;
		int veci=x1<x2 ? x2 : x1;
		
		int broj=veci;
		
		do {
			if(broj%2==1) {
				System.out.println(broj);
			}
		}while(--broj>=manji);
		
	}

}
