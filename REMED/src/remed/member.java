
package remed;


public class member{

    
    public static void main(String[] args) {
      
        data nob = new data();
      
      for(int i =1; i<=5; i++){
        
      nob.setNama("Amira Amiragana");
      nob.setAsal("Jl. Margomulyo 127 Malang");
      
        System.out.println(i);
        System.out.println(" Nama Lengkap   : " +nob.getNama());
        System.out.println(" Tempat Tinggal : " +nob.getAsal());
          System.out.println("\n");
      }
     
        
    }
    
}
