/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generickubus;



public class NewClass<T> {

    private T panjang;
    private T lebar;
    private T tinggi;

    public NewClass(T panjang, T lebar, T tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public String toString() {
        String nka = "" + panjang + lebar + tinggi;
        return nka;
    }

    public long getResultAsLong() {
        try{
        String panjang1 = "" + panjang;
        String lebar1 = "" + lebar;
        String tinggi1 = "" + tinggi;
        Double lPanjang = Double.parseDouble(panjang1);
        Double lLebar = Double.parseDouble(lebar1);
        Double lTinggi = Double.parseDouble(tinggi1);
        long panjangl = lPanjang.longValue();
        long lebarl = lLebar.longValue();
        long tinggil = lTinggi.longValue();
        long x = panjangl * lebarl * tinggil;
        return x;
        }
        catch(RuntimeException O){
            System.out.println(O);
        }
        return 0;
    }

    public int getResultAsInt() {
        try{
        String panjang1 = "" + panjang;
        String lebar1 = "" + lebar;
        String tinggi1 = "" + tinggi;
        Double iPanjang = Double.parseDouble(panjang1);
        Double iLebar = Double.parseDouble(lebar1);
        Double iTinggi = Double.parseDouble(tinggi1);
        int panjangi = iPanjang.intValue();
        int lebari = iLebar.intValue();
        int tinggii = iTinggi.intValue();
        int x = panjangi * lebari * tinggii;
        return x;
        }
        catch(RuntimeException O){
            System.out.println(O);
        }
        return 0;
    }

    public double getResultAsDouble() {
        try{
        String panjang1 = "" + panjang;
        String lebar1 = "" + lebar;
        String tinggi1 = "" + tinggi;
        double DoublePanjang = Double.parseDouble(panjang1);
        double DoubleLebar = Double.parseDouble(lebar1);
        double DoubleTinggi = Double.parseDouble(tinggi1);
        double x = DoubleLebar * DoublePanjang * DoubleTinggi;
        return x;
        }
        catch(RuntimeException O){
            System.out.println(O);
        }
        return 0;
    }
}

    
    
    

