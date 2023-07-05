package edunova;

import javax.swing.JOptionPane;

public class Z02 {
	
	public static void main(String[] args) {
		
		
		int a=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		
		
		// Ova je generička po primjeru s predavanja
		// System.out.println("Broj je " + (a%2!=0 ? "ne" : "") + "paran.");
		
		
		// Ovaj je alternativni
		System.out.println(a%2!=0 ? "Broj je paran." : "Broj je neparan.");
	}

}
