package primerospasos_ejercicio5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SimpleController {

    @FXML
    private Button Boton1, Boton2, Boton3, Boton4;

    @FXML
    public void pulsame(ActionEvent event) {
        String idBotonPulsado = ((Button) event.getSource()).getId();
        System.out.println("Botón pulsado: " + idBotonPulsado);
        switch (idBotonPulsado) {
            case "Boton1":
                System.out.println("¡Has pulsado el botón 1!");
                break;
            case "Boton2":
                System.out.println("¡Has pulsado el botón 2!");
                break;
            case "Boton3":
                System.out.println("¡Has pulsado el botón 3!");
                break;
            case "Boton4":
                System.out.println("¡Has pulsado el botón 4!");
                break;
            default:
                System.out.println("Botón no reconocido");
                break;
        }
    }
}

