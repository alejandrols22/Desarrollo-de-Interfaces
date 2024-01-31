package ejercicio6_css_hilos;



import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class EjercicioHiloController {

    @FXML
    private Button startButton;
    
    @FXML
    private Label statusLabel;

    @FXML
    public void handleStartButtonAction() { // Asegúrate de que este método sea público.
        // Crea y comienza el hilo
        ContadorThread contadorThread = new ContadorThread();
        contadorThread.start();
    }
    
    // Clase interna para el hilo que cuenta hasta 10
    class ContadorThread extends Thread {
        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                try {
                    // Espera de 1 segundo
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                final int finalI = i;
                // Actualiza la interfaz de usuario después de cada número
                Platform.runLater(() -> statusLabel.setText("Contando: " + finalI));
            }
            // Mensaje final
            Platform.runLater(() -> statusLabel.setText("¡Tarea completada!"));
        }
    }
}

