package edunova;

import javax.swing.JOptionPane;

public class Z03 {

	public static void main(String[] args) {

		String s = JOptionPane.showInputDialog("Unesi ime mjesta iz jedne od 4 slavonske županije.");

		switch (s) {
		case "Osijek":
			System.out.println("Osječko-baranjska županija.");
			break;

		case "Vukovar":
			System.out.println("Vukovarsko-srijemska županija.");
			break;

		case "Slavonski Brod":
			System.out.println("Brodsko-slavonska županija.");
			break;

		case "Požega":
			System.out.println("Požeško-slavonska županija.");
			break;

		default:
			System.out.println("Nemam to u podacima.");
		}
	}

}
