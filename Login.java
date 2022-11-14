/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kepegawaian;

/**
 *
 * @author Akhrizal
 */
public class Login {
    private String Username, Pasword;
    
    public Login(){
        Username = "admin";
        Pasword = "admin";
    }
    
    public Login(String username , String pass){
        this.Username = username;
        this.Pasword = pass;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPasword() {
        return Pasword;
    }

    public void setPasword(String Pasword) {
        this.Pasword = Pasword;
    }
    
}
