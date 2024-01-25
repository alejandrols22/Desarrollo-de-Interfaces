package controles_ejercicio5;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.io.IOException;

public class FormularioController {

	@FXML
	private TextField textFieldNombre;
	@FXML
	private DatePicker datePickerFecha;
	@FXML
	private RadioButton radioButtonOpcion1;
	@FXML
	private RadioButton radioButtonOpcion2;
	@FXML
	private CheckBox checkBoxA;
	@FXML
	private CheckBox checkBoxB;
	@FXML
	private ComboBox<String> comboBoxOpciones;
	@FXML
	private TextArea textAreaComentarios;

	@FXML
	private void handleEnviarAction() {
		if (validarFormulario()) {
			try {
				FXMLLoader loader = new FXMLLoader(getClass().getResource("Resultado.fxml"));
				Parent root = loader.load();

				ResultadoController resultadoController = loader.getController();
				String resultado = recopilarDatos();
				resultadoController.mostrarResultado(resultado);

				Stage stage = new Stage();
				stage.setScene(new Scene(root));
				stage.setTitle("Resultado");
				stage.show();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			
		}
	}

	private boolean validarFormulario() {
		
		return true; 
	}

	private String recopilarDatos() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nombre: ").append(textFieldNombre.getText()).append("\n");
		sb.append("Fecha: ").append(datePickerFecha.getValue() != null ? datePickerFecha.getValue().toString() : "")
				.append("\n");
		sb.append("Opción Seleccionada: ").append(
				radioButtonOpcion1.isSelected() ? "Opción 1" : radioButtonOpcion2.isSelected() ? "Opción 2" : "Ninguna")
				.append("\n");
		sb.append("CheckBox A: ").append(checkBoxA.isSelected() ? "Sí" : "No").append("\n");
		sb.append("CheckBox B: ").append(checkBoxB.isSelected() ? "Sí" : "No").append("\n");
		sb.append("ComboBox Opción: ").append(comboBoxOpciones.getValue()).append("\n");
		sb.append("Comentarios: ").append(textAreaComentarios.getText()).append("\n");

		return sb.toString();
	}

	@FXML
	public void initialize() {
		comboBoxOpciones.setItems(FXCollections.observableArrayList("Opción A", "Opción B", "Opción C"));
	}
}