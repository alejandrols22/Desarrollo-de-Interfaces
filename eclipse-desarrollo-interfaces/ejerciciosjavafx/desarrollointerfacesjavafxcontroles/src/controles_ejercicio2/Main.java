package controles_ejercicio2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Ejercicio2Controles.fxml"));
            Parent root = loader.load();
            
            Scene scene = new Scene(root);

            // Establecer el tamaño preferido de la ventana
            primaryStage.setMinWidth(800); // Ancho mínimo
            primaryStage.setMinHeight(600); // Altura mínima
            primaryStage.setWidth(1024); // Ancho preferido
            primaryStage.setHeight(768); // Altura preferida

            primaryStage.setScene(scene);
            primaryStage.setTitle("Ejercicio2 Controles");
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
