package edunova;

import java.util.ArrayList;
import java.util.List;

import edunova.model.Grupa;
import edunova.model.Polaznik;
import edunova.model.Smjer;

public class ObradaGrupa {
	
	
	private List<Grupa> grupe;
	private Izbornik izbornik;
	
	public ObradaGrupa() {
		grupe=new ArrayList<>();
	}
	
	public ObradaGrupa(Izbornik izbornik) {
		this();
		this.izbornik=izbornik;
	}
	
	public void prikaziIzbornik() {
		System.out.println("Grupa izbornik");
		System.out.println("1. Pregled postojećih grupa");
		System.out.println("2. Unos nove grupe");
		System.out.println("3. Promjena postojeće grupe");
		System.out.println("4. Brisanje postojeće grupe");
		System.out.println("5. Povratak na prethodni izbornik");
		ucitajStavkuIzbornika();
	}

	private void ucitajStavkuIzbornika() {
		int odabir=Pomocno.unosRasponBroja("Odaberi stavku smjer izbornika: ", 
				"Odabir mora biti 1-5", 1, 5);
		if(odabir==5) {
			return;
		}
		switch (odabir) {
		case 1 ->pregledGrupa();
		case 2 ->dodavanjeGrupe();
		// case 3 ->promjenaSmjera();
		// case 4 ->brisanjeSmjera();
		}
		prikaziIzbornik();
	
	}
	
	private void pregledGrupa() {
		for(Grupa g : grupe) {
			System.out.println("\t" + g.getNaziv() + " (" + g.getSmjer().getNaziv() + ")");
			for(Polaznik p : g.getPolaznici()) {
				System.out.println("\t\t" + p);
			}
		}
	}

	private void dodavanjeGrupe() {
		Grupa g=new Grupa();
		g.setSifra(Pomocno.unosRasponBroja("Unesi šifru smjera: ", "Pozitivan broj",
				1,Integer.MAX_VALUE));
		g.setNaziv(Pomocno.unosString("Unesi naziv smjera: ", "Naziv obavezan"));
		g.setSmjer(ucitajSmjer());
		// predavač isto
		g.setPolaznici(ucitajPolaznike());
		
		
		grupe.add(g); 
	}

	private List<Polaznik> ucitajPolaznike() {
		List<Polaznik> polaznici=new ArrayList<>();
		
		while(Pomocno.unosRasponBroja("Dodati polaznika (1 da, 2 ne): ", "Greška", 1, 2)==1) {
			polaznici.add(ucitajPolaznika());
		}
		
		
		return polaznici;
	}

	private Polaznik ucitajPolaznika() {
		izbornik.getObradaPolaznik().pregledPolaznika();
		int broj=Pomocno.unosRasponBroja("Odaberite polaznika za dodavanje na grupu", "Greška", 1, 
				izbornik.getObradaPolaznik().getPolaznici().size());
		
		return izbornik.getObradaPolaznik().getPolaznici().get(broj-1);
	}

	private Smjer ucitajSmjer() {
		izbornik.getObradaSmjer().pregledSmjerova();
		int broj=Pomocno.unosRasponBroja("Odaberite smjer za grupu: ", "Greška", 1, 
				izbornik.getObradaSmjer().getSmjerovi().size());
		
		return izbornik.getObradaSmjer().getSmjerovi().get(broj-1);
	}
	

}
