
package hashing;
import java.util.HashMap; 

public class NewMain {

    public static void main(String[] args) {
        String[][] fakultasUMM = new String[][]{        
        {"FT","FK","FIKES","FEB","FAI","FPP"},
        {"Fakultas Teknik","Fakultas Kedokteran","Fakultas Ilmu Kesehatan","Fakultas Ekonomi dan Bisnis","Fakultas Agama Islam","Fakultas Peternakan dan Pertanian"}};
        HashMap<String, String> listFakultas = new HashMap<>();    
        int barisFakultas = 0;         
        //jika panjang kolom pertama sama dengan kolom kedua, pengecekan agar tidak terjadi null pointer
        if(fakultasUMM[0].length==fakultasUMM[1].length){ 
    
         //looping data dimulai dari baris pertama hingga selesai untuk dimasukkan dalam HashMap
        while (barisFakultas<fakultasUMM[0].length)
        {  
        listFakultas.put(fakultasUMM[0][barisFakultas],fakultasUMM[1][barisFakultas]);  
        barisFakultas++;            
        
        }         
        }else
        {
            
         System.out.println("Inisialisasi data panjang antar kolom tidak sama");
        }//         
        System.out.print("List fakultas:");       
        //mendapatkan semua value tanpa memerlukan key         
       System.out.println(listFakultas.values());         
        //uji coba dapatkan data dari HashMap jika key adalah "FT" 
       System.out.print("Kepanjangan dari FT adalah : "+ listFakultas.get("FT") );         
        //uji coba dapatkan data dengan key yang tidak diketahui misal "FTI" 
       System.out.print("Kepanjangan dari FTI adalah : "+ listFakultas.get("FTI") );     } } 
        
        
    

