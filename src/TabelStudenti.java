
/**
 * JavaFX cu TableView și adăugare de studenți.
 */
import javafx.application.Application; 

import javafx.beans.property.SimpleStringProperty; 

import javafx.collections.FXCollections; 

import javafx.collections.ObservableList; 

import javafx.event.ActionEvent; 

import javafx.geometry.Insets; 

import javafx.geometry.Pos; 

import javafx.geometry.Side; 

import javafx.scene.Group; 

import javafx.scene.Scene; 

import javafx.scene.chart.PieChart; 

import javafx.scene.chart.PieChart.Data; 

import javafx.scene.control.Button; 

import javafx.scene.control.Label; 

import javafx.scene.control.TableColumn; 

import javafx.scene.control.TableView; 

import javafx.scene.control.TextField; 

import javafx.scene.control.cell.PropertyValueFactory; 

import javafx.scene.layout.HBox; 

import javafx.scene.layout.StackPane; 

import javafx.scene.layout.VBox; 

import javafx.scene.text.Font; 

import javafx.stage.Stage;
 

public class TabelStudenti extends Application { 

private final TableView<Persoana> table = new TableView<>(); 

//populare lista 

private final ObservableList<Persoana> data = 

FXCollections.observableArrayList( 

new Persoana("Jacob", "Smith", "25", "4.1A", "jacob.smith@example.com"), 

new Persoana("Isabella", "Johnson", "24", "4.1B", "isabella.johnson@example.com"), 

new Persoana("Ethan", "Williams", "24", "4.1A", "ethan.williams@example.com"), 

new Persoana("Emma", "Jones", "23", "4.1C", "emma.jones@example.com"), 

new Persoana("Michael", "Brown", "23", "4.1B", "michael.brown@example.com")); 

final HBox hb = new HBox(); 

public static void main(String[] args) { 

launch(args); 

} 

@Override 

public void start(Stage stage) { 

Scene scene = new Scene(new Group()); 

stage.setTitle("Table View Sample"); 

stage.setWidth(650); 

stage.setHeight(550); 

//adaugare eticheta 

final Label label = new Label("Address Book"); 

label.setFont(new Font("Arial", 20)); 

table.setEditable(true); 

//creare coloane 

TableColumn firstNameCol = new TableColumn("First Name"); 

firstNameCol.setMinWidth(100); 

firstNameCol.setCellValueFactory( 

new PropertyValueFactory<>("firstName")); 

TableColumn lastNameCol = new TableColumn("Last Name"); 

lastNameCol.setMinWidth(100); 

lastNameCol.setCellValueFactory( 

new PropertyValueFactory<>("lastName")); 

TableColumn varstaCol = new TableColumn("Varsta"); 

varstaCol.setMinWidth(100); 

varstaCol.setCellValueFactory( 

new PropertyValueFactory<>("varsta")); 

TableColumn grupaCol = new TableColumn("Grupa"); 

grupaCol.setMinWidth(100); 

grupaCol.setCellValueFactory( 

new PropertyValueFactory<>("grupa")); 

TableColumn emailCol = new TableColumn("Email"); 

emailCol.setMinWidth(200); 

emailCol.setCellValueFactory( 

new PropertyValueFactory<>("email")); 

table.setItems(data); 

table.getColumns().addAll(firstNameCol, lastNameCol, varstaCol, grupaCol, emailCol); 

//creare texte 

final TextField addFirstName = new TextField(); 

addFirstName.setPromptText("First Name"); 

addFirstName.setMaxWidth(firstNameCol.getPrefWidth()); 

final TextField addLastName = new TextField(); 

addLastName.setMaxWidth(lastNameCol.getPrefWidth()); 

addLastName.setPromptText("Last Name"); 

final TextField addVarsta = new TextField(); 

addVarsta.setPromptText("Varsta"); 

addVarsta.setMaxWidth(varstaCol.getPrefWidth()); 

final TextField addGrupa = new TextField(); 

addGrupa.setPromptText("Grupa"); 

addGrupa.setMaxWidth(grupaCol.getPrefWidth()); 

final TextField addEmail = new TextField(); 

addEmail.setMaxWidth(emailCol.getPrefWidth()); 

addEmail.setPromptText("Email"); 

//implementare buton 

final Button addButton = new Button("Add"); 

addButton.setOnAction((ActionEvent e) -> { 

data.add(new Persoana( 

addFirstName.getText(), 

addLastName.getText(), 

addVarsta.getText(), 

addGrupa.getText(), 

addEmail.getText())); 

addFirstName.clear(); 

addLastName.clear(); 

addVarsta.clear(); 

addGrupa.clear(); 

addEmail.clear(); 

}); 

hb.getChildren().addAll(addFirstName, addLastName, addVarsta, addGrupa, addEmail, addButton); 

hb.setSpacing(3); 

final VBox vbox = new VBox(); 

vbox.setSpacing(5); 

vbox.setPadding(new Insets(10, 0, 0, 10)); 

vbox.getChildren().addAll(label, table, hb); 

((Group) scene.getRoot()).getChildren().addAll(vbox); 

stage.setScene(scene); 

stage.show();} 

//clasa imbricata pentru adaugarea de noi date

public static class Person { 

private final SimpleStringProperty firstName; 

private final SimpleStringProperty lastName; 

private final SimpleStringProperty varsta; 

private final SimpleStringProperty grupa; 

private final SimpleStringProperty email; 

private Person(String fName, String lName, String varsta, String grupa, String email) { 

this.firstName = new SimpleStringProperty(fName); 

this.lastName = new SimpleStringProperty(lName); 

this.varsta = new SimpleStringProperty(varsta); 

this.grupa = new SimpleStringProperty(grupa); 

this.email = new SimpleStringProperty(email); } 

public String getFirstName() { 

return firstName.get();} 

public void setFirstName(String fName) { 

firstName.set(fName);} 

public String getLastName() { 

return lastName.get();} 

public void setLastName(String fName) { 

lastName.set(fName);} 

public String getVarsta() { 

return varsta.get();} 

public void setVarsta(String fName) { 

varsta.set(fName);} 

public String getGrupa() { 

return grupa.get();} 

public void setGrupa(String fName) { 

grupa.set(fName);} 

public String getEmail() { 

return email.get();} 

public void setEmail(String fName) { 

email.set(fName);} 

} 

} 

