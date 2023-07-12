package edunova;

import java.util.ArrayList;
import java.util.List;

import edunova.model.Polaznik;

public class ObradaPolaznik {
	
	private List<Polaznik> polaznici;
	
	
	public List<Polaznik> getPolaznici() {
		return polaznici;
	}

	public ObradaPolaznik() {
		polaznici=new ArrayList<>();
		if(Pomocno.DEV) {
			testniPodaci();
		}
	}
	
	private void testniPodaci() {
		polaznici.add(new Polaznik("Karlo","Let"));
		polaznici.add(new Polaznik("Marija","Satik"));
		polaznici.add(new Polaznik("Pero","Perić"));
		polaznici.add(new Polaznik("Josipa","Leticia"));
		
	}

	public void prikaziIzbornik() {
		System.out.println("Polaznik izbornik");
		System.out.println("1. Pregled postojećih polaznika");
		System.out.println("2. Unos novog polaznika");
		System.out.println("3. Promjena postojećeg polaznika");
		System.out.println("4. Brisanje postojećeg polaznika");
		System.out.println("5. Povratak na prethodni izbornik");
		ucitajStavkuIzbornika();
	}
	
	private void ucitajStavkuIzbornika() {
		switch(Pomocno.unosRasponBroja("Odaberi stavku polaznik izbornika: ", 
				"Odabir mora biti 1-5", 1, 5)) {
		case 1:
			pregledPolaznika();
			prikaziIzbornik();
			break;
		case 2:
			dodavanjePolaznika();
			prikaziIzbornik();
			break;
		case 5:
			break;
		}
		
	}

	public void pregledPolaznika() {
		System.out.println("---------------- Polaznici u aplikaciji -----------------");
		int b=1;
		for(Polaznik p : polaznici) {
			System.out.println(b++ + ". " + p);
		}
		System.out.println("---------------------------------------------------------");
		
	}

	private void dodavanjePolaznika() {
		var p=new Polaznik();
		p.setIme(Pomocno.unosString("Unesi ime polaznika: ", "Ime obavezno"));
		p.setPrezime(Pomocno.unosString("Unesi prezime polaznika: ", "Prezime obavezno"));
		// Ostala svojstva kasnije
		polaznici.add(p);
		
	}
	

}
