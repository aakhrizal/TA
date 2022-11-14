 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kepegawaian;

/**
 *
 * @author Akhrizal
 */
class Biodata {
    String nama , alamat, jabatan, ttl, jeniskelamin,status;
            int id,notelpon;
            
    Biodata(int id, String name, String address, int telepon, String divisi, String born, String kelamin, String status){
        this.id = id;
        this.nama = name;
        this.alamat = address;
        this.notelpon = telepon;
        this.jabatan = divisi;
        this.ttl = born;
        this.jeniskelamin = kelamin;
        this.status = status;
    }
    
    public void tampil(){
        System.out.println("Data Karyawan : ");
        System.out.println(" Id = " +this.id);
        System.out.println("Nama = "+this.nama);
        System.out.println("Alamamat = "+this.alamat);
        System.out.println("No Telepon = "+this.notelpon);
        System.out.println("Jabatan = "+this.jabatan);
        System.out.println("Tempat Tanggal Lahir = "+this.ttl);
        System.out.println("Janis Kelamin = "+this.jeniskelamin);
        System.out.println("Status Pernikahan = "+this.status);
        System.out.println("");
    }
     
}
