package controlesavanzado_ejercicio2;


import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ControladorVideojuegos {
    @FXML
    private TextField txtNombre;
    
    @FXML
    private TextField txtPrecio;
    
    @FXML
    private ChoiceBox<String> choiceConsola;
    
    @FXML
    private ChoiceBox<String> choicePEGI;
    
    @FXML
    private TableView<?> tablaVideojuegos;

    @FXML
    private void handleAgregar() {
        
    }
}
