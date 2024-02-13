package accesodatos_ejercicio1;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import java.sql.SQLException;
import java.util.List;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller {

    @FXML
    private TableView<TVideoJuego> tableViewVideojuegos;

    @FXML
    private TableColumn<TVideoJuego, String> nombreColumn;

    @FXML
    private TableColumn<TVideoJuego, Integer> anioColumn;

    @FXML
    private TableColumn<TVideoJuego, String> companiaColumn;

    @FXML
    private TableColumn<TVideoJuego, Double> precioColumn;

    @FXML
    private TableColumn<TVideoJuego, String> sinopsisColumn;

    @FXML
    private TableColumn<TVideoJuego, String> plataformaColumn;

    public void initialize() {
        try {
            // Inicializa las columnas
            nombreColumn.setCellValueFactory(new PropertyValueFactory<>("nombre"));
            anioColumn.setCellValueFactory(new PropertyValueFactory<>("anio"));
            companiaColumn.setCellValueFactory(new PropertyValueFactory<>("compania"));
            precioColumn.setCellValueFactory(new PropertyValueFactory<>("precio"));
            sinopsisColumn.setCellValueFactory(new PropertyValueFactory<>("sinopsis"));
            plataformaColumn.setCellValueFactory(new PropertyValueFactory<>("plataforma"));

            // Carga los datos de videojuegos en la tabla
            cargarJuegos();
        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }

    private void cargarJuegos() {
        try {
            TVideoJuegoModel model = new TVideoJuegoModel(
                "jdbc:mysql://localhost:33006/dbgametop", // URL de la base de datos
                "root", // Usuario
                "1234" // Contraseña
            );
            tableViewVideojuegos.setItems(model.getAllVideoJuegos());
        } catch (Exception e) {
            e.printStackTrace();
            // Manejar excepción: mostrar mensaje de error, etc.
        }
    }
}
