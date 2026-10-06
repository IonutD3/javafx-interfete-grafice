# JavaFX pentru Interfețe Grafice

## 🇷🇴 Română

### Despre proiect

Colecție de aplicații Java realizate cu **JavaFX**, axate pe dezvoltarea interfețelor grafice, gestionarea evenimentelor și utilizarea principalelor componente JavaFX.

Proiectul reunește mai multe exemple independente care demonstrează utilizarea componentelor UI, organizarea elementelor într-un layout, gestionarea acțiunilor utilizatorului și afișarea și manipularea datelor în componente precum `TableView`, `TreeView` și `ListView`.

## Obiectiv

Scopul proiectului este de a demonstra aplicarea conceptelor fundamentale de **GUI development în Java**, folosind JavaFX:

- creare și configurare de ferestre și scene;
- organizarea componentelor folosind layout-uri;
- gestionarea evenimentelor generate de utilizator;
- utilizarea butoanelor și a meniurilor;
- afișarea datelor tabelare;
- reprezentarea datelor într-o structură arborescentă;
- utilizarea listelor observabile;
- manipularea dinamică a elementelor unei interfețe grafice;
- separarea componentelor și exemplelor în clase Java individuale.

## Tehnologii

- **Java**
- **JavaFX**
- **Maven** pentru organizarea și gestionarea proiectului

## Structura proiectului

```text
javafx-interfete-grafice/
│
├── README.md
│
└── src/
    ├── SalutJavaFX.java
    ├── MeniuJavaFX.java
    ├── PatruButoane.java
    ├── TabelStudenti.java
    ├── ArboreSimplu.java
    ├── ArboreIerarhic.java
    └── GestionareStudenti.java
```

Fiecare exemplu este implementat într-o clasă Java separată, astfel încât componentele proiectului să poată fi analizate și executate independent.

## Exemple incluse

### 1. SalutJavaFX

Demonstrează utilizarea de bază a JavaFX printr-o interfață care conține butoane și gestionează acțiunile utilizatorului.

Exemplul utilizează:

- `Application`;
- `Stage`;
- `Scene`;
- `Button`;
- `HBox`;
- `Group`;
- `EventHandler`;
- `ActionEvent`.

La apăsarea butoanelor sunt modificate proprietățile acestora și sunt procesate evenimentele asociate.

### 2. MeniuJavaFX

Exemplu de construire a unei interfețe cu **meniu și submeniuri**.

Sunt utilizate:

- `MenuBar`;
- `Menu`;
- `MenuItem`;
- `CheckMenuItem`;
- `RadioMenuItem`;
- `ToggleGroup`;
- `SeparatorMenuItem`;
- `BorderPane`.

Exemplul include meniuri pentru operații precum `File`, opțiuni pentru componente Web/SQL și un submeniu pentru selectarea unor tehnologii Java.

### 3. PatruButoane

Exemplu concentrat pe gestionarea mai multor controale și a evenimentelor asociate acestora.

Interfața conține patru butoane, fiecare având propriul handler. La activare, butonul își modifică textul și dimensiunea fontului.

### 4. TabelStudenti

Exemplu de utilizare a componentei **`TableView`** pentru afișarea și adăugarea dinamică a datelor.

Tabelul conține informații despre persoane:

- prenume;
- nume;
- vârstă;
- grupă;
- adresă de email.

Datele sunt gestionate prin `ObservableList`, iar utilizatorul poate introduce persoane noi prin intermediul câmpurilor `TextField` și al butonului `Add`.

### 5. ArboreSimplu

Demonstrează utilizarea componentei **`TreeView`** pentru reprezentarea unei structuri ierarhice.

Exemplul construiește o rădăcină și mai multe elemente copil (`TreeItem`) și le afișează într-un `TreeView`.

### 6. ArboreIerarhic

Exemplu extins de utilizare a `TreeView`, în care elementele sunt construite pe mai multe niveluri.

Metoda `makeBranch()` este utilizată pentru crearea și atașarea elementelor copil la structura existentă.

Exemplul evidențiază:

- construirea unei structuri arborescente;
- organizarea elementelor pe niveluri;
- utilizarea `TreeItem`;
- controlul vizibilității rădăcinii;
- reutilizarea unei metode pentru construirea ramurilor.

### 7. GestionareStudenti

Exemplu de utilizare a `ObservableList` și `ListView` pentru gestionarea a două liste de elemente.

Aplicația permite mutarea unui student între cele două liste prin intermediul butoanelor de control.

Sunt utilizate:

- `ObservableList`;
- `ListView`;
- `GridPane`;
- `VBox`;
- `Button`;
- `Label`;
- `Alert`;
- gestionarea evenimentelor.

Interfața include și o acțiune suplimentară care schimbă dinamic etichetele celor două liste și afișează un mesaj prin intermediul unui dialog JavaFX.

## Concepte demonstrate

Prin exemplele incluse în proiect sunt demonstrate următoarele concepte:

| Domeniu | Concepte |
|---|---|
| JavaFX | `Application`, `Stage`, `Scene` |
| UI Controls | `Button`, `Label`, `TextField`, `ListView`, `TableView`, `TreeView` |
| Layout | `HBox`, `VBox`, `GridPane`, `BorderPane`, `StackPane`, `Group` |
| Events | `ActionEvent`, `EventHandler`, event handlers lambda |
| Menus | `MenuBar`, `Menu`, `MenuItem`, `CheckMenuItem`, `RadioMenuItem` |
| Collections | `ObservableList`, `FXCollections` |
| Tables | `TableView`, `TableColumn`, `PropertyValueFactory` |
| Trees | `TreeView`, `TreeItem` |
| Dialogs | `Alert` |
| JavaFX Properties | `SimpleStringProperty` |

