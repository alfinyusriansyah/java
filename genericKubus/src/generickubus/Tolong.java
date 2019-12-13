/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generickubus;

/**
 *
 * @author asus
 */


   public class Tolong {
    public static void main(String[] args) {
        NewClass<Double> x = new NewClass<>(1.3, 5.6, 6.4); // membri
        NewClass<Integer> i = new NewClass<>(1, 5, 2);
        NewClass<String>c = new NewClass<>("aaa","uuu","uuu");

        String sd = x.toString();
        System.out.println(sd);
        String id = i.toString();
        System.out.println(id);
        String cd = c.toString();
        System.out.println(cd);
        System.out.println("\n");

        //getresult
        int in = i.getResultAsInt();
        System.out.println(in);
        long ln = i.getResultAsLong();
        System.out.println(ln);
        double dn = i.getResultAsDouble();
        System.out.println(dn);
        System.out.println("\n");
        
        
        int inx = x.getResultAsInt();
        System.out.println(inx);
        long lnx = x.getResultAsLong();
        System.out.println(lnx);
        double dnx = x.getResultAsDouble();
        System.out.println(dnx);
        System.out.println("\n");
        
        
        int ins = c.getResultAsInt();
        System.out.println(ins);
        long lns = c.getResultAsLong();
        System.out.println(lns);
        double dns = c.getResultAsDouble();
        System.out.println(dns);
    }
}
