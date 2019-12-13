
package modul.pkg1.sem.pkg3;
import java.util.Scanner;

public class modul1 {
    
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int baris,kolom ;
      int matriksA [][]= new int [10][10];
    int matriksB [][]= new int [10][10];
    int matriksC [][]= new int [2][2];
    
    
    
    for (int i=0; i <matriksA.length; i++){
 for (int j=0; j<matriksB.length; j++) {
 matriksC[i][j]=  matriksA[i][j]+ matriksB[i][j]; 
 }
}
     for (int i =0;i<matriksC.length; i++){
  for (int j =0;j<matriksC.length;j++){
      System.out.println(matriksC[i][j]+"");
  }
   
    
} 
}
}
