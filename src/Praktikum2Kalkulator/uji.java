/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2Kalkulator;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class uji {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Bilangan 1 = ");
        int bil1 = sc.nextInt();
        System.out.print("Masukan Bilangan 2 = ");
        int bil2 = sc.nextInt();
        
        kalkulator kal = new kalkulator(bil1,bil2);
        System.out.println("\n");
        System.out.println("Hasil Jumlah = "+kal.penjumlahan());
        System.out.println("Hasil Kurang = "+kal.pengurangan());
        System.out.println("Hasil Kali   = "+kal.perkalian());
        System.out.println("Hasil Bagi   = "+kal.pembagian());
    }
}
