
package Modul;

public class pertama {
    int NIM=0 ;
    String nama ;
    String asal ;
    String jurusan ;
    String fakultas ;
    void buka (){ 
        System.out.println("BIODATA DIRI ");
    }
    void setNO (int tambah){
    NIM = NIM = tambah ;
    }
    void setBiodata (String Alfin){
    nama = nama = Alfin ;
    }
    void setData (String banyuwangi){
    asal = asal = banyuwangi;
    }
    void setJurusan (String Informatika){
    jurusan = jurusan = Informatika;
    }       
    void setFakultas (String Teknik){
    fakultas = fakultas = Teknik;
    }
    int getnim (){
        return NIM ;
    }
    String getNama (){
        return nama ;
    }
    String getAsal (){
        return asal ;
    }
    String getJurusan () {
        return jurusan ;
    }
    String getFakultas (){
        return fakultas ;
    }
}
