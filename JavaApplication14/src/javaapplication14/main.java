
package javaapplication14;


public class main {

    
    public static void main(String[] args) {
        Hewan hwn= new Hewan("klo");
        hwn.setNama("hio");
        Hewan hwn2 = new Hewan (2);
        Enkapsulasi enk = new Enkapsulasi();
        OverloadingConstructor d = new OverloadingConstructor(10,3);
        OverloadingConstructor r = new OverloadingConstructor("Banyuwangi,"," Jawa timur");
        OverloadingConstructor y = new OverloadingConstructor(); 
        System.out.println((""));
        System.out.println(("Hewan yang disukai : "));       
        System.out.println("nama hewan :"+hwn.getNama());
        System.out.println("jumlah hewan :"+hwn2.getJumlah());
        System.out.println((""));
        System.out.println(("Kampung Halaman : ")); 
        enk.lanjutlagi();
    }
    
}
