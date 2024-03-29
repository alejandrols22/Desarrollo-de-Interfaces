package accesodatos_ejercicio3_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TVideoJuegoModel {
    private Connection conn;

    public TVideoJuegoModel(String dbURL, String dbUser, String dbPassword) throws SQLException {
        this.conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
    }

    public void addVideoJuego(accesodatos_ejercicio1.TVideoJuego nuevoJuego) throws SQLException {
        String query = "INSERT INTO tvideojuegos (nombre, anio, compania, precio, sinopsis, plataforma) VALUES (?, ?, ?, ?, ?, ?)";
        
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, nuevoJuego.getNombre());
            stmt.setInt(2, nuevoJuego.getAnio());
            stmt.setString(3, nuevoJuego.getCompania());
            stmt.setDouble(4, nuevoJuego.getPrecio());
            stmt.setString(5, nuevoJuego.getSinopsis());
            stmt.setString(6, nuevoJuego.getPlataforma());

            stmt.executeUpdate();
        }
    }
    
    public void borrarVideoJuegoPorNombre(String nombre) throws SQLException {
        String sql = "DELETE FROM tvideojuegos WHERE nombre = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nombre);
            int affectedRows = stmt.executeUpdate();
            
            if (affectedRows == 0) {
                throw new SQLException("No se pudo borrar el juego con nombre: " + nombre);
            }
        }
    }

    public void close() throws SQLException {
        if (this.conn != null) {
            this.conn.close();
        }
    }
}










