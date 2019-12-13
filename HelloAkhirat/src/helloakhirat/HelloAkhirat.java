
package helloakhirat;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;//tam
import javafx.geometry.Pos;//t
import javafx.scene.Scene;
import javafx.scene.control.*; // di awal Button, di ganti dengan *
import javafx.scene.control.Label;// nama
import javafx.scene.layout.GridPane;//t
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Text;// TEXT
import javafx.stage.Stage;


public class HelloAkhirat extends Application {
   Stage window;
    public static void main(String[] args) {
        launch(args);
    }
    private Stage PrimaryStage;
    
   
    @Override
    public void start(Stage primaryStage) {
       window = PrimaryStage;
       window.setTitle("LOGIN FROM UMM");
       
       GridPane jo = new GridPane();
       jo.setAlignment(Pos.CENTER);
       jo.setVgap(10);
       jo.setHgap(10);
       jo.setPadding(new Insets (10));
        
       Text nob = new Text("SELAMAT DATANG"); 
       nob.setFont(Font.font("Times New Roman", FontPosture.ITALIC, 25));
       jo.add(nob, 0, 0);
       
       Label lbluser = new Label("Username");
       jo.add(lbluser, 0, 1);
       
       TextField textUser = new TextField ();
       textUser.setPromptText("Username");
       jo.add(textUser, 1, 1);
       
       Label lblpass = new Label("Password");
       jo.add(lblpass, 0, 2);
       
       PasswordField TextPass = new PasswordField ();
       TextPass.setPromptText("Password");
       jo.add(TextPass, 1, 2);
       
       Button Login= new Button("Login");
       jo.add(Login, 1, 3);
      
       
       Scene tampilan = new Scene(jo,500,500);
       window.setScene(tampilan);
       window.show();
       
        
        
    }

   
   
}
