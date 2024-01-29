package controlesavanzado_ejercicio1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Ejercicio1ControlesAvanzado.fxml"));
            primaryStage.setTitle("Control Avanzado");

            // Establecer el tamaño de la ventana aquí
            Scene scene = new Scene(root, 300, 400); // 
            primaryStage.setScene(scene);

            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}