package domain;
//predmet koji predaje
public class Profesor extends Osoba {
    private String predmet;

    public Profesor(String ime, String prezime, int brojGodina, String predmet) {
        super(ime, prezime, brojGodina);
        this.predmet = predmet;
    }
    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public String getPredmet() {
        return predmet;
    }
    @Override
    public String toString() {
        return "Profesor - Ime: " + getIme() + "; Prezime: " + getPrezime() + "; Broj Godina: " + getBrojGodina() + "; Predaje predmet: " + predmet;

    }


}

