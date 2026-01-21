package domain;
//indeks
public class Student extends Osoba{
    private String brojIndexa;

    public Student(String ime, String prezime, int brojGodina, String brojIndexa) {
        super(ime, prezime, brojGodina);
        this.brojIndexa = brojIndexa;
    }

    public String getBrojIndexa() {
        return brojIndexa;
    }

    public void setBrojIndexa(String brojIndexa) {
        this.brojIndexa = brojIndexa;
    }
    @Override
    public String toString(){
        return "Student - Ime: " + getIme() + "; Prezime: " + getPrezime() + "; Broj Godina: " + getBrojGodina() + "; Broj indeksa: " + brojIndexa;
    }
}