## Organizarea codului

Proiectul este structurat astfel încât fiecare exemplu să reprezinte o unitate independentă și ușor de urmărit.

Clasele sunt păstrate în fișiere `.java` separate.
Această organizare facilitează:

- citirea și înțelegerea codului;
- testarea individuală a exemplelor;
- extinderea proiectului;
- reutilizarea componentelor;
- menținerea unei structuri clare a repository-ului.

## Scop educațional

Proiectul reprezintă o colecție de exerciții practice orientate către dezvoltarea interfețelor grafice în Java și poate fi utilizat ca punct de pornire pentru aplicații JavaFX mai complexe.

Exemplele acoperă atât componente individuale, cât și interacțiuni între mai multe componente ale interfeței, oferind o imagine de ansamblu asupra modului în care JavaFX poate fi utilizat pentru construirea aplicațiilor desktop.

---

# JavaFX GUI

## 🇬🇧 English

## About the Project

This project contains a series of independent JavaFX examples created to demonstrate how common JavaFX components and interaction patterns can be implemented in desktop applications.

The examples cover both basic UI components and more structured interfaces involving tables, hierarchical data, and dynamic lists.

## Technologies

- **Java**
- **JavaFX**
- **Maven**

## Project Structure

```text
javafx-interfete-grafice/
│
├── README.md
│
└── src/
    ├── SalutJavaFX.java
    ├── MeniuJavaFX.java
    ├── PatruButoane.java
    ├── TabelStudenti.java
    ├── ArboreSimplu.java
    ├── ArboreIerarhic.java
    └── GestionareStudenti.java
```

Each example is implemented as a separate Java class.

## Included Examples

### SalutJavaFX

A basic JavaFX application demonstrating the creation of a window, scene, buttons, layouts, and event handlers.

The example includes:

- `Application`
- `Stage`
- `Scene`
- `Button`
- `HBox`
- `Group`
- `ActionEvent`
- `EventHandler`

Button interactions modify the button properties and trigger actions handled by the application.

### MeniuJavaFX

An example focused on building a graphical interface with menus and menu items.

The application demonstrates:

- `MenuBar`
- `Menu`
- `MenuItem`
- `CheckMenuItem`
- `RadioMenuItem`
- `ToggleGroup`
- `SeparatorMenuItem`
- `BorderPane`

The example includes file-related actions, selectable menu options, radio menu items, and nested menu structures.

### PatruButoane

An example demonstrating multiple buttons and individual event handlers.

Each button has its own action. When activated, the button changes its displayed text and font size.

This example demonstrates basic event-driven GUI programming with JavaFX.

### TabelStudenti

An example using **`TableView`** to display and dynamically add structured data.

The table contains the following fields:

- First name
- Last name
- Age
- Group
- Email

The data is stored in an `ObservableList`, while new entries can be added through `TextField` controls and an `Add` button.


### ArboreSimplu

A basic example of using **`TreeView`** to represent hierarchical data.

The application creates a root node and several child nodes using `TreeItem`, then displays the resulting structure through a `TreeView`.

### ArboreIerarhic

An extended `TreeView` example demonstrating a hierarchy with multiple levels.

The `makeBranch()` method is used to create and attach child nodes to the existing tree structure.

This example demonstrates:

- hierarchical data representation;
- `TreeItem`;
- `TreeView`;
- reusable methods for creating tree branches;
- multi-level structures.

### GestionareStudenti

An example demonstrating the use of **`ObservableList`** and **`ListView`** for managing two lists of elements.

The interface allows an item to be moved from one list to another using control buttons.

The example uses:

- `ObservableList`
- `ListView`
- `GridPane`
- `VBox`
- `Button`
- `Label`
- `Alert`
- JavaFX event handling

It also demonstrates dynamically changing interface labels and displaying information through an alert dialog.

## Concepts Demonstrated

| Area | Technologies / Concepts |
|---|---|
| JavaFX | `Application`, `Stage`, `Scene` |
| Controls | `Button`, `Label`, `TextField`, `ListView`, `TableView`, `TreeView` |
| Layouts | `HBox`, `VBox`, `GridPane`, `BorderPane`, `StackPane`, `Group` |
| Events | `ActionEvent`, `EventHandler`, lambda expressions |
| Menus | `MenuBar`, `Menu`, `MenuItem`, `CheckMenuItem`, `RadioMenuItem` |
| Collections | `ObservableList`, `FXCollections` |
| Tables | `TableView`, `TableColumn`, `PropertyValueFactory` |
| Trees | `TreeView`, `TreeItem` |
| Dialogs | `Alert` |
| Properties | `SimpleStringProperty` |

## Code Organization

The project is organized so that each JavaFX example is kept in a separate class.

The data model used by the table application is also separated into its own Java file. This provides a cleaner project structure and makes the individual components easier to understand and maintain.

The organization is intended to keep the examples independent while demonstrating different JavaFX features in a consistent project structure.

## Purpose

The project provides practical examples of JavaFX desktop GUI development using Java.

It demonstrates how JavaFX components can be combined to create interactive interfaces and how user actions can be handled through event-driven programming.

The examples can also serve as a foundation for developing more complex JavaFX desktop applications.

---

## 👤 Autor / Author

**IonutD**
