package reto2_css;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CargaParalela extends Application {

    @Override
    public void start(Stage escenarioPrincipal) throws Exception{
        Parent raiz = FXMLLoader.load(getClass().getResource("CargaParalela.fxml"));
        escenarioPrincipal.setTitle("Carga Paralela con JavaFX");
        Scene escena = new Scene(raiz, 400, 400);
        escena.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        escenarioPrincipal.setScene(escena);
        escenarioPrincipal.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
