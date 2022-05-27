package backend;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "HistoriaLeczen")
@NamedQueries({
    @NamedQuery(name = "HistoriaLeczen.findAll", query = "SELECT h FROM HistoriaLeczen h"),
    @NamedQuery(name = "HistoriaLeczen.findById", query = "SELECT h FROM HistoriaLeczen h WHERE h.id = :id"),
    @NamedQuery(name = "HistoriaLeczen.findByChoroba", query = "SELECT h FROM HistoriaLeczen h WHERE h.choroba = :choroba"),
    @NamedQuery(name = "HistoriaLeczen.findByDataPrzyjecia", query = "SELECT h FROM HistoriaLeczen h WHERE h.dataPrzyjecia = :dataPrzyjecia"),
    @NamedQuery(name = "HistoriaLeczen.findByDataWypisu", query = "SELECT h FROM HistoriaLeczen h WHERE h.dataWypisu = :dataWypisu"),
    @NamedQuery(name = "HistoriaLeczen.findByIdLekarza", query = "SELECT h FROM HistoriaLeczen h WHERE h.idLekarza.idLekarza = :idLekarza"),
    @NamedQuery(name = "HistoriaLeczen.findByPesel", query = "SELECT h FROM HistoriaLeczen h WHERE h.pesel.pesel = :pesel")})
public class HistoriaLeczen implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private BigDecimal id;
    @Column(name = "choroba")
    private String choroba;
    @Column(name = "dataPrzyjecia")
    @Temporal(TemporalType.DATE)
    private Date dataPrzyjecia;
    @Column(name = "dataWypisu")
    @Temporal(TemporalType.DATE)
    private Date dataWypisu;
    @JoinColumn(name = "idLekarza", referencedColumnName = "idLekarza")
    @ManyToOne
    private Lekarz idLekarza;
    @JoinColumn(name = "pesel", referencedColumnName = "pesel")
    @ManyToOne(optional = false)
    private Pacjent pesel;
    @JoinColumn(name = "nazwaOddzialu", referencedColumnName = "nazwaOddzialu")
    @ManyToOne
    private Szpital nazwaOddzialu;

    public HistoriaLeczen() {
    }

    public HistoriaLeczen(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getChoroba() {
        return choroba;
    }

    public void setChoroba(String choroba) {
        this.choroba = choroba;
    }

    public Date getDataPrzyjecia() {
        return dataPrzyjecia;
    }

    public void setDataPrzyjecia(Date dataPrzyjecia) {
        this.dataPrzyjecia = dataPrzyjecia;
    }

    public Date getDataWypisu() {
        return dataWypisu;
    }

    public void setDataWypisu(Date dataWypisu) {
        this.dataWypisu = dataWypisu;
    }

    public Lekarz getIdLekarza() {
        return idLekarza;
    }

    public void setIdLekarza(Lekarz idLekarza) {
        this.idLekarza = idLekarza;
    }

    public Pacjent getPesel() {
        return pesel;
    }

    public void setPesel(Pacjent pesel) {
        this.pesel = pesel;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof HistoriaLeczen)) {
            return false;
        }
        HistoriaLeczen other = (HistoriaLeczen) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "backend.HistoriaLeczen[ id=" + id + " ]";
    }
    
}
