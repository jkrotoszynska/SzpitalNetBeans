package backend;

public class Lekarz {
    private int idLekarza;
    private String imie, nazwisko; 
    private String specjalizacja, nazwaOddzialu;

    public Lekarz(int idLekarza, String imie, String nazwisko, String specjalizacja, String nazwaOddzialu) {
        this.idLekarza = idLekarza;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.specjalizacja = specjalizacja;
        this.nazwaOddzialu = nazwaOddzialu;
    }

    public int getIdLekarza() {
        return idLekarza;
    }

    public void setIdLekarza(int idLekarza) {
        this.idLekarza = idLekarza;
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

    public String getNazwaOddzialu() {
        return nazwaOddzialu;
    }

    public void setNazwaOddzialu(String nazwaOddzialu) {
        this.nazwaOddzialu = nazwaOddzialu;
    }
    
    
    
}
