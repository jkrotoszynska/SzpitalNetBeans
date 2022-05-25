package backend;

public class Szpital {
    
    private String nazwaOddzialu; 
    private int numerOddzialu;

    public Szpital(String nazwaOddzialu, int numerOddzialu) {
        this.nazwaOddzialu = nazwaOddzialu;
        this.numerOddzialu = numerOddzialu;
    }

    public String getNazwaOddzialu() {
        return nazwaOddzialu;
    }

    public void setNazwaOddzialu(String nazwaOddzialu) {
        this.nazwaOddzialu = nazwaOddzialu;
    }

    public int getNumerOddzialu() {
        return numerOddzialu;
    }

    public void setNumerOddzialu(int numerOddzialu) {
        this.numerOddzialu = numerOddzialu;
    }
    
    
}
