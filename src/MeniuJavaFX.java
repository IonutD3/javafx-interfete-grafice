
/**
 * JavaFX pentru meniuri, opțiuni și ToggleGroup.
 */
import javafx.application.Application; 

import javafx.application.Platform; 

import javafx.event.ActionEvent; 

import javafx.event.EventHandler; 

import javafx.scene.Scene; 

import javafx.scene.control.Button; 

import javafx.scene.control.CheckMenuItem; 

import javafx.scene.control.Menu; 

import javafx.scene.control.MenuBar; 

import javafx.scene.control.MenuItem; 

import javafx.scene.control.RadioMenuItem; 

import javafx.scene.control.SeparatorMenuItem; 

import javafx.scene.control.ToggleGroup; 

import javafx.scene.layout.BorderPane; 

import javafx.scene.paint.Color; 

import javafx.stage.Stage;  

public class MeniuJavaFX extends Application { 

public static void main(String[] args) { 

Application.launch(args); 

} 

@Override 

public void start(Stage primaryStage) { 

primaryStage.setTitle("Menus Example"); 

BorderPane root = new BorderPane(); 

Scene scene = new Scene(root, 300, 250, Color.WHITE); 

//Crearea meniu 

MenuBar menuBar = new MenuBar(); 

root.setTop(menuBar); 

// File menu - new, save, exit 

Menu fileMenu = new Menu("File"); 

MenuItem newMenuItem = new MenuItem("New"); 

MenuItem saveMenuItem = new MenuItem("Save"); 

MenuItem exitMenuItem = new MenuItem("Exit"); 

// Setare buton - exit 

exitMenuItem.setOnAction(actionEvent -> Platform.exit() ); 

fileMenu.getItems().addAll(newMenuItem, saveMenuItem, 

new SeparatorMenuItem(), exitMenuItem ); 

// Camera menu - camera 1, camera 2 

Menu cameraMenu = new Menu("Web");// 

CheckMenuItem cam1MenuItem = new CheckMenuItem("Show Camera 1"); 

cam1MenuItem.setSelected(true); 

cameraMenu.getItems().add(cam1MenuItem); 

CheckMenuItem cam2MenuItem = new CheckMenuItem("Show Camera 2"); 

cam2MenuItem.setSelected(true); 

cameraMenu.getItems().add(cam2MenuItem); 

// Alarm menu 

Menu alarmMenu = new Menu("SQL");// 

// sound or turn alarm off 

ToggleGroup tGroup = new ToggleGroup(); 

RadioMenuItem soundAlarmItem = new RadioMenuItem("MySQL"); 

soundAlarmItem.setToggleGroup(tGroup); 

 //setarea textului din centru buttonului 

soundAlarmItem.setOnAction(new EventHandler<ActionEvent>() //setarea functionalitati la apasarea acestui buton 

{ 

@Override 

public void handle(ActionEvent event) { 

System.out.println("MySQL"); 

} 

}); 

RadioMenuItem stopAlarmItem = new RadioMenuItem("Oracle"); 

stopAlarmItem.setToggleGroup(tGroup); 

stopAlarmItem.setSelected(true); 

stopAlarmItem.setOnAction(new EventHandler<ActionEvent>() //setarea functionalitati la apasarea acestui buton 

{ 

@Override 

public void handle(ActionEvent event) { 

System.out.println("Oracle"); 

} 

}); 

alarmMenu.getItems().addAll(soundAlarmItem, stopAlarmItem, new SeparatorMenuItem()); 

Menu contingencyPlans = new Menu("Tutorial"); 

contingencyPlans.getItems().addAll( 

new CheckMenuItem("Java"), 

new CheckMenuItem("JavaFX"), 

new CheckMenuItem("Swing")); 

alarmMenu.getItems().add(contingencyPlans); 

menuBar.getMenus().addAll(fileMenu, cameraMenu, alarmMenu); 

primaryStage.setScene(scene); 

primaryStage.show(); 

} 

}
