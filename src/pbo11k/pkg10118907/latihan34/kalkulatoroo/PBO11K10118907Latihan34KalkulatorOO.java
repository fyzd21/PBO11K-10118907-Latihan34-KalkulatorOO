/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan34.kalkulatoroo;

import java.util.Scanner;

/**
 *
 * @author programmer
 */
public class PBO11K10118907Latihan34KalkulatorOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("--Aplikasi kalkulator bilangan--\n");
        
        System.out.print("Masukkan Angka ke-1 : ");
        Scanner s = new Scanner(System.in);
        
        Kalkulator k = new Kalkulator();
        k.value1 = Double.parseDouble(s.next());
        
        
        System.out.print("Masukkan Angka ke-2 : ");
        Scanner s2 = new Scanner(System.in);
        
        k.value2 = Double.parseDouble(s2.next());
        
        System.out.println("\nHasil pertambahan : "+k.tambahBilangan());
        System.out.println("Hasil pengurangan : "+k.kurangBilangan());
        System.out.println("Hasil perkalian : "+k.kaliBilangan());
        System.out.println("Hasil pembagian : "+k.bagiBilangan());
        System.out.println("Hasil sisa : "+k.sisaBilangan());
    }
    
}
