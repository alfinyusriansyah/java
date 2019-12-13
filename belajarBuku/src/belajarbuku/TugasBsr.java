
package belajarbuku;


class KelolaBuku {
    private String type_buku; //Encapsulasi
    private String judul_buku;
    private int jumlah_hal;

    public String getType_buku() {
        return type_buku;
    }

    public void setType_buku(String tb) {
        this.type_buku = tb;
    }

    public String getJudul_buku() {
        return judul_buku;
    }

    public void setJudul_buku(String jb) {
        this.judul_buku = jb;
    }

    public int getJumlah_hal() {
        return jumlah_hal;
    }

    public void setJumlah_hal(int jh) {
        this.jumlah_hal = jh;
    }    
    
}

