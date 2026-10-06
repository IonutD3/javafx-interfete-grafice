
/**
 * JavaFX pentru mutarea elementelor între două liste.
 */
import javafx.application.Application; 

import javafx.collections.FXCollections; 

import javafx.collections.ObservableList; 

import javafx.event.ActionEvent; 

import javafx.event.EventHandler; 

import javafx.geometry.HPos; 

import javafx.geometry.Insets; 

import javafx.scene.Scene; 

import javafx.scene.control.Alert; 

import javafx.scene.control.Alert.AlertType; 

import javafx.scene.control.Button; 

import javafx.scene.control.Label; 

import javafx.scene.control.ListView; 

import javafx.scene.layout.BorderPane; 

import javafx.scene.layout.ColumnConstraints; 

import javafx.scene.layout.GridPane; 

import javafx.scene.layout.Priority; 

import javafx.scene.layout.VBox; 

import javafx.scene.paint.Color; 

import javafx.stage.Stage; 

 

public class GestionareStudenti extends Application { 

  

    public static void main(String[] args) 

  { 

    Application.launch(args); 

  } 

     

    private void AfisareMesaj(String message) 

    { 

    Alert a = new Alert(AlertType.INFORMATION); 

    a.setTitle("Title"); 

    a.setHeaderText("Header text"); 

    a.setContentText(message); 

    a.showAndWait(); 

    } 

 

  @Override 

  public void start(Stage primaryStage)  

  { 

 

    primaryStage.setTitle("Student Picker: Creating and Working with ObservableLists"); 

    BorderPane root = new BorderPane(); 

    Scene scene = new Scene(root, 400, 250, Color.WHITE); 

 

    // creare grid pane 

 

    GridPane gridpane = new GridPane(); 

    gridpane.setPadding(new Insets(5)); 

    gridpane.setHgap(10); 

    gridpane.setVgap(10); 

 

    ColumnConstraints column1 = new ColumnConstraints(150, 150, Double.MAX_VALUE); 

    ColumnConstraints column2 = new ColumnConstraints(50); 

    ColumnConstraints column3 = new ColumnConstraints(150, 150, Double.MAX_VALUE); 

    column1.setHgrow(Priority.ALWAYS); 

    column3.setHgrow(Priority.ALWAYS); 

    gridpane.getColumnConstraints().addAll(column1, column2, column3); 

 

    // Student label 

    Label studentLbl = new Label("Student"); 

    GridPane.setHalignment(studentLbl, HPos.CENTER); 

    gridpane.add(studentLbl, 0, 0); 

    // Absolvent label 

    Label absolventLbl = new Label("Absolvent"); 

    gridpane.add(absolventLbl, 2, 0); 

    GridPane.setHalignment(absolventLbl, HPos.CENTER); 

 

    // Student 

    final ObservableList<String> student = FXCollections.observableArrayList("Alex", 

    "Bogdan","Marian"); 

    final ListView<String> studentListView = new ListView<>(student); 

    gridpane.add(studentListView, 0, 1); 

 

    // Absolvent

    final ObservableList<String> absolvent = FXCollections.observableArrayList(); 

    final ListView<String> absolventListView = new ListView<>(absolvent); 

    gridpane.add(absolventListView, 2, 1); 

 

    // select absolvent

    Button sendRightButton = new Button(" > "); 

    sendRightButton.setOnAction((ActionEvent event) -> { 

        String potential = studentListView.getSelectionModel().getSelectedItem(); 

 

        if (potential != null) 

        { 

            studentListView.getSelectionModel().clearSelection(); 

            student.remove(potential); 

            absolvent.add(potential); 

        } 

    }); 

    // deselect absolvent

    Button sendLeftButton = new Button(" < "); 

 

    sendLeftButton.setOnAction((ActionEvent event) -> { 

        String notAbsolvent = absolventListView.getSelectionModel().getSelectedItem(); 

        if (notAbsolvent != null) 

        { 

            absolventListView.getSelectionModel().clearSelection(); 

            absolvent.remove(notAbsolvent); 

            student.add(notAbsolvent); 

        } 

    }); 

 

    Button extraButton= new Button("Inv"); 

    extraButton.setStyle("-fx-font: 15 arial; -fx-base:#ff0000;"); 

    extraButton.setOnAction(new EventHandler<ActionEvent>() { 

    	int count = 0; 

         

            boolean flag=true; 

            @Override 

                    public void handle(ActionEvent event){ 

            if(flag){ 

                absolventLbl.setText("Student"); 

                studentLbl.setText("Absolvent"); 

                flag=false; 

                count ++; 

                AfisareMesaj(""+count); 

            } 

            else{ 

                absolventLbl.setText("Absolvent"); 

                studentLbl.setText("Student"); 

                flag=true; 

                count ++; 

                AfisareMesaj(""+count); 

            } 

        } 

         

    }); 

     

    VBox vbox = new VBox(5); 

    vbox.getChildren().addAll(sendRightButton,sendLeftButton, extraButton); 

    gridpane.add(vbox, 1, 1); 

    root.setCenter(gridpane); 

     

    GridPane.setVgrow(root, Priority.ALWAYS); 

     

    primaryStage.setScene(scene); 

    primaryStage.show(); 

 

  } 

}
