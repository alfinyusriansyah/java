/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package big.o;



 public class Prog1{

    public static void main(String[] args) {
        int n = 10;
        for (int ad = 1; ad <= n; ad++) {
            for (int ac = 1; ac <= n; ac++) {
                
               
                System.out.println(ad+" "+ac);
            }
        }
    }
}

// ini merupakan notasi O(n^2), i akan bertambah 1 yaitu menjadi 2, ketika i dan j nya nilai berjumlah 100 kali  
// jadi dalam program di atas,menggunaka notasi (n^2), karena di dalam sutu loop, terdapat loop lagi.
//time compleksity , berapa lama suatu alogaritma berjalan ketika runtime, bedasarkan inputan yang di berikan.
// efesiensi suatu program pada saat eksekusi fungsi
//terdapat,