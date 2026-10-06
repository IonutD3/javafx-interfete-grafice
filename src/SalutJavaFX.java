
/**
 * JavaFX pentru butoane și gestionarea evenimentelor.
 */
import javafx.application.Application; 

import javafx.event.ActionEvent; 

import javafx.event.EventHandler; 

import javafx.geometry.Insets; 

import javafx.scene.Group; 

import javafx.scene.Scene; 

import javafx.scene.control.Button; 

import javafx.scene.layout.HBox; 

import javafx.scene.layout.StackPane; 

import javafx.scene.text.Font; 

import javafx.stage.Stage; 

public class SalutJavaFX extends Application { 

@Override 

public void start(Stage primaryStage) { 

Button btn = new Button(); //crearea butonului 

btn.setText("Say 'Hello World'"); //setarea textului din centru buttonului 

btn.setOnAction(new EventHandler<ActionEvent>() //setarea functionalitati la apasarea acestui buton 

{ 

@Override 

public void handle(ActionEvent event) { 

btn.setText("Java"); 

Font dialogFont = Font.font("Dialog", 30); 

btn.setFont(dialogFont); 

System.out.println("Hello World!"); 

} 

}); 

 

Button btn1 = new Button(); //crearea butonului 

btn1.setText("Craiova"); //setarea textului din centru buttonului 

btn1.setOnAction(new EventHandler<ActionEvent>() //setarea functionalitati la apasarea acestui buton 

{ 

@Override 

public void handle(ActionEvent event) { 

btn1.setText("ACE"); 

Font dialogFont = Font.font("Dialog", 30); 

btn1.setFont(dialogFont); 

System.out.println("ACE"); 

} 

}); 

 

Group root = new Group(); 

Scene scene = new Scene(root, 300, 200); //setare dimensiuni scenă 

HBox hbox = new HBox(5); // spațiul între nodurile copilului 

hbox.setPadding(new Insets(50)); // padding între marginea Hbox și linie 

HBox.setMargin(btn, new Insets(0,50,50,0)); // spțiul între margine și copilul nod(child node) 

hbox.getChildren().addAll(btn, btn1); //adaugare figurilor în layout 

root.getChildren().add(hbox); //adaugare layoutului în grup 

primaryStage.setScene(scene); //setare scenă 

primaryStage.show(); //afișare UI 

 

} 

public void handle(ActionEvent event) { 

System.out.println("Hello World"); //afisarea Hello World in consola 

} 

/** 

* @param args the command line arguments 

*/ 

public static void main(String[] args) { 

launch(args); 

} 

}
