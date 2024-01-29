package ejercicio3_css;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Ejercicio3CSSController {

    @FXML
    private TextField campoTexto;

    private double datoTemporal = 0;
    private String operadorTemporal = "";
    private boolean inicioOperacion = true;

    @FXML
    private void presionarDigito(javafx.event.ActionEvent evento) {
        if (inicioOperacion) {
            campoTexto.setText("");
            inicioOperacion = false;
        }

        String valor = ((Button) evento.getSource()).getText();
        campoTexto.setText(campoTexto.getText() + valor);
    }

    @FXML
    private void presionarOperacion(javafx.event.ActionEvent evento) {
        if (!inicioOperacion) {
            calcular();
            inicioOperacion = true;
        }
        operadorTemporal = ((Button) evento.getSource()).getText();
        datoTemporal = Double.parseDouble(campoTexto.getText());
        campoTexto.setText("");
    }

    @FXML
    private void presionarIgual(javafx.event.ActionEvent evento) {
        calcular();
        operadorTemporal = "";
    }

    @FXML
    private void presionarBorrar(javafx.event.ActionEvent evento) {
        campoTexto.setText("");
        operadorTemporal = "";
        datoTemporal = 0;
        inicioOperacion = true;
    }

    private void calcular() {
        if (operadorTemporal.isEmpty()) return;

        double datoActual = Double.parseDouble(campoTexto.getText());
        double resultado = 0;

        switch (operadorTemporal) {
            case "+":
                resultado = datoTemporal + datoActual;
                break;
            case "-":
                resultado = datoTemporal - datoActual;
                break;
            case "*":
                resultado = datoTemporal * datoActual;
                break;
            case "/":
                if (datoActual == 0) {
                    campoTexto.setText("Error");
                    return;
                }
                resultado = datoTemporal / datoActual;
                break;
        }

        campoTexto.setText(String.format("%.2f", resultado));
        datoTemporal = resultado;
        inicioOperacion = true;
    }
}
