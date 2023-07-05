package edunova;

import java.util.Arrays;

public class E03Nizovi {

	public static void main(String[] args) {

		// Treba unijeti temperature za 12 mjeseci

		// int t1=2;
		// int t2=3;
		// ..
		// int t12=7;

		// Ako želimo pohraniti u memoriji više vrijednosti istog tipa podataka
		// koristimo nizove/polja/arrays
		
		
		// Deklariranje
		int[] niz;
		String drugiNiz[];
		
		
		
		// Konstruiranje niza
		niz = new int[4];
		
		
		
		// Korištenje nizova
		// Na 1. mjesto u nizu
		niz[0]=2;
		niz[1]=4;
		niz[2]=7;
		// Na zadnje mjesto
		niz[niz.length-1]=8;
		
		
		// Ispiši broj 7
		System.out.println(niz[2]);
		
		System.out.println(Arrays.toString(niz));
		
		
		// Skraćena sintaksa
		int brojevi[] = {2,3,34,45,3,23,3};
		
		// Ispiši broj 45
		
		System.out.println(brojevi[3]);
		
		
		
		
		// Dvodimenzionalni niz
		int matrica[][] = new int[10][10]; // mogu pohraniti 100 vrijednosti
		
		int tablica[][] = {
				{0,2,3},
				{1,8,6},
				{1,2,9}
		}; // tablica 3x3
		
		// Ispiši broj 8
		
		System.out.println(tablica[1][1]);
		
		
		
		// Trodimenzionalni niz (Java može ići do 32 dimenzije)
		
		int kocka[][][] = new int[10][10][10]; // mogu pohraniti 1000 vrijednosti
		
		
		
		
		
		
		
		

	}

}















