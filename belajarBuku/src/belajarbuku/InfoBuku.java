package belajarbuku;

import java.util.Scanner;

public class InfoBuku {

    public static void main(String[] args) {
        String[] InfoBuku = new String[3]; // array 

        int code;
        KelolaBuku kb = new KelolaBuku();
        Scanner input = new Scanner(System.in);
        int data = 0; //tipe data buat simpan inputan

        try { //Exception Handling, menghindari error,   memperbaiki tampilan pada runtime error.
            // jumhal, ada kemungkinan error ketika inputan berupa karakter, masukin ke tahap try
            do { //Array, String dan Protected Code

                System.out.println("Masukkan Data BUKU");
                System.out.print("Masukkan Judul Buku : ");
                String judul = input.next();
                System.out.print("Masukkan Jumlah Hal : ");
                int jumhal = input.nextInt();
                System.out.print("Masukkan Type Buku : ");
                String type = input.next();

                kb.setJudul_buku(judul);
                kb.setJumlah_hal(jumhal);
                kb.setType_buku(type);
                InfoBuku[data] = "Judul: " + kb.getJudul_buku()
                        + " \nJumlah Halaman: " + kb.getJumlah_hal()
                        + " \nType: " + kb.getType_buku();
                data++;
                System.out.println("Apakah Ingin Mengulang?");
                System.out.println("Jika Ya Tekan 1");
                System.out.println("Jika Tidak Tekan 0");
                code = input.nextInt();

            } while (code != 0);
            
             for (int i = 0; i < data; i++) {
             System.out.println(InfoBuku[i]); // 
        }
        } catch (java.util.InputMismatchException | ArrayIndexOutOfBoundsException e) {
            System.out.println("throw in :" + e); //Exception Handling, tipe exception yang ingin ditangani
            //catch, jika exception terjadi di bagian protected code, maka catch akan melakukan pemeriksaan
        }
       
    }

}
