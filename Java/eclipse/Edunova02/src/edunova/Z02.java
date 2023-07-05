package edunova;

import javax.swing.JOptionPane;

public class Z02 {

	public static void main(String[] args) {
		
		int a = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi prvi broj:")
				);
		
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));				
		
		System.out.println(a/b);
		
		
		
		// Jedan od brojeva mora biti float pa "castamo" varijablu u float
		System.out.println(a/(float)b);

	}

}
