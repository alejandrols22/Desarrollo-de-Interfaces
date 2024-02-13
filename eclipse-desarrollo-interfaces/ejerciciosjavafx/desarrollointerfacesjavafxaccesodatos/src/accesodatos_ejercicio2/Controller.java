package accesodatos_ejercicio2;


import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller {

	@FXML
    private TableView<Producto> tableViewProductos;
    @FXML
    private TableColumn<Producto, Integer> idColumn; 
    @FXML
    private TableColumn<Producto, String> nombreColumn;
    @FXML
    private TableColumn<Producto, Double> precioColumn;
    @FXML
    private TableColumn<Producto, Integer> codigoFabricanteColumn;

    public void initialize() {
        idColumn.setCellValueFactory(new PropertyValueFactory<>("codigo")); // Configura la columna ID
        nombreColumn.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        precioColumn.setCellValueFactory(new PropertyValueFactory<>("precio"));
        codigoFabricanteColumn.setCellValueFactory(new PropertyValueFactory<>("codigoFabricante"));

        cargarProductos();
    }

    private void cargarProductos() {
        try {
            ProductoModel model = new ProductoModel();
            tableViewProductos.setItems(model.getAllProductos());
        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }
}
