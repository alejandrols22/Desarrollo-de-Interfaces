package reto2_css;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ControladorCargaParalela {

    @FXML
    private Button botonIniciar;
    
    @FXML
    private Label etiquetaEstado1, etiquetaEstado2, etiquetaEstado3;

    @FXML
    private void manejarAccionIniciar() {
        botonIniciar.setDisable(true);
        cargarDatosAsincrono(etiquetaEstado1, "Fuente de datos 1", 2000);
        cargarDatosAsincrono(etiquetaEstado2, "Fuente de datos 2", 4000);
        cargarDatosAsincrono(etiquetaEstado3, "Fuente de datos 3", 6000);
    }
    
    private void cargarDatosAsincrono(Label etiquetaEstado, String fuenteDatos, int tiempoEspera) {
        Thread hilo = new Thread(() -> {
            actualizarEstado(etiquetaEstado, "Cargando " + fuenteDatos + "...");
            try {
                Thread.sleep(tiempoEspera);
            } catch (InterruptedException e) {
                actualizarEstado(etiquetaEstado, "Error en " + fuenteDatos);
                Thread.currentThread().interrupt();
            }
            actualizarEstado(etiquetaEstado, fuenteDatos + " cargados.");
        });
        hilo.start();
    }
    
    private void actualizarEstado(Label etiqueta, String estado) {
        javafx.application.Platform.runLater(() -> etiqueta.setText("Estado: " + estado));
    }
}
