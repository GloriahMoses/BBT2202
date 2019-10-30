import javafx.application.Application; 
import javafx.geometry.Insets; 
import javafx.geometry.Pos; 
import javafx.scene.Scene;  
import javafx.scene.control.*; 
import javafx.scene.layout.*; 
import javafx.stage.Stage;
import javafx.scene.text.*; 

public class MovieLib extends Application{
	@Override
	public void start(Stage stage) throws Exception{
		

		//1
		Text name = new Text("Name:");
		//name.setPrefWidth(150);

		//2
		Text registered = new Text("Registered:");
		//registered.setPrefWidth(150);

		//3
		TextField textfield1 = new TextField();
		textfield1.setPrefWidth(150);

		//4
		ComboBox comboBox = new ComboBox();
		comboBox.setPrefWidth(150);

		//5
		Button save = new Button("Save");
		save.setStyle("-fx-background-color: #2782d8; -fx-font-size: 13pt;");

		Button remove = new Button("Remove");
		remove.setStyle("-fx-background-color: #2782d8; -fx-font-size: 13pt;");

		//6
		GridPane gridpane = new GridPane();
		gridpane.setStyle("-fx-border-color: #08343a; -fx-border-width: 1px;");
		
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
		gridpane.add(name, 0, 0);
		gridpane.add(textfield1, 1, 0);
		gridpane.add(save, 1, 1);

		gridpane.add(registered, 0, 2);
		gridpane.add(comboBox, 1, 2);
		gridpane.add(remove, 1, 3);

		
		/*12 styles missing
		button1.setStyle("-fx-border-color: #00ff00; -fx-border-width: 5px; -fx-font-size: 13pt;");
		button2.setStyle("-fx-background-color: darkslateblue");*/

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
