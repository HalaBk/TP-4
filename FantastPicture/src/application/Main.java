package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent rootFXML = FXMLLoader.load(getClass ().getResource("Vue.fxml") );
			Scene sceneFXML = new Scene(rootFXML);
			
			//titre de mon application
			primaryStage.setTitle("Fantast'Picture");
			
			//Attribut la composition de ma fenetre a ma fenetre principale.
			primaryStage.setScene(sceneFXML);
			
			//Affiche la fenetre principale
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
