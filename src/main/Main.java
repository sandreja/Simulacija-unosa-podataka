package main;

import domain.Asistent;
import domain.Osoba;
import domain.Profesor;
import domain.Student;


import java.util.ArrayList;
import java.util.Scanner;

//"Hocu da simuliramo unos podataka za fakultet gde unosimo podatke o zaposlenima i o studentima"
public class Main {
    public static Osoba vratiOsobu(Scanner scanner){
        System.out.println("Unesite ime:");
        String ime = scanner.next();
        System.out.println("Unesite prezime:");
        String prezime = scanner.next();
        System.out.println("Unesite broj godina:");
        int brojGodina = scanner.nextInt();

        Osoba osoba = new Osoba(ime, prezime, brojGodina);

        return osoba;
    }
    public static Profesor vratiProfesora(Scanner scanner){
        Osoba osoba = vratiOsobu(scanner);
        System.out.println("Unesite predmet koji predaje:");
        String predmet = scanner.next();

        Profesor profesor = new Profesor(osoba.getIme(), osoba.getPrezime(), osoba.getBrojGodina(), predmet);

        return profesor;
    }
    public static void ispis(){
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayList<Profesor> listaProfesora = new ArrayList<>();
        ArrayList<Student> listaStudenata = new ArrayList<>();
        ArrayList<Asistent> listaAsistenata = new ArrayList<>();

        while(true){
            System.out.println("Izaberite opciju: Student, Asistent, Profesor, SI, AI, PI, Ispis ili Izlaz");
            String vrstaKomande = scanner.next().toLowerCase();

            if(vrstaKomande.equals("izlaz")){
                break;
            }

            else if(vrstaKomande.equals("student")){
                Osoba osoba = vratiOsobu(scanner);
                System.out.println("Unesite broj indeksa studenta:");
                String brojIndexa = scanner.next();

                Student student = new Student(osoba.getIme(),osoba.getIme(),osoba.getBrojGodina(), brojIndexa);
                listaStudenata.add(student);
            }

            else if(vrstaKomande.equals("profesor")){
               Profesor profesor = vratiProfesora(scanner);
               listaProfesora.add(profesor);
            }

            else if(vrstaKomande.equals("asistent")){

                Profesor profesor = vratiProfesora(scanner);
                System.out.println("Unesite fond casova asistenta");
                int brojCasova = scanner.nextInt();

                Asistent asistent = new Asistent(profesor.getIme(),profesor.getPrezime(),profesor.getBrojGodina(),profesor.getPredmet(),brojCasova);

                listaAsistenata.add(asistent);
            }

            else if(vrstaKomande.equals("ispis")){
                System.out.println("Svi Studenti: ");
                for(Student student:listaStudenata) {
                    System.out.println(student);
                }
                System.out.println("Svi Asistenti: ");
                for(Asistent asistent:listaAsistenata) {
                    System.out.println(asistent);
                }
                System.out.println("Svi Profesori: ");
                for(Profesor profesor:listaProfesora) {
                    System.out.println(profesor);
                }
            }

            else if(vrstaKomande.equals("si")){
                if(listaStudenata.isEmpty()){
                    System.out.println("Niste uneli nijednog studenta!");
                }
                else
                    System.out.println("Svi Studenti: ");
                for(Student student:listaStudenata) {
                    System.out.println(student);
                }

            }

            else if(vrstaKomande.equals("ai")){
                if(listaAsistenata.isEmpty()){
                    System.out.println("Niste uneli nijednog asistenta!");
                }
                else{
                    System.out.println("Svi Asistenti: ");

                for(Asistent asistent:listaAsistenata) {
                    System.out.println(asistent);
                                                        }
                    }
                                            }

            else if(vrstaKomande.equals("pi")) {
                if (listaProfesora.isEmpty()) {
                    System.out.println("Niste uneli nijednoog profesora!");
                } else {
                    System.out.println("Svi Profesori: ");
                    for (Profesor profesor : listaProfesora) {
                        System.out.println(profesor);
                                                             }
                        }
                                                }
            else System.out.println("Uneli ste pogresnu komandu!");
        }
    }
}
