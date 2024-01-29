package ejercicio4_css;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Ejercicio4CSSController {

    @FXML
    private TextField importeTextField;

    @FXML
    private Label resultadoLabel;

    @FXML
    private void calcularIVA4() {
        calcularIVA(0.04);
    }

    @FXML
    private void calcularIVA10() {
        calcularIVA(0.10);
    }

    @FXML
    private void calcularIVA21() {
        calcularIVA(0.21);
    }

    private void calcularIVA(double tasa) {
        try {
            double importe = Double.parseDouble(importeTextField.getText());
            double resultado = importe * tasa;
            resultadoLabel.setText(String.format("Resultado: %.2f", resultado));
        } catch (NumberFormatException e) {
            resultadoLabel.setText("Error: Entrada no válida");
        }
    }

    @FXML
    private void limpiar() {
        importeTextField.clear();
        resultadoLabel.setText("Resultado: ");
    }

    @FXML
    private void salir() {
        System.exit(0);
    }
}
