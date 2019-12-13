
package javaapplication14;


public class OverloadingConstructor {


     public OverloadingConstructor (int a, int b){
    System.out.println("Tanggal Lahir = " + (a+b));
}
    public OverloadingConstructor (String a, String b){
    System.out.println("Lahir = "+ (a+b));
}
    public OverloadingConstructor (){
    System.out.println("Nama Lengkap = Alfin yusriansyah");
}
}


