
package javaapplication14;

public class Enkapsulasi {
    public String a1;
    protected String a2;
    private String a3; 
    
    public String getA1() {
        return a1;
    }


    public void setA1(String a1) {
        this.a1 = a1;
    }


    public String getA2() {
        return a2;
    }


    public void setA2(String a2) {
        this.a2 = a2;
    }


    public String getA3() {
        return a3;
    }


    public void setA3(String a3) {
        this.a3 = a3;
    }
    
    
        public void lanjutlagi() {
     Enkapsulasi en = new Enkapsulasi();
     
        en.setA1("Genteng");
        en.setA2("Banyuwangi");
        en.setA3("Jawa timur");
        
        System.out.println(("Pertama = ")+en.a1);
        System.out.println(("Kedua = ")+en.a2);
        System.out.println(("Ketiga = ")+en.a3);
    }
}

