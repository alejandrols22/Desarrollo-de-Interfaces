package accesodatos_ejercicioavanzado1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EjercicioAvanzadoAccesoDatos1 extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Cargar el archivo FXML para la interfaz de usuario
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Ejercicio1AvanzadoFXML.fxml")); 
            Parent root = loader.load();
            
            // Configura el título de la ventana
            primaryStage.setTitle("Visualizador de Alumnos");
            Scene scene = new Scene(root, 800, 200);
            
            // Crea la escena con el root cargado y establece su hoja de estilos CSS
            
            scene.getStylesheets().add(getClass().getResource("Ejercicio1Avanzado.css").toExternalForm()); 
            
            // Establece la escena en el escenario y la muestra
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