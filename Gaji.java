/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kepegawaian;

/**
 *
 * @author Akhrizal
 */
import java.util.Scanner;
public class Gaji {
    int gaji_pokok,bpjs,pinjaman,uang_makan,bonus,totalgaji,bensin,konsumsi,jumlahkerja;
    String bulangaji;
    Scanner input = new Scanner(System.in);
    
    void inputgaji(){
        System.out.print("Masukan Gaji Pokok : ");
        gaji_pokok = input.nextInt();
        System.out.print("Masukan Iuran Bpjs : ");
        bpjs = input.nextInt();
        System.out.print("Masukan Pinjaman : ");
        pinjaman = input.nextInt();
        System.out.println("Masukan Uang Makan (Perhari) : ");
        uang_makan = input.nextInt();
        System.out.println("Masukan Bonus :");
        bonus = input.nextInt();
        System.out.println("Masukan Bensin Per bulan : ");
        bensin = input.nextInt();
    }
    
    int gajiditerima(){
        System.out.println("Perhitungan Gaji : ");
        return 0;
    }
    
   
}
