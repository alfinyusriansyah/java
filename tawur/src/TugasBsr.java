
import java.util.Scanner;
import java.util.*;

public class TugasBsr {

    static String Nama;
    static String tujuan;
    static String jenisTravel;
    static int tiket;
    static int pembayaran;
    static String status;
    


 public  TugasBsr(String nama,String pergi,String jns, int tk,int pmb,String ver) {
 Nama = nama;
 tujuan = pergi;
 jenisTravel = jns;
 tiket = tk;
 pembayaran = pmb;
 status = ver;
    }

   


 
 public void Macam(){
 
     System.out.println("======================================");
     System.out.println("     Agen Travel Ramayana Malang      ");
     System.out.println("                 menu                 ");
     System.out.println("======================================");
     System.out.println("= 1. Jember       ||       Rp.120000 =");
     System.out.println("= 2. Surabaya     ||       Rp.100000 =");
     System.out.println("= 3. Banyuwangi   ||       Rp.140000 =");
     System.out.println("======================================");
        
 }
  
public String nama (String NM){
 Scanner nama = new Scanner (System.in);
 NM = nama.nextLine();
 return NM;
} 
public int Bayar (int byr){
Scanner bayar= new Scanner (System.in);
System.out.println("bayar :");
byr = bayar.nextInt();
return byr;
}

    
public String Tujuan (String pilih){
switch (pilih){
    
    case "1" : tujuan = "Jember";
        break ;
     case "2" : tujuan = "Surabaya";
        break ;
    case "3" : tujuan = "Banyuwangi";
        break ;
   
}
        return tujuan;
}
public String travel(String pilih) {
        jenisTravel = pilih;
        switch (pilih) {

            case "1":
                jenisTravel = "minibus long line";
                break;
            case "2":
                jenisTravel = "minibus short";
                break;
            case "3":
                jenisTravel = "elph";
                break;
        }
        return jenisTravel;

    }

    public int Tiket(String pergi) {
        tujuan = pergi;

        switch (tujuan) {
            case "Jember":
                tiket = 120000;
                System.out.println("harga tiket :Rp.120000");
                break;
            case "Surabaya":
                tiket = 100000;
                System.out.println("harga tiket :Rp.100000");
                break;
            case "Banyuwangi":
                tiket = 140000;
                System.out.println("harga tiket :Rp.140000");
                break;
        }
        return tiket;
    }

    public int biaya(String total) {
        jenisTravel = total;

        if (jenisTravel == "minibus long line") {
            tiket = (int) (tiket * 4);
        }
        if (jenisTravel == "minibus short line") {
            tiket = (int) (tiket * 3);
        }
        if (jenisTravel == "Elph") {
            tiket = (int) (tiket * 1);
        }
        return tiket;
    }
    

public int billing (int bil){
pembayaran = bil;

        if (pembayaran < tiket) {
            System.out.println("maaaf uang anda kurang");
            pembayaran = pembayaran - tiket;
            System.out.println("uang anda kurang : " + pembayaran);
        } else {
            pembayaran = pembayaran - tiket;
            System.out.println(" LUNAS");

            if (pembayaran > tiket) {
                System.out.println("sisa pembayaran = " + pembayaran);
            }
             pembayaran = tiket;
        }
       return pembayaran ;
    }
    


public String Verifikasi (int bill){
pembayaran = bill;
        
        if (pembayaran > tiket){
            status =" TERVERIFIKASI";
        }
        else if(pembayaran == tiket){
            status = "TERVERIFIKASI";
        }
        else {
            status = "TIDAK TERVERIFIKASI";
        }

return status;
}

public void Display (String nama, String pergi, String jns, int tk, int pmb, String ver ){
    System.out.println("|||||||||||||||||||||||||||");
    System.out.println("-------TERIMA KASIH--------");
    System.out.println("|||||||||||||||||||||||||||");
   System.out.println("Nama Penumpang   : " + nama);
   System.out.println("Tujuan Kota      : " + pergi);
   System.out.println("Jenis Travel     : " + jns);
   System.out.println("Harga Tiket      : " + tk );
   System.out.println("Pembayaran       : " + pmb);
   System.out.println("Status           : " + ver);

}

 
public static void main(String[] args ) {
  TugasBsr noob = new TugasBsr (Nama,tujuan,jenisTravel,tiket,pembayaran,status);
  
    System.out.println("masukkan nama :");
    String nama = noob.nama(Nama);
    
    System.out.println("no.Tujuan anda :");
    String pergi=noob.nama(tujuan);
    
    noob.Tujuan(pergi);
    noob.Tiket(tujuan);
    
    System.out.println("jenis Travel :");
    String jns = noob.nama(jenisTravel);
    
    noob.travel(jns); 
    noob.biaya(jenisTravel);
    
    int biaya = noob.Bayar(pembayaran);
    noob.billing(biaya);
    
    noob.Verifikasi(pembayaran);
    
    noob.Display(nama,tujuan,jenisTravel,tiket,pembayaran,status);
    
    
    
    
    
  
 
  
    
}
}
