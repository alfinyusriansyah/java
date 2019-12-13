//
package Modul;


public class kedua {
    public static void main (String[] alfin) {
    pertama pkk = new pertama ();
    
    pkk.buka();
    pkk.setNO(0);
    pkk.setBiodata("alfin");
    pkk.setData("banyuwangi");
    pkk.setJurusan("Informatika");
    pkk.setFakultas("Teknik");
    System.out.println ("NIM          :"+ pkk.getnim());
    System.out.println("NAMA         :" +pkk.getNama());
    System.out.println("Tempat Lahir :" +pkk.getAsal());
    System.out.println("Jurusan      :" +pkk.getJurusan());
    System.out.println("Fakultas     :" +pkk.getFakultas());
    
    
    }
}
