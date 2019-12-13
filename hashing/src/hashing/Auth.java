
package hashing;

import java.util.HashMap;
import java.util.Scanner;

 
public class Auth {
    Scanner input = new Scanner(System.in);
    int pileh = 0;
    int loginhitung = 0;
    
    int logout_hitung = 0;
    
    
    
    
    //Kegiatan 1 tabel data akun
    HashMap<String, String> tabelAkun = new HashMap<String, String>();
    public boolean dataAkun(){
        tabelAkun.put("labit@umm.ac.id", "Labit321");
        tabelAkun.put("kharismamuzaki@gmail.com", "Testing123");
        tabelAkun.put("byasageng@gmail.com", "cobaLagi321");
        tabelAkun.put("dosen.tersayang@umm.ac.id", "Labit321");
        tabelAkun.put("email.saya@umm.ac.id", "email_Student");
        return false;
    }
    
    
    public boolean registerAkun(String email, String password)
    {
        System.out.println("Pendaftaran akun");
        System.out.print("masukkan email : ");
        email = input.next();
        System.out.print("masukkan password : ");
        password = input.next();
        
        if(tabelAkun.containsKey(email) == true){
            System.out.println("gagal input, email sudah terdaftar");
            System.out.println("Pilihan");
            System.out.println("1.register kembali");
            System.out.println("2.login");
            pileh = input.nextInt();
            if(pileh == 1){
                registerAkun(email, password);
            }else if(pileh == 2){
                loginAkun(email, password);
            }
            
            
            
        }else{
            tabelAkun.put(email,password);   
            System.out.println("Register sukses !!! silahkan login kembali :");
            loginAkun(email, password);
        }
        
        
        return false;
    }
    
    
    
    public boolean hapusAkun(String email, String konfirmasiPassword)
    {
        System.out.println("Hapus akun");
        System.out.println("masukkan email :");
        email = input.next();
        System.out.println("masukkan konfirmasi password :");
        konfirmasiPassword = input.next();
        if(tabelAkun.containsKey(email) == true && tabelAkun.containsValue(konfirmasiPassword) == true){
            if(tabelSesiLogin.containsKey(email) == true){
                System.out.println("Data akun masih digunakan");
            }else{
                tabelAkun.remove(email);  
                System.out.println("Berhasil hapus data");
            }
        } else {
            System.out.println("Data akun tidak ada");
        }
        
        return false;
    }
    public int totalEmailUMM()
    {
        int count = 0;
        for(String key : tabelAkun.keySet()){ // pengambilan dr semua key
            if(key.endsWith("@umm")){ 
                count++;
            }else {
                count = count;
            }      
        }
        System.out.println("Total akun dengan email UMM : "+count);
        return 0;
    }
    
    //kegiatan 2 tabel sesi login akun
    
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
