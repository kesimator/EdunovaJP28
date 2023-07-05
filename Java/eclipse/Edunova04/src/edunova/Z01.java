package edunova;

import javax.swing.JOptionPane;

public class Z01 {
	
	public static void main(String[] args) {
		
		
		// Korisnik unosi dva cijela broja
		// Program ispisuje zbroj svih neparnih brojeva
		// između dva unesena broja
		
		
		int x1=Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int x2=Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		
		
		
		int x=0;
		
		for(int i=x1;i<=x2;i++) {
			// x = i%2!=0 ? x+i : x;
			if(i%2!=0) {
				x+=i;
			}
		}
		
		
		
		System.out.println(x);
		
		
		
		
		
		
	}

}
