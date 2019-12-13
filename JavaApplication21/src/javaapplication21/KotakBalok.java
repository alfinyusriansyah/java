
package javaapplication21;


public class KotakBalok implements BangunRuang {

    @Override
    public void keliling() {
        
        double p = 5;
        double l = 6;
        double t = 2;
        double luas= (4*(p*l*t));
        System.out.println("maka keliling balok: " +luas );
    }

    @Override
    public void luas() {
        double p = 5;
        double l = 6;
        double t = 2;
        double luas= (double) (2*(p*l)*(p*t)*(l*t));
        System.out.println("maka luas balok: " +luas );
    }
    
    

    
}
