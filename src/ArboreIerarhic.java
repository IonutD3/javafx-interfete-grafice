
/**
 * JavaFX pentru construirea unei structuri TreeView ierarhice.
 */
import java.util.Arrays; 

import java.util.List; 

import javafx.application.Application; 

 

import javafx.beans.value.ChangeListener; 

import javafx.event.ActionEvent; 

import javafx.event.EventHandler; 

import javafx.scene.Scene; 

import javafx.scene.control.Button; 

import javafx.scene.control.TreeItem; 

import javafx.scene.control.TreeView; 

import javafx.scene.layout.StackPane; 

import javafx.scene.layout.VBox; 

import javafx.stage.Stage;

public class ArboreIerarhic extends Application { 

Stage window; 

TreeView<String> tree; 

public static void main(String[] args) { 

launch(args); 

} 

@Override 

public void start(Stage primaryStage) { 

window = primaryStage; 

window.setTitle("Java Fx"); 

TreeItem<String> root, radacina, radacina1, radacina2;// 

//Root 

root = new TreeItem<>(); 

root.setExpanded(false); 

radacina = makeBranch("Radacina",root); 

//makeBranch("Frunza",radacina); 

radacina1 = makeBranch("Radacina1",radacina); 

//makeBranch("Frunza",radacina1); 

radacina2 = makeBranch("Radacina2",radacina1);// 

makeBranch("",radacina2); 

//Create tree 

tree =new TreeView<>(root); 

tree.setShowRoot(false); 

//Layout 

StackPane layout = new StackPane(); 

layout.getChildren().add(tree); 

Scene scene = new Scene(layout, 300, 250); 

window.setScene(scene); 

window.show(); 

} 

//create branch 

public TreeItem<String> makeBranch(String title, TreeItem<String> parent){ 

TreeItem<String> item = new TreeItem<>(title); 

item.setExpanded(true);// 

parent.getChildren().add(item); 

return item; 

} 

}
