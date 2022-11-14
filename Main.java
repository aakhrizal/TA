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
public class Main {
    public static void main (String[] args)throws Exception{
        String username,password ;
        Scanner input = new Scanner(System.in);
        Login masuk = new Login();
        System.out.println("=======Masuk=======");
        System.out.print("Username : ");
        username = input.nextLine();
        System.out.print("Pasword : ");
        password = input.nextLine();
    if(username.equals(masuk.getUsername()) && password.equals(masuk.getPasword()))
    {
        System.out.println("=============================");
        System.out.println("       Login Berhasil         ");
        System.out.println("Selamat Datang "+masuk.getUsername());
        System.out.println("===============================");
    }
    else {
        System.out.println("============================");
        System.out.println(" username dan pasword salah");
        System.out.println("===========================");
    do{
        System.out.println("===========MASUK========");
        System.out.println("Masukan Username : ");
        username = input.nextLine();
        System.out.println("Masukan Password : ");
        password = input.nextLine();
        System.out.println("===========================");
    } while(username.equals(masuk.getUsername())&& password.equals(masuk.getPasword()));    
    }
        Gaji gaji = new Gaji();
        GajiKaryawantetap gajitetap = new GajiKaryawantetap();
        GajiManager manager = new GajiManager();
        Gajikaryawankontrak gajikontrak = new Gajikaryawankontrak();
       
        System.out.println("Gaji Pegawai Tetap :");
        gajitetap.inputgaji();
        gajitetap.gajiditerima();
        System.out.println("Gaji Pegawai Kontrak:");
        gajikontrak.inputgaji();
        gajikontrak.gajiditerima();
        System.out.println("Gaji Manager : ");
        manager.inputgaji();
        manager.gajiditerima();
        
        
        
    }
    
}
