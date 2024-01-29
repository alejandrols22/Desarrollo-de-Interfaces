package controlesavanzado_reto;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Slider slider = new Slider(0, 100, 50);
        ProgressBar progressBar = new ProgressBar(0);

        // Vincular el progreso del ProgressBar con el valor del Slider
        progressBar.progressProperty().bind(slider.valueProperty().divide(100));

        // Añadir un ChangeListener al Slider
        slider.valueProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                System.out.println("Slider Value: " + newValue.intValue());
            }
        });

        VBox root = new VBox(10, slider, progressBar);
        Scene scene = new Scene(root, 300, 200);

        primaryStage.setTitle("Slider and ProgressBar Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
