/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashing;

import java.util.HashMap;

/**
 *
 * @author asus
 */
public class NewClass extends Auth{
    
    int loginhitung = 0;
    
    int logout_hitung = 0;
    
    int pileh = 0;
      HashMap<String, String> tabelSesiLogin = new HashMap<String, String>();

    public boolean loginAkun(String email, String password){
        
        System.out.println("pilihan");
        System.out.println("1.login");
        System.out.println("2.register");
        System.out.println("3.exit");
        System.out.print("Pilih : ");
        pileh = input.nextInt();
        switch (pileh) {
            case 1:
                System.out.println("Login");
                System.out.print("masukkan Email : ");
                email = input.next();
                System.out.print("masukkan Password : ");
                password = input.next();
                if(tabelAkun.containsKey(email) == true && tabelAkun.containsValue(password) == true){ 
                    tabelSesiLogin.put(email, password);
                    loginhitung+=1;
                    System.out.println("Berhasil login");
                    home(email,password);
                } else {
                    System.out.println("Login gagal silahkan login kembali!");
                    loginAkun(email, password);
                }   break;
            case 2:
                registerAkun(email, password);
                break;
            case 3:
                System.exit(0);
            default:
                break;
        }
        
        return false;
    }
    
    public boolean logoutAkun(String email){
        System.out.println("Logout");
        System.out.print("Masukkan email : ");
        email = input.next();
        if(tabelSesiLogin.containsKey(email) == true){
            tabelSesiLogin.remove(email);
            logout_hitung+=1;
            System.out.println("logout berhasil");
        }else{
            System.out.println("Logout gagal");
            logoutAkun(email);
        }
        return false;
        
    }
    
    public int totalLogout(){
        
        System.out.println("Akun yang logout : " + logout_hitung);
        return 0;
        
    }
    public int totalLogin(){
        
        System.out.println("Akun yang login : " + loginhitung);
        return 0;
        
    }
    public int totalAuth(){
        
        System.out.println("Total data yang sedang login");
        System.out.println("Total : "+tabelSesiLogin.size());
        return 0;
        
    }
    
    public void home(String email, String password){
        System.out.println("login berhasil");
        System.out.println("Menu");
        System.out.println("1.Total Akun yang login");
        System.out.println("2.Total Akun yang logout");
        System.out.println("3.Total Akun yang dengan login ");
        System.out.println("4.Total Akun dengan email UMM");
        System.out.println("5.Hapus Akun");
        System.out.println("6.logout");
        System.out.print("Pilih : ");
        pileh = input.nextInt();
        switch (pileh) {
            case 1:
                totalLogin();
                home(email,password);
                break;
            case 2:
                totalLogout();
                home(email,password);
                break;
            case 3:
                totalAuth();
                home(email,password);
                break;
            case 4:
                totalEmailUMM();
                home(email,password);
                break;
            case 5:
                String konfirmasiPassword = "";
                password = konfirmasiPassword;
                hapus(email, password);
                home(email,password);
                break;
            case 6:
                logoutAkun(email);
                loginAkun(email,password);
                break;
            default:
                break;
        }
        
    }
    public void hapus(String email, String konfirmasiPassword){
        hapusAkun(email, konfirmasiPassword);
    }
    
}
