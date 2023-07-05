
package edunova;

import javax.swing.JOptionPane;

public class E04CiklicnaMatrica {
	
	public static void main(String[] args) {
		
		
		boolean dev=true;
		
		
		int redova=dev ? 5 : Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redaka"));
		int stupaca=dev ? 5 : Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupaca"));
		
		int[][] matrica=new int[redova][stupaca];
		
		for(int i=0;i<redova;i++) {
			for(int j=0;j<stupaca;j++) {
				System.out.print(matrica[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("************************");
		
//		matrica[redova-1][stupaca-1]=1;
//		matrica[redova-1][stupaca-2]=2;
//		matrica[redova-1][stupaca-3]=3;
//		matrica[redova-1][stupaca-4]=4;
//		matrica[redova-1][stupaca-5]=5;
		int b=1;
		for(int i=1;i<=stupaca;i++) {
			matrica[redova-1][stupaca-i]=b++;
		}
		
		
		for(int i=0;i<redova;i++) {
			for(int j=0;j<stupaca;j++) {
				System.out.print(matrica[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("************************");
		
		
		/*matrica[redova-2][0]=b++;
		matrica[redova-3][0]=b++;
		matrica[redova-4][0]=b++;
		matrica[redova-5][0]=b++;*/
		for(int i=2;i<=redova;i++) {
			matrica[redova-i][0]=b++;
		}
		
		for(int i=0;i<redova;i++) {
			for(int j=0;j<stupaca;j++) {
				System.out.print(matrica[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("************************");
		
		
		
//		matrica[0][1]=b++;
//		matrica[0][2]=b++;
//		matrica[0][3]=b++;
//		matrica[0][4]=b++;
		for(int i=1;i<stupaca;i++) {
			matrica[0][i]=b++;
		}
		
		for(int i=0;i<redova;i++) {
			for(int j=0;j<stupaca;j++) {
				System.out.print(matrica[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("************************");
		
		
		
//		matrica[1][4]=b++; 				// ili matrica[1][stupaca-1]=b++;
//		matrica[2][4]=b++;
//		matrica[3][4]=b++;
		for(int i=1;i<redova-1;i++) {
			matrica[i][stupaca-1]=b++; 	// ili matrica[i][4]=b++;
		}
		
		
		for(int i=0;i<redova;i++) {
			for(int j=0;j<stupaca;j++) {
				System.out.print(matrica[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("************************");
		
		
		
//		matrica[3][3]=b++;
//		matrica[3][2]=b++;
//		matrica[3][1]=b++;
		for(int i=2;i<=stupaca-1;i++) {
			matrica[redova-2][stupaca-i]=b++;
		}
		// 1. naredba: Prvo sam imao ovakvu naredbu: 
		// for(int i=1;i<stupaca-1;i++) {
		// matrica[3][i]=b++;
	// } pa mi je izbacilo slijeva nadesno, znači 17,18,19,16
		
		// 2. naredba: Onda sam dodao matrica[3][stupaca-i]=b++;	pa je išlo pravilnim redoslijedom,
		// ali umjesto 16 krenulo je sa 0,19,18,17 (kada se gleda ciklično, zdesna nalijevo to je ispravan redoslijed)
		
		// 3. naredba: Onda sam umjesto i=1 stavio i=2, sada je krenuo s pravilnim brojem,
		// ali i dalje na kraju ostane nula, znači ide ovako: 0,18,17,16
		
		// 4. naredba: Konačno rješenje u for naredbi, ispod stavljam prvo pogrešnu, a onda ispravnu:
		// for(int i=1;i<stupaca-1;i++)
		// for(int i=2;i<=stupaca-1;i++)
		
		
		for(int i=0;i<redova;i++) {
			for(int j=0;j<stupaca;j++) {
				System.out.printf("%3d\t", matrica[i][j]);
			}
			System.out.println();
		}
		System.out.println("************************"); 		// Do ovdje lijepo radi 3x3, 4x4, 5x5...
		
		
		
//		matrica[2][1]=b++;
//		matrica[1][1]=b++;
		for(int i=3;i<=redova-1;i++) {
			matrica[redova-i][1]=b++;
		}
		
		
		
		for(int i=0;i<redova;i++) {
			for(int j=0;j<stupaca;j++) {
				System.out.print(matrica[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("************************");
		
		
		
//		matrica[1][2]=b++;
//		matrica[1][3]=b++;
		for(int i=2;i<stupaca-1;i++) {
			matrica[1][i]=b++;
		}
		
		
		
		for(int i=0;i<redova;i++) {
			for(int j=0;j<stupaca;j++) {
				System.out.print(matrica[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("************************");
		
		
		
//		matrica[2][3]=b++;
//		matrica[2][2]=b++;
		for(int i=2;i<stupaca-1;i++) {
			matrica[2][stupaca-i]=b++;
		}
		
		
		
		for(int i=0;i<redova;i++) {
			for(int j=0;j<stupaca;j++) {
				System.out.print(matrica[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("************************"); 		// Šteka na 4x4
		
		
		
		
		
		
	}
	
	

}
