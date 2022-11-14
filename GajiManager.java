/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kepegawaian;

/**
 *
 * @author Akhrizal
 */
public class GajiManager extends Gaji{
    
    @Override
    void inputgaji(){
        System.out.print("Masukan Gaji Pokok : Rp.");
        gaji_pokok = input.nextInt();
        System.out.print("Masukan Bonus : Rp.");
        bonus = input.nextInt();
        System.out.print("Masukan Iuran Bpjs : Rp.");
        bpjs = input.nextInt();
        System.out.print("Masukan Pinjaman : Rp.");
        pinjaman = input.nextInt();
        System.out.println("Masukan Uang Makan (Perhari) : Rp.");
        uang_makan = input.nextInt();
        System.out.println("Masukan Jumlah Hari Kerja : Rp.");
        jumlahkerja = input.nextInt();

    }
    @Override
    int gajiditerima(){
        System.out.print("Gaji Yang Diterima : Rp.");
        totalgaji= ((gaji_pokok*jumlahkerja)+konsumsi+bonus)-(pinjaman+bpjs);
        System.out.println(+totalgaji);
        return 0;
    }
    
}
