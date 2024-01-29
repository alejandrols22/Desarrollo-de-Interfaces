package ejercicio5_css;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.collections.FXCollections;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class Ejercicio5CSSController {

    @FXML
    private ComboBox<String> comboBoxFormaDePago;
    
    @FXML
    private ComboBox<String> comboBoxOtrosServicios;
    
    @FXML
    private RadioButton radioButtonParticular;
    
    @FXML
    private RadioButton radioButtonEmpresa;
    
    @FXML
    private ToggleGroup customerTypeGroup;
    
    @FXML
    private DatePicker datePickerFechaNacimiento;
    
    @FXML
    private ColorPicker colorPicker;
    
    @FXML
    private GridPane gridPane;

    @FXML
    public void initialize() {
        comboBoxFormaDePago.setItems(FXCollections.observableArrayList("Contado", "Transferencia", "Paypal"));
        comboBoxOtrosServicios.setItems(FXCollections.observableArrayList("Opción 1", "Opción 2", "Opción 3"));

        customerTypeGroup = new ToggleGroup();
        radioButtonParticular.setToggleGroup(customerTypeGroup);
        radioButtonEmpresa.setToggleGroup(customerTypeGroup);

        colorPicker.valueProperty().addListener((observable, oldValue, newValue) -> {
            Color color = newValue;
            gridPane.setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)));
        });
    }

    @FXML
    private void openGoogle() {
        // Implementación del método para abrir Google
    }
}

