package primerospasos_ejercicio3;



import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Ejercicio3 extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Ejercicio3.fxml"));


        primaryStage.setTitle("Ejercicio Simple");
        primaryStage.setScene(new Scene(root, 50, 50));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}


