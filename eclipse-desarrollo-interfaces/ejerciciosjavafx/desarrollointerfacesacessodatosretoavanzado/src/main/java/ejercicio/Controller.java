package ejercicio;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller {

    @FXML
    private TextField txtTitulo, txtAutor, txtPaginas;
    @FXML
    private ChoiceBox<String> choiceEditorial;
    @FXML
    private TableView<Libro> tablaLibros;
    @FXML
    private TableColumn<Libro, Integer> columnaId;
    @FXML
    private TableColumn<Libro, String> columnaTitulo;
    @FXML
    private TableColumn<Libro, String> columnaEditorial;
    @FXML
    private TableColumn<Libro, String> columnaAutor;
    @FXML
    private TableColumn<Libro, Integer> columnaPaginas;

    private final LibroModel modelo = new LibroModel();
    private final LibroDAO libroDAO = new LibroDAO();

    @FXML
    private void initialize() {
        columnaTitulo.setCellValueFactory(new PropertyValueFactory<Libro, String>("titulo"));
        columnaEditorial.setCellValueFactory(new PropertyValueFactory<Libro, String>("editorial"));
        columnaAutor.setCellValueFactory(new PropertyValueFactory<Libro, String>("autor"));
        columnaPaginas.setCellValueFactory(new PropertyValueFactory<Libro, Integer>("paginas"));

        // Configurar el ChoiceBox con las editoriales (debería ser dinámico en un caso real)
        choiceEditorial.getItems().addAll("Editorial Planeta", "Editorial Anaya", "Editorial Santillana");

        tablaLibros.setItems(modelo.getListaLibros());
    }


    @FXML
    private void agregarLibro() {
        try {
            String titulo = txtTitulo.getText();
            String autor = txtAutor.getText();
            String editorial = choiceEditorial.getValue();
            int paginas = Integer.parseInt(txtPaginas.getText());

            // Validación simple, debería ser más robusta en un caso real
            if (titulo.isEmpty() || autor.isEmpty() || editorial.isEmpty()) {
                mostrarAlerta("Todos los campos deben estar llenos.");
                return;
            }

            Libro libro = new Libro();
            libro.setTitulo(titulo);
            libro.setAutor(autor);
            libro.setEditorial(editorial);
            libro.setPaginas(paginas);

            libroDAO.insertar(libro);
            modelo.agregarLibro(libro);
        } catch (NumberFormatException e) {
            mostrarAlerta("Por favor, ingresa un número válido de páginas.");
        } catch (Exception e) {
            mostrarAlerta("Error al agregar el libro: " + e.getMessage());
        }
    }

    @FXML
    private void eliminarLibro() {
        Libro libroSeleccionado = tablaLibros.getSelectionModel().getSelectedItem();
        if (libroSeleccionado != null) {
            libroDAO.borrar(libroSeleccionado);
            modelo.eliminarLibro(libroSeleccionado);
            tablaLibros.getSelectionModel().clearSelection();
        } else {
            mostrarAlerta("Selecciona un libro para eliminar.");
        }
    }

    private void mostrarAlerta(String mensaje) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}
