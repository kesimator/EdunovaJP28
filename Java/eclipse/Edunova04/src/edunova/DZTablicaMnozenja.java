package edunova;

import javax.swing.JOptionPane;

public class DZTablicaMnozenja {
	
public static void main(String[] args) {
		
		
		String ime=JOptionPane.showInputDialog("Unesi svoje ime"); 		// ili samo unijeti svoje ime
		
		System.out.println("-------------------------------");
		System.out.println(": : :  TABLICA  MNOZENJA  : : :");
		System.out.println("-------------------------------");
		
		// System.out.println("* |  1  2  3  4  5  6  7  8  9");
//		for (int i=1;i<10;i++) {
//			System.out.print(i==1 ? "* |  1" : "  "+i);
//		}
		
		// System.out.println();
		
		System.out.print(" * |");
        for (int i=1;i<=9;i++) {
            System.out.printf("%3d", i);
        }
		System.out.println("\n-------------------------------");
		
		
		
		for(int i=1;i<10;i++) {
			System.out.printf("%2d |", i);
			for(int j=1;j<10;j++) {
				int rezultat=i*j;
				System.out.printf("%3d", rezultat);
			}
			System.out.println();
		}
		
		
		System.out.println("-------------------------------");
		int imePadding = 9 - ime.length();
        System.out.printf(":  :  :  :  :  :  :by %" + imePadding + "s%s", "", ime);
        // System.out.printf(":  :  :  :  :  :  :by %s", ime); 		// iz nekog razloga neće da ide na by %s
		System.out.println("\n-------------------------------");
		
		
		
		
		
		
		
		
	}

}

