
package generic;




public class Cell <key, value>{    // kelas yang menggunakan deklarasi metod generik
    private key K;
    private value V;

    
    public key getK() {
        return K;
    }
    public void setK(key K) {
        this.K = K;
    }
    public value getV() {
        return V;
    }
    public void setV(value V) {
        this.V = V;
    }
    public void setItem (key mobil, value tahun){
    this.K= mobil;
    this.V= tahun;
    
    }
}

   

    
  

