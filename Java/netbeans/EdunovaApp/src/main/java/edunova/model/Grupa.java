package edunova.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import java.util.Date;
import java.util.List;


@Entity
public class Grupa extends Entitet {
	
	private String naziv;
                  @ManyToOne
	private Smjer smjer;
	private Integer maxPolaznika;
                  @ManyToOne
	private Predavac predavac;
	private Date datumPocetka;
                  
                  @ManyToMany
	private List<Polaznik> polaznici;
	
	
	
	
	
	
	
	
	
	public Grupa() {
		super();
	}
		
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public Smjer getSmjer() {
		return smjer;
	}
	public void setSmjer(Smjer smjer) {
		this.smjer = smjer;
	}
	public int getMaxPolaznika() {
		return maxPolaznika;
	}
	public void setMaxPolaznika(int maxPolaznika) {
		this.maxPolaznika = maxPolaznika;
	}
	public Predavac getPredavac() {
		return predavac;
	}
	public void setPredavac(Predavac predavac) {
		this.predavac = predavac;
	}
	public Date getDatumPocetka() {
		return datumPocetka;
	}
	public void setDatumPocetka(Date datumPocetka) {
		this.datumPocetka = datumPocetka;
	}
	public List<Polaznik> getPolaznici() {
		return polaznici;
	}
	public void setPolaznici(List<Polaznik> polaznici) {
		this.polaznici = polaznici;
	}
	




}
	

	
	
	
	
	
	
	
	
	
	


