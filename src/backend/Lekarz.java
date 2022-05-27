package backend;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Lekarz")
@NamedQueries({
    @NamedQuery(name = "Lekarz.findAll", query = "SELECT l FROM Lekarz l"),
    @NamedQuery(name = "Lekarz.findByIdLekarza", query = "SELECT l FROM Lekarz l WHERE l.idLekarza = :idLekarza"),
    @NamedQuery(name = "Lekarz.findByHaslo", query = "SELECT l FROM Lekarz l WHERE l.haslo = :haslo"),
    @NamedQuery(name = "Lekarz.findByImie", query = "SELECT l FROM Lekarz l WHERE l.imie = :imie"),
    @NamedQuery(name = "Lekarz.findByNazwisko", query = "SELECT l FROM Lekarz l WHERE l.nazwisko = :nazwisko"),
    @NamedQuery(name = "Lekarz.findBySpecjalizacja", query = "SELECT l FROM Lekarz l WHERE l.specjalizacja = :specjalizacja"),
    @NamedQuery(name = "Lekarz.findByIdLekarzaAndHaslo", query = "SELECT l FROM Lekarz l WHERE l.idLekarza = :idLekarza AND l.haslo = :haslo")})
public class Lekarz implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idLekarza")
    private Long idLekarza;
    @Column(name = "haslo")
    private String haslo;
    @Column(name = "imie")
    private String imie;
    @Column(name = "nazwisko")
    private String nazwisko;
    @Column(name = "specjalizacja")
    private String specjalizacja;
    @OneToMany(mappedBy = "idLekarza")
    private Collection<HistoriaLeczen> historiaLeczenCollection;
    @JoinColumn(name = "nazwaOddzialu", referencedColumnName = "nazwaOddzialu")
    @ManyToOne
    private Szpital nazwaOddzialu;

    public Lekarz() {
    }

    public Lekarz(Long idLekarza) {
        this.idLekarza = idLekarza;
    }

    public Long getIdLekarza() {
        return idLekarza;
    }

    public void setIdLekarza(Long idLekarza) {
        this.idLekarza = idLekarza;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getSpecjalizacja() {
        return specjalizacja;
    }

    public void setSpecjalizacja(String specjalizacja) {
        this.specjalizacja = specjalizacja;
    }

    public Collection<HistoriaLeczen> getHistoriaLeczenCollection() {
        return historiaLeczenCollection;
    }

    public void setHistoriaLeczenCollection(Collection<HistoriaLeczen> historiaLeczenCollection) {
        this.historiaLeczenCollection = historiaLeczenCollection;
    }

    public Szpital getNazwaOddzialu() {
        return nazwaOddzialu;
    }

    public void setNazwaOddzialu(Szpital nazwaOddzialu) {
        this.nazwaOddzialu = nazwaOddzialu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLekarza != null ? idLekarza.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Lekarz)) {
            return false;
        }
        Lekarz other = (Lekarz) object;
        if ((this.idLekarza == null && other.idLekarza != null) || (this.idLekarza != null && !this.idLekarza.equals(other.idLekarza))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "backend.Lekarz[ idLekarza=" + idLekarza + " ]";
    }
    
}
