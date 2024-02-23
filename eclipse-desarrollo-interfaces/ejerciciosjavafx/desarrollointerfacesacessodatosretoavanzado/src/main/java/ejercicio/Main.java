package ejercicio;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Carga el archivo FXML para la interfaz de usuario
            FXMLLoader loader = new FXMLLoader(getClass().getResource("reto.fxml"));
            Parent root = loader.load();
            
            // Configura el título de la ventana y añade la hoja de estilos CSS
            primaryStage.setTitle("Biblioteca");
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("reto.css").toExternalForm());

            // Establece la escena en el escenario y la muestra
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
