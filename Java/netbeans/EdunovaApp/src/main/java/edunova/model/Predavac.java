package edunova.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Predavac extends Osoba {

    private String iban;

    @OneToMany(mappedBy = "predavac")
    private List<Grupa> grupe = new ArrayList<>();

    public List<Grupa> getGrupe() {
        return grupe;
    }

    public void setGrupe(List<Grupa> grupe) {
        this.grupe = grupe;
    }

    public Predavac() {
        super();
    }

    public Predavac(String ime, String prezime) {
        super(ime, prezime);

    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

}
