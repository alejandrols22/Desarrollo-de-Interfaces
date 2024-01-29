package ejercicio5_css;



import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Ejercicio5CSS.fxml"));
            primaryStage.setTitle("Ejercicio 5 CSS");

            // Establecer el tamaño de la ventana aquí
            Scene scene = new Scene(root, 800, 600); // 
            scene.getStylesheets().add(getClass().getResource("Ejercicio5.css").toExternalForm());
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