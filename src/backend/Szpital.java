package backend;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Szpital")
@NamedQueries({
    @NamedQuery(name = "Szpital.findAll", query = "SELECT s FROM Szpital s"),
    @NamedQuery(name = "Szpital.findByNazwaOddzialu", query = "SELECT s FROM Szpital s WHERE s.nazwaOddzialu = :nazwaOddzialu"),
    @NamedQuery(name = "Szpital.findByNumerOddzialu", query = "SELECT s FROM Szpital s WHERE s.numerOddzialu = :numerOddzialu")})
public class Szpital implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nazwaOddzialu")
    private String nazwaOddzialu;
    @Column(name = "numerOddzialu")
    private Integer numerOddzialu;
    @OneToMany(mappedBy = "nazwaOddzialu")
    private Collection<HistoriaLeczen> historiaLeczenCollection;
    @OneToMany(mappedBy = "nazwaOddzialu")
    private Collection<Lekarz> lekarzCollection;

    public Szpital() {
    }

    public Szpital(String nazwaOddzialu) {
        this.nazwaOddzialu = nazwaOddzialu;
    }

    public String getNazwaOddzialu() {
        return nazwaOddzialu;
    }

    public void setNazwaOddzialu(String nazwaOddzialu) {
        this.nazwaOddzialu = nazwaOddzialu;
    }

    public Integer getNumerOddzialu() {
        return numerOddzialu;
    }

    public void setNumerOddzialu(Integer numerOddzialu) {
        this.numerOddzialu = numerOddzialu;
    }

    public Collection<HistoriaLeczen> getHistoriaLeczenCollection() {
        return historiaLeczenCollection;
    }

    public void setHistoriaLeczenCollection(Collection<HistoriaLeczen> historiaLeczenCollection) {
        this.historiaLeczenCollection = historiaLeczenCollection;
    }

    public Collection<Lekarz> getLekarzCollection() {
        return lekarzCollection;
    }

    public void setLekarzCollection(Collection<Lekarz> lekarzCollection) {
        this.lekarzCollection = lekarzCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nazwaOddzialu != null ? nazwaOddzialu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Szpital)) {
            return false;
        }
        Szpital other = (Szpital) object;
        if ((this.nazwaOddzialu == null && other.nazwaOddzialu != null) || (this.nazwaOddzialu != null && !this.nazwaOddzialu.equals(other.nazwaOddzialu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "backend.Szpital[ nazwaOddzialu=" + nazwaOddzialu + " ]";
    }
    
}
