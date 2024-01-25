package controles_ejercicio7;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;

public class MenuAvanzadoController {

    // Añade FXML annotations para los nuevos items
    @FXML
    private MenuItem newItem;
    @FXML
    private MenuItem printItem;
    @FXML
    private MenuItem propertiesItem;
    @FXML
    private MenuItem undoItem;
    @FXML
    private MenuItem redoItem;
    @FXML
    private MenuItem zoomInItem;
    @FXML
    private MenuItem zoomOutItem;
    @FXML
    private MenuItem toggleFullscreenItem;

    // Actualiza el método handleMenuAction
    @FXML
    private void handleMenuAction(ActionEvent event) {
        MenuItem sourceMenuItem = (MenuItem) event.getSource();
        String category = getCategory(sourceMenuItem);
        System.out.println("Categoría: " + category + ", Opción seleccionada: " + sourceMenuItem.getText());

        // Puedes añadir lógica adicional basada en el MenuItem seleccionado
        // ...
    }

    private String getCategory(MenuItem item) {
        String category = "";
        // Añadir lógica para determinar la categoría basada en el id del MenuItem
        if (item.getId().endsWith("Item")) { // Simple ejemplo de cómo podrías determinarlo
            category = item.getId().substring(0, item.getId().indexOf("Item"));
        }
        return category;
    }
}

