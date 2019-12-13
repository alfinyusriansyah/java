
package javaapplication21;


public class LingkaranBola implements BangunRuang, bola {

    double jari;
    
    @Override
    public void keliling() {
        double r = 5;
        double luas= (double) (2*3.14*r);
        System.out.println("maka keliling kubus : " +luas );
        
    }

    @Override
    public void luas() {
        double r= 1;
        double  hasil=(double) (3.14*r*r) ;
        System.out.println("maka luas lingkaran:" +hasil );
    }

    @Override
    public void volume() {
        double r=2;
        double h=(double)(1.3*3.14*r*r*r);
        System.out.println("maka volune bola:" +h);
              
    }

    @Override
    public void setJari2(double jari) {
            this.jari = jari;
    }

    @Override
    public double jari() {
        return 0;
        
    }
    
    

}
