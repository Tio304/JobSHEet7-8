/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet7.pkg8;

import java.util.Scanner;
/**
 *
 * @author USER
 */
public class tagihanlistrik {
    public static void main (String[] args)  {
        
        //deklarasi
        int kwh;
        int biaya;
        double Total;
        
        //scanner
        Scanner cimeng = new Scanner(System.in);
        
        //input kWh
        System.out.println("Tagihan Listrik Anda");
        System.out.print("silahkan masukan jumlah listrik kWh yang anda gunakan dalam 1 bulan ");
        int kWh = cimeng.nextInt();
        
        //penggolongan
        if(kWh <=450) {
          System.out.println("Anda Masuk Kategori C (HEMAT)");
          biaya = 2000 + (1000 * kWh);
          System.out.println("Biaya " + "Rp." + biaya);
          Total = Double.valueOf((biaya * 10 / 100) + biaya);
          System.out.println("Biaya total: " + Total);
        } else if (kWh <=900)  {
            System.out.println("Anda Masuk Kategori B (NORMAL)");
            biaya = 3500 + (2500 * kWh);
            System.out.println("Biaya " + "Rp." + biaya);
            Total = Double.valueOf((biaya * 15 / 100) + biaya);
            System.out.println("Biaya total: " + Total);
        } else if (kWh <1200)  {
            System.out.println("Anda Masuk Kategori A (NOLEP)");
            biaya = 5000 + (3000 * kWh);
            System.out.println("Biaya " + "Rp." + biaya);
            Total = Double.valueOf((biaya * 20 / 100) + biaya);
            System.out.println("Biaya total: " + Total);
        } else
            System.out.println("UNTUK +1200 KWH BELUM ADA TUGAS !!!!!!!!");
    }
    
    
}
