
package Modul;


public class KonversiPanjang {

    
    public static void main(String[] args) {
        // KONVERSI PANJANG dari 10 km =...???...cm 
     
        double km=1;
        double hm,dam,m,dm,cm,mm,hm1,dam1,m1,dm1,cm1,mm1;
       
        hm= 10*km;
        dam= 100*km;
        m= 1000*km;
        dm= 10000*km;
        cm= 100000*km;
        mm= 1000000*km;
        hm1= 0.1*km;
        dam1= 0.01*km;
        m1= 0.001*km;
        dm1= 0.0001*km;
        cm1= 0.00001*km;
        mm1= 0.000001*km;
               
        
        
        System.out.println("hasil dari 1 km ke hm :" +hm+ "hm" );
        System.out.println("hasil dari 1 km ke dam :" +dam+ "dam" );
        System.out.println("hasil dari 1 km ke m :" +m+ "m" );
        System.out.println("hasil dari 1 km ke dm :" +dm+ "dm" );
        System.out.println("hasil dari 1 km ke cm :" +cm+ "cm" );
        System.out.println("hasil dari 1 km ke mm :" +mm+ "mm\n\n" );
        
         System.out.println("hasil dari 1 hm ke km :" +hm1+ "hm1" );
        System.out.println("hasil dari 1 dam ke km :" +dam1+ "dam1" );
        System.out.println("hasil dari 1 m ke km :" +m1+ "m1" );
        System.out.println("hasil dari 1 dm ke km :" +dm1+ "dm1" );
        System.out.println("hasil dari cm ke km :" +cm1+ "cm1" );
        System.out.println("hasil dari mm ke km :" +mm1+ "mm1" );
        
        
    }
}