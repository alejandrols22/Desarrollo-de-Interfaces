package controles_ejercicio6;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;

public class MenuController {

    @FXML
    private MenuItem openItem;
    @FXML
    private MenuItem saveItem;
    @FXML
    private MenuItem copyItem;
    @FXML
    private MenuItem pasteItem;
    @FXML
    private MenuItem aboutItem;

    @FXML
    private void handleMenuAction(ActionEvent event) {
        MenuItem sourceMenuItem = (MenuItem) event.getSource();
        System.out.println("Ha pulsado la opción: " + sourceMenuItem.getText());

        // Implementa lógica condicional basada en el MenuItem seleccionado
        switch (sourceMenuItem.getId()) {
            case "openItem":
                // Código para abrir
                break;
            case "saveItem":
                // Código para guardar
                break;
            case "copyItem":
                // Código para copiar
                break;
            case "pasteItem":
                // Código para pegar
                break;
            case "aboutItem":
                // Código para mostrar información sobre la aplicación
                break;
        }
    }
}
