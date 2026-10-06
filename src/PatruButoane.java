
/**
 * JavaFX cu patru butoane și tratarea evenimentelor.
 */
import javafx.application.Application; 

import javafx.event.ActionEvent; 

import javafx.event.EventHandler; 

import javafx.geometry.Insets; 

import javafx.scene.Group; 

import javafx.scene.Scene; 

import javafx.scene.control.Button; 

import javafx.stage.Stage; 

import javafx.scene.layout.HBox; 

import javafx.scene.shape.Rectangle; 

import javafx.scene.text.Font;

 

public class PatruButoane extends Application { 

@Override 

public void start(Stage primaryStage) {	 

Button btn1 = new Button(); //crearea butonului 

btn1.setText("Button1"); 

btn1.setOnAction(new EventHandler<ActionEvent>() //setarea functionalitati la apasarea acestui buton 

{ 

@Override 

public void handle(ActionEvent event) { 

btn1.setText("Activat"); 

Font dialogFont = Font.font("Dialog", 30); 

btn1.setFont(dialogFont); 

System.out.println("Button1"); 

} 

}); 

 

Button btn2 = new Button(); //crearea butonului 

btn2.setText("Button2"); 

btn2.setOnAction(new EventHandler<ActionEvent>() //setarea functionalitati la apasarea acestui buton 

{ 

@Override 

public void handle(ActionEvent event) { 

btn2.setText("Activat"); 

Font dialogFont = Font.font("Dialog", 30); 

btn2.setFont(dialogFont); 

System.out.println("Button2"); 

} 

});	 

 

Button btn3 = new Button(); //crearea butonului 

btn3.setText("Button3"); 

btn3.setOnAction(new EventHandler<ActionEvent>() //setarea functionalitati la apasarea acestui buton 

{ 

@Override 

public void handle(ActionEvent event) { 

btn3.setText("Activat"); 

Font dialogFont = Font.font("Dialog", 30); 

btn3.setFont(dialogFont); 

System.out.println("Button3"); 

} 

});	 

 

Button btn4 = new Button(); //crearea butonului 

btn4.setText("Button4"); 

btn4.setOnAction(new EventHandler<ActionEvent>() //setarea functionalitati la apasarea acestui buton 

{ 

@Override 

public void handle(ActionEvent event) { 

btn4.setText("Activat"); 

Font dialogFont = Font.font("Dialog", 30); 

btn4.setFont(dialogFont); 

System.out.println("Button4"); 

} 

}); 

 

Group root = new Group(); 

Scene scene = new Scene(root, 600, 400); //setare dimensiuni scenă 

HBox hbox = new HBox(5); // spațiul între nodurile copilului 

hbox.setPadding(new Insets(1)); // padding între marginea Hbox și linie 

/*Rectangle r1 = new Rectangle(100, 100); // patrat 

Rectangle r2 = new Rectangle(200, 200); // Patrat cu dimenisune mai mare 

Rectangle r3 = new Rectangle(50, 200); // Dreptunghi vertical 

Rectangle r4 = new Rectangle(200, 50); // Dreptunghi orizontal*/ 

HBox.setMargin(btn1, new Insets(2,2,2,2)); // spțiul între margine și copilul nod(child node) 

hbox.getChildren().addAll(btn1, btn2, btn3, btn4); //adaugare figurilor în layout 

root.getChildren().add(hbox); //adaugare layoutului în grup 

primaryStage.setScene(scene); //setare scenă 

primaryStage.show(); //afișare UI 

} 

 

public static void main(String[] args) { 

launch(args); 

} 

}
