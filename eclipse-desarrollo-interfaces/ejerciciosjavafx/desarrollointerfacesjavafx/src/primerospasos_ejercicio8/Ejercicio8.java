package primerospasos_ejercicio8;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Ejercicio8 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        try {
            // Carga el diseño FXML.
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Ejercicio8.fxml"));
            Parent root = loader.load();
            
            // Establece la escena y muestra la ventana.
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Demo de Ejercicio8");
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
