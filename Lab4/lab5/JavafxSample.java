import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class JavafxSample extends Application implements Interface{
	
	@Override
	public void start(Stage stage) throws Exception{
		//step 1: create label Name
		Text text1= new Text("Name: ");
		
		//step 2: create label Registered
		Text text2 = new Text("Registered: ");
		
		// create new label genre
		Text text3 = new Text("Genre: ");
		
		//step 3: create Text Field for name
		TextField textField1 = new TextField();
		
		//step 4: create Combo Box for registered
		ComboBox comboBox = new ComboBox();
		
		ComboBox comboBox1 = new ComboBox(); 
		
		//step 5: create buttons
		Button button1 = new Button("Save Movie");
		Button button2 = new Button("Remove");
		
		//step 6: creating a Grid Pane and Import relevant classes
		GridPane gp = new GridPane();
		
		//step 7: Set up size for the pane
		gp.setMinSize(600, 400);
		
		//step 8: set padding
		gp.setPadding(new Insets(10,10,10,10));
		
		//step 9:Set the vertical and horizontal gaps between the columns
		gp.setVgap(10);
		gp.setHgap(10);
		
		//step 10 Set the grid alignment
		gp.setAlignment(Pos.CENTER);
		
		//step 11: Arrange all the nofes in the grid
		gp.add(text3, 0, 0);
		gp.add(comboBox1, 1, 0);
		
		gp.add(text1, 0, 1);
		gp.add(textField1, 1, 1);
		gp.add(button1, 1, 3);
		
		gp.add(text2, 0, 4);
		gp.add(comboBox, 1, 4);
		
		gp.add(button2, 1, 5);
		
		//step 12: Style nodes, be creative and add more styles
		button1.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font-size->l3pt;");
		button2.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font-size->l3pt;");
		
		text1.setStyle("-fx-font: normal bold 20px 'serif' ");
		text2.setStyle("-fx-font: normal bold 20px 'serif' ");
		text3.setStyle("-fx-font: normal bold 20px 'serif' ");
		gp.setStyle("-fx-background-color: BEIGE;");
		
		//Creating a scene object
		Scene scene = new Scene(gp);
		
		//Setting title to the stage
		stage.setTitle("Movie Library System");
		
		//Adding scene to the stage
		stage.setScene(scene);
		
		//Displaying the contents of the stage
		stage.show();
	}
	
	/*public static void main(String[] args){
		//launch(args);
		
	}*/
	@Override
		public void animation(){
			launch();
		}
}