module DisenioComponentes {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	
	opens application to javafx.graphics, javafx.fxml;
	opens ejercicio3 to javafx.graphics, javafx.fxml;
	opens ejercicio4 to javafx.graphics, javafx.fxml;
}
