package accesodatos_ejercicio1;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TVideoJuegoModel {
    private String dbURL;
    private String dbUsername;
    private String dbPassword;
    private Connection connection;

    public TVideoJuegoModel(String dbURL, String dbUsername, String dbPassword) {
        this.dbURL = dbURL;
        this.dbUsername = dbUsername;
        this.dbPassword = dbPassword;
    }

    public void connect() throws Exception {
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
        }
    }

    public ObservableList<TVideoJuego> getAllVideoJuegos() throws Exception {
        connect();
        ObservableList<TVideoJuego> videojuegos = FXCollections.observableArrayList();

        String sql = "SELECT * FROM tvideojuegos";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            TVideoJuego videojuego = new TVideoJuego(
                    resultSet.getInt("id"),
                    resultSet.getString("nombre"),
                    resultSet.getInt("anio"),
                    resultSet.getString("compania"),
                    resultSet.getDouble("precio"),
                    resultSet.getString("sinopsis"),
                    resultSet.getString("plataforma")
            );
            videojuegos.add(videojuego);
        }

        return videojuegos;
    }

    public void close() throws Exception {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }
}
