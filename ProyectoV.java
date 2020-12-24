/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.v;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author AndresGalvez
 */
public class ProyectoV extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Stage mainstage;
        Button btn = new Button();
        btn.setText("Ingresar fila Columna");
        TextField txtNivel;
        TextField txtNivel2;
        
         BorderPane root = new BorderPane();
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
  mainstage = primaryStage;
        
        Insets insets = new Insets(4);
        
        
        
        HBox botones = new HBox();
        botones.setSpacing(4);
        
        Label lblNivel = new Label("fila:");
        txtNivel = new TextField();
        txtNivel.setPrefWidth(60);
        txtNivel.setPromptText("fila");
        
         Label lblNivel2 = new Label("columna:");
        txtNivel2 = new TextField("3");
        txtNivel2.setPrefWidth(60);
        txtNivel2.setPromptText("columna");
        
        Button btnSalir = new Button();
        btnSalir.setText("Salir");
        btnSalir.setOnAction( e -> mainstage.close() );
       
        
        Button btnRecur = new Button("generar");
        

        botones.getChildren().addAll(lblNivel, txtNivel,lblNivel2,txtNivel2, btnRecur,  btnSalir);
        
        BorderPane.setMargin(botones, insets);
        root.setBottom(botones);
        
        
        
        Scene scene = new Scene(root);
        //scene.getStylesheets().add(getClass().getResource("estilos.css").toExternalForm());
        
        primaryStage.setTitle("Proyecto v");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
