package edunova;

import javax.swing.JOptionPane;

public class Z03 {
	
	public static void main(String[] args) {
		
		String s = JOptionPane.showInputDialog("Mjesto rođenja:");
		int i = Integer.parseInt(JOptionPane.showInputDialog("Koliko imate godina?"));
		
		System.out.println("Ja imam " + i + " godina i dolazim iz mjesta " + s + ".");
		
		
		
	}

}
