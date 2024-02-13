package accesodatos_ejercicio3_4;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import java.sql.SQLException;
import java.util.List;
import accesodatos_ejercicio1.TVideoJuego;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.SQLException;

public class Controller {

    @FXML private TableView<TVideoJuego> tableViewVideojuegos;
    @FXML private TableColumn<TVideoJuego, String> nombreColumn;
    @FXML private TableColumn<TVideoJuego, Integer> anioColumn;
    @FXML private TableColumn<TVideoJuego, String> companiaColumn;
    @FXML private TableColumn<TVideoJuego, Double> precioColumn;
    @FXML private TableColumn<TVideoJuego, String> sinopsisColumn;
    @FXML private TableColumn<TVideoJuego, String> plataformaColumn;
    @FXML private TextField nombreTextField;
    @FXML private TextField anioTextField;
    @FXML private ComboBox<String> cmbCompania;
    @FXML private TextField precioTextField;
    @FXML private TextField sinopsisTextField;
    @FXML private ChoiceBox<String> choicePlataforma;
    @FXML private Button btnAgregarJuego;

    private TVideoJuegoModel model;

    public void inicializar(String dbURL, String dbUser, String dbPassword) throws SQLException {
        model = new TVideoJuegoModel(dbURL, dbUser, dbPassword);
        cargarCompanias();
        cargarPlataformas();
    }

    private void cargarCompanias() {
        List<String> companias = List.of("EA", "Ubisoft", "Activision", "Nintendo", "Sony", "Microsoft");
        cmbCompania.setItems(FXCollections.observableArrayList(companias));
    }

    private void cargarPlataformas() {
        List<String> plataformas = List.of("PC", "PlayStation", "Xbox", "Nintendo Switch");
        choicePlataforma.setItems(FXCollections.observableArrayList(plataformas));
    }

    @FXML
    private void agregarJuego() {
        try {
            String nombre = nombreTextField.getText();
            int anio = Integer.parseInt(anioTextField.getText()); // Asume un valor entero válido
            String compania = cmbCompania.getValue();
            double precio = Double.parseDouble(precioTextField.getText()); // Asume un valor double válido
            String sinopsis = sinopsisTextField.getText();
            String plataforma = choicePlataforma.getValue();

            TVideoJuego nuevoJuego = new TVideoJuego(0, nombre, anio, compania, precio, sinopsis, plataforma);
            model.addVideoJuego(nuevoJuego);
            mostrarMensaje("Juego Añadido", "El juego ha sido añadido exitosamente.");
        } catch (NumberFormatException e) {
            mostrarMensajeError("Error de Formato", "Por favor, ingrese valores numéricos válidos para el año y el precio.");
        } catch (SQLException e) {
            mostrarMensajeError("Error de Base de Datos", "No se pudo añadir el juego a la base de datos.");
        }
    }

    private void mostrarMensaje(String titulo, String contenido) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(contenido);
        alert.showAndWait();
    }

    private void mostrarMensajeError(String titulo, String contenido) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(contenido);
        alert.showAndWait();
    }
}


