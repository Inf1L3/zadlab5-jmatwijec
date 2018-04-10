/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

import java.util.Scanner;

/**
 *
 * @author Kuba
 */
public class Firma {

    private Pracownik lista[] = new Pracownik[100];
    Scanner odczyt;

    public Firma() {
        for (int i = 0; i < 100; i++) {
            lista[i] = new Pracownik("", "", 0, "");
        }
    }

    public void dodaj() {
        System.out.println("Ktora pozycja?: ");
        int indeks = odczyt.nextInt();
        System.out.println("Imie: ");
        String imie = odczyt.nextLine();
        System.out.println("Nazwisko: ");
        String nazwisko = odczyt.nextLine();
        System.out.println("Wiek: ");
        int wiek = odczyt.nextInt();
        System.out.println("Stanowisko : ");
        String stanowisko = odczyt.nextLine();
        lista[indeks] = new Pracownik(imie, nazwisko, wiek, stanowisko);
    }

    public void usun() {
        System.out.println("Ktora pozycja?: ");
        int indeks = odczyt.nextInt();
        if (indeks >= 0 && indeks < 100) {
            lista[indeks] = new Pracownik("", "", 0, "");
        }
    }

    public void wyswietl() {
        for (int i = 0; i < 100; i++) {
            lista[i].pokazDane();
        }
    }

    public void wybieranie() {
        int liczba = 0;
        while (liczba != 4) {
            System.out.println("Co chcesz zrobic? 1. Dodac pracowanika 2. Usunac 3. Wyswietlic liste? 4.Wyjsc");
            liczba = odczyt.nextInt();
            switch(liczba)
            {
                case 1:
                    dodaj();
                    break;
                case 2:
                    usun();
                    break;
                case 3:
                    wyswietl();
                    break;
                default:
                    System.out.println("zly numer");
                        
            }
            
        }
    }
}
