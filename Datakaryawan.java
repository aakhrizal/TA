/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kepegawaian;

/**
 *
 * @author Akhrizal
 */
import java.util.ArrayList;
public class Datakaryawan {
        ArrayList<Biodata> Datakaryawan = new ArrayList<>();
        
        void tambahbarang(Biodata data){
         this.Datakaryawan.add(data);
        }
        
        void tampildata(){
            System.out.println("================");
            this.Datakaryawan.forEach(karyawan -> {
                karyawan.tampil();
            });
        }
        
        void editdata(Biodata data){
            this.Datakaryawan.set(0, data);
        }
        
        void hapusdata(int hapus){
            this.Datakaryawan.removeIf(karyawan -> karyawan.id == hapus);
        }
        

}
