package edunova;

import javax.swing.JOptionPane;

public class Z05 {

	public static void main(String[] args) {

		int a = 2;
		int b = 5;
		int c = 9;

		if (a > b) {
			if (a > c) {
				System.out.println(a);
			} else {
				System.out.println(c);
			}
			} else {
			if (b > c) {
				System.out.println(b);
			} else {
				System.out.println(c);
			}
		}
	}
}
