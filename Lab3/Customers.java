import javafx.application.Application; 
import javafx.geometry.Insets; 
import javafx.geometry.Pos; 
import javafx.scene.Scene;  
import javafx.scene.control.*; 
import javafx.scene.layout.*; 
import javafx.stage.Stage;
import javafx.scene.text.*; 

public class Customers extends Application{
	@Override
	public void start(Stage stage) throws Exception{

		//Fields
		Text name = new Text("Name: ");
		TextField name_field = new TextField();

		Text phone = new Text("Phone: ");
		TextField phone_field = new TextField();

		Text email = new Text("Email: ");
		TextField email_field = new TextField();

		Button save = new Button("Save Customer");

		Text registered = new Text("Registered: ");
		ComboBox r_customer = new ComboBox();

		Button remove_customer = new Button("Remove Customer: ");

		
		//6
		GridPane gridpane = new GridPane();
		
		//7
		gridpane.setMinSize(600, 400);

		//8
		gridpane.setPadding(new Insets(10, 10, 10, 10));

		//9
		gridpane.setVgap(10);
		gridpane.setHgap(10);

		//10
		gridpane.setAlignment(Pos.CENTER);

		//11 Field positions
		gridpane.add(name, 0, 0);
		gridpane.add(name_field, 1, 0);

		gridpane.add(phone, 0, 2);
		gridpane.add(phone_field, 1, 2);

		gridpane.add(email, 0, 4);
		gridpane.add(email_field, 1, 4);

		gridpane.add(save, 1, 5);

		gridpane.add(registered, 0, 7);
		gridpane.add(r_customer, 1, 7);

		gridpane.add(remove_customer, 1, 8);	

		
		//12 styles missing
		//button1.setStyle("-fx-border-color: #00ff00; -fx-border-width: 5px;");
		//button2.setStyle("-fx-background-color: darkslateblue");

		//new scene obj
		Scene scene = new Scene(gridpane);

		//title
		stage.setTitle("Movie Library");


		//add scene
		stage.setScene(scene);

		//Display stage
		stage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}

//set PATH_TO_FX="C:\Users\Gloria\Desktop\javafx-sdk-13\lib"
//javac --module-path %PATH_TO_FX% --add-modules javafx.controls MovieGenre.java
//java --module-path %PATH_TO_FX% --add-modules javafx.controls MovieGenre