
package javaapplication20;


 class lingkaran extends shape {

    @Override
    public void getLuas() {
        double a= 1;
        double  hasil= (3.14*a) ;
        System.out.println("maka luas lingkaran:" +hasil );
        
    }
    @Override
    public void getVolumme() {
        double a=5;
        double hasil= (2.14*a*a);
        System.out.println("maka volume lingkaran :" +hasil);
        
    
    }
      
}
