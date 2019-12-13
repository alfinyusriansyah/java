package belaajr2;
import java.util.Scanner;

public class InfoBuku {
    protected String type_buku;
    public String judul_buku;
    public int jumlah_halaman;

    public String getType_buku() {
        return type_buku;
    }

    public void setType_buku(String type_buku) {
        this.type_buku = type_buku;
    }

    public String getJudul_buku() {
        return judul_buku;
    }

   
    public void setJudul_buku(String judul_buku) {
        this.judul_buku = judul_buku;
    }

    
    public int getJumlah_halaman() {
        return jumlah_halaman;
    }

 
    public void setJumlah_halaman(int jumlah_halaman) {
        this.jumlah_halaman = jumlah_halaman;
    }
    public void lanjutlagi(){
      Scanner no = new Scanner (System.in);
      
        System.out.println("masukkan type buku=");
        type_buku=no.next();
        
        System.out.println("masukkan judul buku=");
        judul_buku=no.next();
        
        System.out.println("masukkan jumlah halaman=");
        jumlah_halaman=no.nextInt();
        
        
        
}
}