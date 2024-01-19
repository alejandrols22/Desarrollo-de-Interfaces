package primerospasos_ejercicio9;


import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

public class SimpleController {
    
    @FXML
    private AnchorPane anchorPane; 

    @FXML
    private ColorPicker colorPicker; 

    @FXML
    public void initialize() {
        // Inicializa el manejador de eventos del ColorPicker
        colorPicker.setOnAction(event -> {
            Color color = colorPicker.getValue(); // Obtiene el color seleccionado
            // Convierte el color a formato web (CSS)
            String webColor = String.format("#%02X%02X%02X",
                    (int)(color.getRed() * 255),
                    (int)(color.getGreen() * 255),
                    (int)(color.getBlue() * 255));
            // Actualiza el color de fondo del AnchorPane
            anchorPane.setStyle("-fx-background-color: " + webColor + ";");
        });
    }
}
