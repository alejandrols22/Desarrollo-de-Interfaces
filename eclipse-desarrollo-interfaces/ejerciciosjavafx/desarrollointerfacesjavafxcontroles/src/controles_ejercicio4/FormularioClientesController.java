package controles_ejercicio4;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class FormularioClientesController {

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
    private CheckBox checkBoxTelevision;

    @FXML
    private CheckBox checkBoxTelefonia;

    @FXML
    private CheckBox checkBoxWifi;

    @FXML
    private Button btnAceptar;

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
    private void handleAceptarAction() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/controles_ejercicio4/Resultado.fxml")); // Asegúrate de que la ruta es correcta
            Parent root = loader.load();

            ResultadoController resultadoController = loader.getController();
            String resultado = recopilarDatos();
            resultadoController.mostrarResultado(resultado);

            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Resultados");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String recopilarDatos() {
        StringBuilder sb = new StringBuilder();
        if (radioButtonParticular.isSelected()) {
            sb.append("Cliente: Particular\n");
        } else if (radioButtonEmpresa.isSelected()) {
            sb.append("Cliente: Empresa\n");
        }

        if (checkBoxTelevision.isSelected()) {
            sb.append("Servicio: Televisión\n");
        }
        if (checkBoxTelefonia.isSelected()) {
            sb.append("Servicio: Telefonia\n");
        }
        if (checkBoxWifi.isSelected()) {
            sb.append("Servicio: Wifi\n");
        }

        sb.append("Forma de Pago: ").append(comboBoxFormaDePago.getValue()).append("\n");
        sb.append("Otros Servicios: ").append(comboBoxOtrosServicios.getValue()).append("\n");

        if (datePickerFechaNacimiento.getValue() != null) {
            String formattedDate = datePickerFechaNacimiento.getValue().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            sb.append("Fecha de Nacimiento: ").append(formattedDate).append("\n");
        }

        Color color = colorPicker.getValue();
        sb.append("Color seleccionado: ").append(toHexString(color)).append("\n");

        return sb.toString();
    }

    private String toHexString(Color color) {
        return String.format("#%02X%02X%02X",
                (int) (color.getRed() * 255),
                (int) (color.getGreen() * 255),
                (int) (color.getBlue() * 255));
    }
    @FXML
    private void openGoogle() {
        // Implementación del método para abrir Google
    }
}


