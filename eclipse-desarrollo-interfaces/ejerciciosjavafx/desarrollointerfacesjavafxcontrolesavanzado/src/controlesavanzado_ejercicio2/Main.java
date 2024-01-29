package controlesavanzado_ejercicio2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Ejercicio2ControlesAvanzado.fxml"));
            primaryStage.setTitle("Control Avanzado");
            
         // Configurar el título y el icono de la ventana
            primaryStage.setTitle("Videojuegos");
            primaryStage.getIcons().add(new Image("file:./src/controlesavanzado_ejercicio2/juego.png"));
           
            
            // Establecer el tamaño de la ventana aquí
            Scene scene = new Scene(root, 650, 400); // Ancho de 800px y alto de 600px
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