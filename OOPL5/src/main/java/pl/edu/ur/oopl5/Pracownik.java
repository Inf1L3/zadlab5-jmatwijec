/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

/**
 *
 * @author Kuba
 */
public class Pracownik{
    public String imie;      //
    public String nazwisko;  // Pola klasy osoba
    public int wiek;       
    public String stanowisko;//

    /* --------------------------
     * Constructors - 3 overloads
     * -------------------------- */
    // Konstruktor pierwszy
    public Pracownik(String imie, String nazwisko, int wiek, String stanowisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.stanowisko=stanowisko;
    }

    // Konstruktor drugi
    public Pracownik(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    // Konstruktor trzeci
    public Pracownik() {
    }

    /* -------
     * Methods
     * ------- */
    //Metoda pokazująca dane osoby
    public void pokazDane() {
        System.out.println("Osoba");
        System.out.println("imię: " + this.imie);
        System.out.println("nazwisko: " + this.nazwisko);
        System.out.println("wiek: " + this.wiek + " lat");
        System.out.println("stanowisko: " + this.stanowisko);
    }
    
}
