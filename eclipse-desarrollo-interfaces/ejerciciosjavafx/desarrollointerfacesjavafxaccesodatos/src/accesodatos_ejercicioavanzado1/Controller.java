package accesodatos_ejercicioavanzado1;


import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller {
    @FXML
    private TableView<Alumno> tableViewAlumnos;
    @FXML
    private TableColumn<Alumno, Integer> idColumn;
    @FXML
    private TableColumn<Alumno, String> nombreColumn;
    @FXML
    private TableColumn<Alumno, String> apellido1Column;
    @FXML
    private TableColumn<Alumno, String> apellido2Column;
    // Otros campos de la tabla aquí

    public void initialize() {
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nombreColumn.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        apellido1Column.setCellValueFactory(new PropertyValueFactory<>("apellido1"));
        apellido2Column.setCellValueFactory(new PropertyValueFactory<>("apellido2"));
        // Configuración de otros campos aquí

        cargarAlumnos();
    }

    private void cargarAlumnos() {
        try {
            AlumnoModel model = new AlumnoModel();
            tableViewAlumnos.setItems(model.getAllAlumnos());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

