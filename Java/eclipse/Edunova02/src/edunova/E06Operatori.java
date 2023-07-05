package edunova;

public class E06Operatori {
	
	public static void main(String[] args) {
		
		// Čitati: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/oprsummary.html
		
		
		
		// Operator dodjeljivanja =
		int i=2;
		
		// Provjera jednakosti ==
		boolean b = i==2;
		
		System.out.println(b);
		
		// Različito !=
		
		// Logički su and &, or (altgr+W) |, not ! -> detaljnije u if naredbi
		boolean k=false;
		System.out.println(k & b);
		
		// Modulo %, npr. 9%2, % se čita kao modulo, 9 podijeljeno s 2 je 4 i ostane 1 cijelo
		boolean parniBroj = 8%2==0;
		System.out.println(parniBroj);
	}

}
