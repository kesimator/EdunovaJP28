package edunova;

public class E01ForPetlja {
	
	public static void main(String[] args) {
		
		
		// Ispišite 10 linija jednu ispod druge s tekstom Osijek
		
		System.out.println("1. ********************");
		System.out.println("Osijek");
		System.out.println("Osijek");
		System.out.println("Osijek");
		System.out.println("Osijek");
		System.out.println("Osijek");
		System.out.println("Osijek");
		System.out.println("Osijek");
		System.out.println("Osijek");
		System.out.println("Osijek");
		System.out.println("Osijek");	// najgore rješenje
		
		
		
		
		
		String o = "Osijek";
		
		System.out.println("2. ********************");
		System.out.println(o);
		System.out.println(o);
		System.out.println(o);
		System.out.println(o);
		System.out.println(o);
		System.out.println(o);
		System.out.println(o);
		System.out.println(o);
		System.out.println(o);
		System.out.println(o);
		
		
		
		
		
		
		
		
		
		// for(od kuda; do kuda; korak) petlja
		
		String s = "Vinkovci";
		System.out.println("3. ********************");
		for (int i=0; i<10; i+=1) {	// ili i=i+1
			System.out.println(s);
		}
		
		
		
		System.out.println("4. ********************");
		for (int i=0; i<10; i++) {
			System.out.println(i+1); 		// i+1 ne mijenja vrijednost varijable, nego umjesto od 0 krene od 1
		}
		
		
		
		System.out.println("5. ********************");
		for(int i=100;i>0;i-=5) {
			System.out.println(i);
		}
		
		
		System.out.println("6. ********************");
		// zbroj prvih 100 brojeva
		int zbroj=0;
		for(int i=1;i<=100;i++) {
			// System.out.println(i);
			zbroj+=i;
		}
		System.out.println(zbroj); 			// tu je rezultat 5050, ide po pravilu 		0		
											//											1		1
											//											2		3	znači 1 + 2 = 3
											//											3		6	znači 3 + 3 = 6 itd...

		
		
		
		// ispiši sve parne brojeve od 1 do 27
		
		// for(int i=2;i<=26;i+=2) { } 		// najgori mogući način
		
		
		System.out.println("7. ********************");	
		for(int i=1;i<=27;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		
		
		int[] niz = {2,2,3,4,5,5,6};
		
		// ispiši sve elemente niza jedno ispod drugog
		
		System.out.println("8. ********************");
		for(int i=0;i<niz.length;i++) {
			System.out.println(niz[i]);
		}
		
		
		
		
		
		
		
		// beskonačna petlja
		
		System.out.println("9. ********************");
//		for(int i=1;i>0;i++) { }	// OVO NIJE BESKONAČNA PETLJA
		
		
		for(;;) {
			System.out.println(Math.random());
			
			// nasilno prekidanje petlje
			break;
		}
		
		
		System.out.println("10. ********************");
		for(int i=0;i<10;i++) {
			if(i==7) {
				break;
			}
			System.out.println(i);
		}
		
		
		
		// petlju je moguće nastaviti/preskočiti
		
		System.out.println("11. ********************");
		for(int i=0;i<10;i++) {
			if(i==3 || i==7) { 			// preskače broj 3 i 7 
				continue;
			}
			System.out.println(i);
		}
		
		
		System.out.println("12. ********************");
		for(int i=0;i<10;i++) {
			if(i==3 || i==7) { 			// preskače broj 3 i 7 
				continue;
			}
			if(i==8) {
				break;
			}
			System.out.println(i);
		}
		
		
		
		
		System.out.println("13. ********************");			// tablica množenja
		// ugnježđivanje petlji
		
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				System.out.print(i*j + " ");
			}
			System.out.println();
		}
		
		
		
		
		//prekidanje unutarnjih petlji
		
		System.out.println("14. ********************");
		vanjska:
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				// break; 		// ovo prekida unutarnju petlju
								// prekidanje vanjske petlje
				break vanjska;
			}
		
		
	}
		
		
		
		// zanimljivo
		System.out.println("15. ********************");
		for(int i=0;i<10;i++);{		// ; višak, ali nije sintaksna greška
			System.out.println("Osijek");
		}

	}
	
}
