package domain;
//koliko casova ce da ima asistent / fond casova
public class Asistent extends Profesor {
    private int brojCasova;

    public Asistent(String ime, String prezime, int brojGodina, String predmet, int brojCasova) {
        super(ime, prezime, brojGodina, predmet);
        this.brojCasova = brojCasova;
    }

    public void setBrojCasova(int brojCasova) {
        this.brojCasova = brojCasova;
    }


    public int getBrojCasova() {
        return brojCasova;
    }
    @Override
    public String toString() {
        return "Asistent Ime: " + getIme() + "; Prezime: " + getPrezime() + "; Broj Godina: " + getBrojGodina() + "; Predaje predmet: " + getPredmet() + "; sa fondom casova:" + brojCasova;

    }

}
/*  public Asistent(String ime, String prezime, int brojGodina, int brojCasova) {
            super(ime, prezime, brojGodina);
            this.brojCasova = brojCasova;
        } */


