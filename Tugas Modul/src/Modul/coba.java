package Modul;

public class coba {
    int NIM=0 ;
    String jenisPesanan ;
    String size ;
    String jurusan ;
    String fakultas ;
    void buka (){ 
        System.out.println("TOKO JAHIT BAJU");
    }
    void setPesan (String batik){
    this.jenisPesanan = batik ;
    }
    void setData (String banyuwangi){
    this.size = banyuwangi;
    }
    
    String getPesan (){
        return this.jenisPesanan ;
    }
    String getSize (){
        return this.size ;
    }
   
       
}
