
package javaapplication21;


public class PersegiKubus implements BangunRuang{

    @Override
    public void keliling() {
        double s = 6;
        double luas= 12*s;
        System.out.println("maka keliling kubus : " +luas );
    }

    @Override
    public void luas() {
        double s = 6;
        double luas= 6*s*s;
        System.out.println("maka luas kubus : " +luas );
    }
    
}
