package javaapplication21;

public class JavaApplication21 {

    public static void main(String[] args) {
        BangunRuang jj = new KotakBalok(); 
        jj.keliling();
        jj.luas();

        System.out.println(" ");

        PersegiKubus nob = new PersegiKubus();
        nob.keliling();
        nob.luas();

        System.out.println(" ");

        LingkaranBola nos = new LingkaranBola();
        nos.luas();
        nos.volume();
        nos.keliling();

        System.out.println(" ");

    }

}
