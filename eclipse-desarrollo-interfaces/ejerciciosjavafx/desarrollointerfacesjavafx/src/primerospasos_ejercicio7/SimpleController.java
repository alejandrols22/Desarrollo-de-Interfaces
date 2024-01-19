package primerospasos_ejercicio7;

import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.Node;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;

public class SimpleController {

    @FXML
    private VBox vboxContainer;

    // Inicialmente, la orientación es vertical
    private boolean esVertical = true;

    @FXML
    private void toggleOrientation() {
        // Crea un nuevo contenedor del tipo opuesto al actual y mueve todos los botones a él
        if (esVertical) {
            HBox hbox = new HBox();
            hbox.setAlignment(Pos.CENTER_LEFT); // Alinear a la izquierda
            hbox.getChildren().addAll(vboxContainer.getChildren()); // Mueve los botones al HBox
            vboxContainer.getChildren().setAll(hbox); // Coloca el HBox en el VBox
        } else {
            VBox vbox = new VBox();
            vbox.setAlignment(Pos.CENTER_LEFT); // Alinear a la izquierda
            // Suponemos que el primer hijo del VBox es el HBox con los botones
            HBox hbox = (HBox) vboxContainer.getChildren().get(0);
            vbox.getChildren().addAll(hbox.getChildren()); // Mueve los botones al VBox
            vboxContainer.getChildren().setAll(vbox); // Coloca el VBox en el VBox original
        }
        // Cambia el estado de la orientación
        esVertical = !esVertical;
    }
}

