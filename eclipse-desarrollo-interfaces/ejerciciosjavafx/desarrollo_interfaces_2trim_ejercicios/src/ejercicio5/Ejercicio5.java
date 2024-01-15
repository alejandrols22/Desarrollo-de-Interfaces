package ejercicio5;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Ejercicio5 {
	public void start(Stage primaryStage) throws Exception {
	FXMLLoader loader = new FXMLLoader(getClass().getResource("Ejercicio4.fxml"));
	Parent root = loader.load();


	primaryStage.setTitle("Mi Aplicación JavaFX");
	primaryStage.setScene(new Scene(root, 750, 300));
	primaryStage.show();
	}

	public static void main(String[] args) {
	launch(args);
	}

}
