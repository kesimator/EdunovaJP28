package edunova;

import javax.swing.JOptionPane;

public class Z03 {
	
	// Program unosi broj elemenata niza cijelih brojeva
	// Unose se brojevi s while petljom u niz
	// Ispisuju se uneseni brojevi iz niza s foreach petlje
	
	public static void main(String[] args) {
		
		
		int velicinaNiza= Integer.parseInt(JOptionPane.showInputDialog("Unesi veličinu niza"));
		
		int[] nizBrojeva= new int[velicinaNiza];
		
		int brojac=0;
		
		while(brojac<velicinaNiza) {
			nizBrojeva[brojac++]=Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));
		}
		
		
		for(int en : nizBrojeva) {
			System.out.println(en);
		}
		
		
	}

}
