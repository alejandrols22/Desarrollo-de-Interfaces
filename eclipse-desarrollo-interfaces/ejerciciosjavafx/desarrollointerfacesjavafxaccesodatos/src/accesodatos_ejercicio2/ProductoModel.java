package accesodatos_ejercicio2;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProductoModel {
    private String dbURL = "jdbc:mysql://localhost:33006/tienda";
    private String dbUsername = "root";
    private String dbPassword = "1234";

    private Connection connect() throws Exception {
        return DriverManager.getConnection(dbURL, dbUsername, dbPassword);
    }

    public ObservableList<Producto> getAllProductos() throws Exception {
        try (Connection conn = connect()) {
            ObservableList<Producto> productos = FXCollections.observableArrayList();
            String sql = "SELECT * FROM producto";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                productos.add(new Producto(
                    resultSet.getInt("codigo"),
                    resultSet.getString("nombre"),
                    resultSet.getDouble("precio"),
                    resultSet.getInt("codigo_fabricante")
                ));
            }

            return productos;
        }
    }
}
