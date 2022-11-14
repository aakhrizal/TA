/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kepegawaian;

/**
 *
 * @author Akhrizal
 */
class GajiKaryawantetap extends Gaji {
    
    
    @Override
    void inputgaji(){
        System.out.print("Masukan Gaji Pokok : ");
        gaji_pokok = input.nextInt();
        System.out.print("Masukan Iuran Bpjs : ");
        bpjs = input.nextInt();
        System.out.print("Masukan Pinjaman : ");
        pinjaman = input.nextInt();
        System.out.println("Masukan Uang Makan (Perhari) : ");
        uang_makan = input.nextInt();
        System.out.println("Masukan Jumlah Hari Kerja : ");
        jumlahkerja = input.nextInt();

    }
    @Override
    int gajiditerima(){
        System.out.print("Gaji Yang Diterima : Rp.");
        totalgaji= ((gaji_pokok*jumlahkerja)+konsumsi)-(pinjaman+bpjs);
        System.out.println(+totalgaji);
        return 0;
    }
}
