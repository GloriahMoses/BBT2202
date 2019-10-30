import javafx.application.Application; 
import javafx.geometry.Insets; 
import javafx.geometry.Pos; 
import javafx.scene.Scene;  
import javafx.scene.control.*; 
import javafx.scene.layout.*; 
import javafx.stage.Stage;
import javafx.scene.text.*; 

public class Gui extends Application{
	@Override
	public void start(Stage stage) throws Exception{
		

		//1
		Text text1 = new Text("Name:");

		//2
		Text text2 = new Text("Registered:");

		//3
		TextField textfield1 = new TextField();

		//4
		ComboBox comboBox = new ComboBox();

		//5
		Button button1 = new Button("Save");
		Button button2 = new Button("Remove");

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
		gridpane.add(text1, 0, 0);
		gridpane.add(textfield1, 1, 0);
		gridpane.add(button1, 1, 1);

		gridpane.add(text2, 0, 2);
		gridpane.add(comboBox, 1, 2);
		gridpane.add(button2, 1, 3);
		
		//12 styles missing
		button1.setStyle("-fx-border-color: #00ff00; -fx-border-width: 5px; -fx-font-size: 13pt;");
		button2.setStyle("-fx-background-color: darkslateblue");

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
