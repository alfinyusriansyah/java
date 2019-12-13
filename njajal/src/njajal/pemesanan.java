
package njajal;


public class pemesanan extends DataPemesan{
      
  
     
    @Override
    public String getNama() {
        return Nama;
    }

    @Override
    public void setNama(String nama) {
        this.Nama = nama;
    }

    @Override
    public String getAlamat() {
        return Alamat;
    }

    @Override
    public void setAlamat(String alamat) {
       
        this.Alamat = alamat;
    }
    
  public void lihatDataPemesan(){
  
      pemesanan nob = new pemesanan ();
      
      nob.setNama("argani bin malik");
      nob.setAlamat("banyuwangi");
      
      System.out.println("NAMA   : " +nob.getNama());
      System.out.println("ALAMAT : " +nob.getAlamat());
  
 
  
  }
  
 public void jahitanDipsan(){
    
    
  
 
 }
}


  
