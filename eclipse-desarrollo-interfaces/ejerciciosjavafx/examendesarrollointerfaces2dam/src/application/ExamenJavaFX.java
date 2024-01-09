package application;

import javafx.application.Application;

public class ExamenJavaFX extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Carga el archivo FXML
            Parent root = FXMLLoader.load(getClass().getResource("/ejemplo.fxml"));
            
            // Crea la escena con el panel raíz del archivo FXML
            Scene scene = new Scene(root);
            
            // Establece la escena en el escenario principal y muestra la ventana
            primaryStage.setScene(scene);
            primaryStage.setTitle("Examen JavaFX");
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Lanzar la aplicación JavaFX
        launch(args);
    }
}
