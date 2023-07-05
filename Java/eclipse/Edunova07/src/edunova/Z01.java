package edunova;

public class Z01 {
	
	// Kreirati klasu Grad s minimalno 5 različitih svojstava (različitih tipova podataka)
	// Ovdje u main metodi napraviti instancu klase Grad, dodijeliti vrijednosti za sva svojstva
	// te po želji ispisati jedno svojstvo
	
	public static void main(String[] args) {
		
		
		Grad grad=new Grad();
		
		grad.setNaziv("Osijek");
		
		grad.setStanovnika(56000);
		
		grad.setCrkvaKatolicka(true);
		
		grad.setEnergetskiCertifikat('C');
		
		grad.setBdp(78345.7);
		
		System.out.println(grad.isCrkvaKatolicka());
		
		
	}

}
