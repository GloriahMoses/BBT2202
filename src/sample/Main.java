package sample;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.text.*;
import java.time.LocalDate;

public class Main extends Application{

    Stage window;
    Scene scene, scene1;

    @Override
    public void start(Stage stage) {

        window = stage;

        //Creating Gridpane, scene object
        GridPane gridpane = new GridPane();
        gridpane.setPadding(new Insets(10, 10, 10, 10));
        gridpane.setVgap(10);
        gridpane.setHgap(10);
        gridpane.setAlignment(Pos.CENTER);

        scene = new Scene(gridpane, 1024, 600);

        //Creating a Text object
        Text text = new Text("Welcome Our Booking System");
        gridpane.add(text, 0, 0);

        //Setting font to the text
        text.setFont(new Font(45));

        //Add Click to Book Link
        Button clickbook = new Button("Click Here to Book!!!");
        gridpane.add(clickbook, 0, 4);
        clickbook.setOnAction(e -> window.setScene(scene1));

        //Scene2
        GridPane gridpane1 = new GridPane();
        gridpane1.setPadding(new Insets(10, 10, 10, 10));
        gridpane1.setVgap(10);
        gridpane1.setHgap(10);
        gridpane1.setAlignment(Pos.CENTER);
        scene1 = new Scene(gridpane1, 1024, 600);

        Text text2= new Text("You are in the system");
        gridpane1.add(text2, 0, 0);

        Button buttonback = new Button("Go BAck");
        gridpane1.add(buttonback, 0, 4);

        DatePicker checkin = new DatePicker();
        checkin.setPromptText("Check In");
        gridpane1.add(checkin, 0, 6);

        checkin.setDayCellFactory(picker -> new DateCell() {
            public void updateItem(LocalDate date, boolean empty) {
                super.updateItem(date, empty);
                LocalDate today = LocalDate.now();
                setDisable(empty || date.compareTo(today) < 0 );
            }
        });

        DatePicker checkout = new DatePicker();
        checkout.setPromptText("Check Out");
        gridpane1.add(checkout, 4, 6);

        checkout.setDayCellFactory(picker -> new DateCell() {
            public void updateItem(LocalDate date, boolean empty) {
                super.updateItem(date, empty);
                LocalDate today = LocalDate.now();
                setDisable(empty || date.compareTo(today) < 0 );
            }
        });

        ChoiceBox room= new ChoiceBox();
        //ChoiceBox.setPromptText("Select Room");
        room.getItems().addAll
                ("Standard Room", "Deluxe Room", "Superior Room", "Junior Suite", "Presidential Suit");
        gridpane1.add(room, 0, 8);

        // Add Email Text Field
        TextField emailField = new TextField();
        //emailField.setPrefHeight(40);
        emailField.setPromptText("Email");
        gridpane1.add(emailField, 4, 8);

        Button submit = new Button("Submit Here");
        gridpane1.add(submit, 10, 7);

        buttonback.setOnAction(e -> window.setScene(scene));

        //Setting title to the Stage
        stage.setTitle("Booking System");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }

    public static void main(String args[]){
        launch(args); }

}
