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
public class Absensi {
    String nama;
    String Jabatan;
    int jumlah_kerjaperbulan;
    int libur;
    int cuti;
    int sakit;
    int totalmasuk;
    Scanner input = new Scanner(System.in);

    void inputAbsensi(){
        System.out.println("Absensi Pegawai : ");
        System.out.print("Nama : ");
        nama = input.nextLine();
        System.out.print("Jabatan :");
        Jabatan = input.nextLine();
        System.out.print("Jumlah Hari kerja Bulan ini : ");
        jumlah_kerjaperbulan = input.nextInt();
        System.out.print("Libur : ");
        libur = input.nextInt();
        System.out.print("Cuti :");
        cuti = input.nextInt();
        System.out.print("sakit : ");
        sakit = input.nextInt();
        totalmasuk=(jumlah_kerjaperbulan - (libur+cuti+sakit));
        System.out.print("Masuk Bulan Ini "+totalmasuk);
        System.out.println(" Hari");
    }
    
}
