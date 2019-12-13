
package helloworld;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class newStage {
    public newStage(String a, String b, String c, String d, String e,String f,String g) {
        GridPane gridBaru = new GridPane();
        gridBaru.setAlignment(Pos.CENTER);
        gridBaru.setMinHeight(300);
        Scene scene = new Scene(gridBaru, 300, 300);
        Stage secondStage = new Stage();
        secondStage.setTitle("Anda sukses mendaftar");
        
        Text scenetitle = new Text("Pesan Custom");
        Text namaText = new Text("Nama : ");
        Text nimText = new Text("NIM : ");
        Text alamatText = new Text("Alamat : ");
        Text fakultasText = new Text("Fakultas : ");
        Text kodeText = new Text("KodePos : ");
        Text hobbyText = new Text("Hobby : ");
        Text kelaminText = new Text("Jenis kelamin : ");
        gridBaru.add(scenetitle, 1, 0, 1, 1);
        scenetitle.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
        
        TextField nama = new TextField(a);
        nama.setDisable(true);
        TextField nim = new TextField(b);
        nim.setDisable(true);
        TextField alamat = new TextField(c);
        alamat.setDisable(true);
        TextField fakultas = new TextField(d);
        fakultas.setDisable(true);
        TextField kodepos = new TextField(e);
        kodepos.setDisable(true);
        TextField hobby = new TextField(f);
        hobby.setDisable(true);
        TextField kelamin = new TextField(g);
        kelamin.setDisable(true);
        
        gridBaru.add(nama, 2, 2);
        gridBaru.add(nim, 2, 3);
        gridBaru.add(alamat, 2, 4);
        gridBaru.add(fakultas, 2, 5);
        gridBaru.add(kodepos, 2, 6);
        gridBaru.add(hobby, 2, 7);
        gridBaru.add(kelamin, 2, 8);
        
        gridBaru.add(namaText, 0, 3, 2, 1);
        gridBaru.add(nimText, 0, 2, 2, 1);
        gridBaru.add(alamatText, 0, 4, 2, 1);
        gridBaru.add(fakultasText, 0, 5, 2, 1);
        gridBaru.add(kodeText, 0, 6, 2, 1);
        gridBaru.add(hobbyText, 0, 7, 2, 1);
        gridBaru.add(kelaminText, 0, 8, 2, 1);
        

        //gridBaru.add(scenetitle, 0, 0, 2, 1);
        
        secondStage.setScene(scene);
        secondStage.show();
        
        
        
        
    }
}
