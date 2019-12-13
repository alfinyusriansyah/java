
    //Radio Button
import helloworld.newStage;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

//Import Class Utama
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;



public class Praktikum6_PBO extends Application {
    public static String a;
    public static String b;
    public static String c;
    public static String d;
    public static String e;
    public static String f;
    public static String g;
    
    
    
    @Override
    public void start(Stage primaryStage) {        
        primaryStage.setTitle("JavaFxAsu");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(5,5,5,5));
        
        Text scenetitle = new Text("Isi data diri anda");
        scenetitle.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
        
        Label nim = new Label("NIM : ");
        Label Nama = new Label("NAMA : ");
        Label fakultas = new Label ("FAKULTAS :");
        Label alamat = new Label("ALAMAT : ");
        Label kodePos = new Label ("KODE POS :");
        Label hobby = new Label ("HOBBY :");
        Label kelamin = new Label("JENIS KELAMIN : ");
      
        
        TextField userTextFieldNim = new TextField();
        TextField userTextFieldNama = new TextField();
        TextField userTextFieldFak = new TextField();
        TextField userTextFieldAL = new TextField();
        TextField userTextFieldKODE = new TextField();
        TextField userTextFieldHOBBY = new TextField();
        TextField userTextFieldKELA  = new TextField();
        
        
        RadioButton lk = new RadioButton("Laki-laki");
        RadioButton pr = new RadioButton("Perempuan");
        ToggleGroup kelaminGroup = new ToggleGroup();
        lk.setToggleGroup(kelaminGroup);
        pr.setToggleGroup(kelaminGroup);
        
        Label actiontarget = new Label();
        Button btn = new Button("New");
        btn.setStyle("");
        Button btn2 = new Button("Edit");
        Button btn3 = new Button("Delete");
        HBox hbBtn = new HBox(10);
        Scene scene = new Scene(grid, 500, 500);
        
        grid.add(scenetitle, 1, 0, 1, 1);
       
        grid.add(nim, 0, 1);
        grid.add(userTextFieldNim , 1, 1);
        //userTextField.setMaxWidth(100);
        grid.add(Nama, 0, 2);
        grid.add(userTextFieldNama, 1, 2);
        grid.add(fakultas, 0, 3);
        grid.add(userTextFieldFak, 1, 3);
        grid.add(alamat, 0, 4);
        grid.add(userTextFieldAL, 1, 4);
        grid.add(kodePos , 0, 5);
        grid.add(userTextFieldKODE, 1, 5);
        grid.add(hobby, 0, 6);
        grid.add(userTextFieldHOBBY, 1, 6);
        grid.add(kelamin, 0, 7);
        grid.add(lk,1,7);
        grid.add(pr,2, 7);
        
        
        
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        hbBtn.getChildren().add(btn2);
        hbBtn.getChildren().add(btn3);
        grid.add(hbBtn, 1, 8);
        grid.add(actiontarget, 1, 6);
        btn.setOnAction(new EventHandler<ActionEvent>(){
            
            @Override
            public void handle(ActionEvent event){
                
                a = userTextFieldNim .getText();
                b = userTextFieldNama.getText();
                c = userTextFieldFak.getText();
                d = userTextFieldAL.getText();
                e = userTextFieldKODE.getText();
                f = userTextFieldHOBBY.getText();
                g = userTextFieldKELA.getText();
                        
                if(lk.isSelected()){
                g = lk.getText();
                }else if(pr.isSelected()){
                g = pr.getText();
                }
                newStage newWindow1 = new newStage(a,b,c,d,e,f,g);
                
                userTextFieldNim.setDisable(true);
                userTextFieldNama.setDisable(true);
                userTextFieldFak.setDisable(true);
                userTextFieldAL.setDisable(true);
                userTextFieldKODE.setDisable(true);
                userTextFieldHOBBY.setDisable(true);
                lk.setDisable(true);
                pr.setDisable(true);
            }
        });
        
        btn2.setOnAction(new EventHandler<ActionEvent>(){
            
            @Override
            public void handle(ActionEvent event){
                userTextFieldNim.setDisable(false);
                userTextFieldNama.setDisable(false);
                userTextFieldFak.setDisable(false);
                userTextFieldAL.setDisable(false);
                userTextFieldKODE.setDisable(false);
                userTextFieldHOBBY.setDisable(false);
               
                lk.setDisable(false); 
                pr.setDisable(false); 
            }
        });
        
        btn3.setOnAction(new EventHandler<ActionEvent>(){
            
            @Override
            public void handle(ActionEvent event){
                userTextFieldNim.setText("");
                userTextFieldNama.setText("");
                userTextFieldFak.setText("");
                userTextFieldAL.setText("");
                userTextFieldKODE.setText("");
                userTextFieldHOBBY.setText("");

                lk.setSelected(false);
                pr.setSelected(false);
            }
        });
        
        
        
        primaryStage.setScene(scene);
        primaryStage.setMinHeight(400);
        primaryStage.setMinWidth(500);
        primaryStage.show();
        
       
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

    

