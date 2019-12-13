
package javaapplication20;


public class persegi extends shape{ 

    @Override  // harus di sempurnakan oleh kelas abstrack, hanya terdapat deklarasi method

    void getLuas() {
        double p = 5;
        double l = 6;
        double luas= p*l;
        System.out.println("maka luas persegi : " +luas );
    }

    @Override
    void getVolumme() {
        double p = 5;
        double l = 6;
        double t = 2;
        double luas= (p*l*t);
        System.out.println("maka volume persegi: " +luas );
                
    }
    
}
