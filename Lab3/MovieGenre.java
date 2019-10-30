import javafx.application.Application; 
import javafx.geometry.Insets; 
import javafx.geometry.Pos; 
import javafx.scene.Scene;  
import javafx.scene.control.*; 
import javafx.scene.layout.*; 
import javafx.stage.Stage;
import javafx.scene.text.*; 

public class MovieGenre extends Application{
	@Override
	public void start(Stage stage) throws Exception{
		

		Text text = new Text("Genre:");

		//1
		Text text1 = new Text("Name:");

		//2
		Text text2 = new Text("Registered:");

		//3
		TextField textfield1 = new TextField();
		textfield1.setPrefWidth(150);

		//4
		ComboBox genre_comboBox = new ComboBox();
		genre_comboBox.setPrefWidth(150);

		ComboBox comboBox = new ComboBox();
		comboBox.setPrefWidth(150);

		//5
		Button button1 = new Button("Save Movie");
		Button button2 = new Button("Remove Movie");

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

		//11
		gridpane.add(text, 0, 0);
		gridpane.add(genre_comboBox, 1, 0);

		gridpane.add(text1, 0, 1);
		gridpane.add(textfield1, 1, 1);
		gridpane.add(button1, 1, 2);

		gridpane.add(text2, 0, 3);
		gridpane.add(comboBox, 1, 3);
		gridpane.add(button2, 1, 4);
		

		
		//12 styles missing
		button1.setStyle("-fx-background-color: #2782d8; -fx-font-size: 13pt;");
		button2.setStyle("-fx-background-color: #2782d8; -fx-font-size: 13pt;");

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