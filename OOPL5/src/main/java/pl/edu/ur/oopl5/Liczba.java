/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

import java.util.Arrays;

/**
 *
 * @author Kuba
 */
public class Liczba {

    public int[] iarray;
    public int liczba;
    public int len;

    public Liczba(int n) {
        //  zrodlo https://stackoverflow.com/questions/14743165/simple-number-to-array-with-individual-digits
        int number = 1234567890;
        int len = Integer.toString(number).length();
        this.len = len;
        int[] iarray = new int[len];
        for (int index = 0; index < len; index++) {
            iarray[index] = number % 10;
            number /= 10;
        }
    }

    public void wypisz() {
         System.out.print("test");
        for (int i = len; i >= 0; i--) {
            System.out.print(iarray[i]);
        }
    }
    public void pomnoz(int n)
    {
        Arrays.stream(iarray).map(i -> i * n).forEach(System.out::println); //https://stackoverflow.com/questions/28462276/multiply-each-number-in-an-array-by-n-java?rq=1&utm_medium=organic&utm_source=google_rich_qa&utm_campaign=google_rich_qa
    }
    public int silnia(int i) {
        if (i < 1) {
            return 1;
        } else {
            return i * silnia(i - 1);
        }
    }
}
