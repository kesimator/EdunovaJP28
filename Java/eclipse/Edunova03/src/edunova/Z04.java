package edunova;

import javax.swing.JOptionPane;

public class Z04 {
	
	public static void main(String[] args) {
		
		
		int x1=Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int x2=Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		
		
		
		if(x1>x2) {
			System.out.println(x1);
		} else if(x2>x1) {
			System.out.println(x2);
		}
	}

}
