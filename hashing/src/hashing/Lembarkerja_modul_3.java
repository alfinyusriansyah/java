    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashing;


public class Lembarkerja_modul_3 {

    /**
     * @param args the command line arguments1
     */
    public static void main(String[] args) {
        Auth auth = new Auth();
        String email = "";
        String password = "";
        System.out.println(auth.dataAkun());
        auth.dataAkun();
        auth.loginAkun(email, password);
        
        
    }
    
}


