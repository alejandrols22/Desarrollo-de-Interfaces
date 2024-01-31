package reto1_css;



import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FormularioController {

    @FXML
    private TextField nameField;
    
    @FXML
    private TextField emailField;
    
    @FXML
    private Label statusLabel;

    @FXML
    private Button submitButton;

    @FXML
    private void handleSubmitAction() {
        // Deshabilitar el botón de envío para evitar múltiples envíos
        submitButton.setDisable(true);
        statusLabel.setText("Enviando datos...");

        // Crear un nuevo hilo para simular la operación de envío
        Thread sendThread = new Thread(() -> {
            try {
                // Simular tiempo de procesamiento de envío (por ejemplo, 2 segundos)
                Thread.sleep(2000);
                
                // Actualiza la interfaz de usuario con el resultado de la operación
                javafx.application.Platform.runLater(() -> {
                    statusLabel.setText("Datos enviados con éxito!");
                    submitButton.setDisable(false);
                });
            } catch (InterruptedException e) {
                javafx.application.Platform.runLater(() -> {
                    statusLabel.setText("Error al enviar datos.");
                    submitButton.setDisable(false);
                });
            }
        });

        // Iniciar el hilo
        sendThread.start();
    }
}
