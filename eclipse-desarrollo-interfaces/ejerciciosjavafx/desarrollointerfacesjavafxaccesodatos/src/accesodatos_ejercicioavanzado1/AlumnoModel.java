package accesodatos_ejercicioavanzado1;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.sql.*;
import java.time.LocalDate;

public class AlumnoModel {
    private String dbURL = "jdbc:mysql://localhost:33006/instituto";
    private String dbUsername = "root";
    private String dbPassword = "1234";

    private Connection connect() throws Exception {
        return DriverManager.getConnection(dbURL, dbUsername, dbPassword);
    }

    public ObservableList<Alumno> getAllAlumnos() throws Exception {
        ObservableList<Alumno> alumnos = FXCollections.observableArrayList();
        String sql = "SELECT id, nombre, apellido1, apellido2, fecha_nacimiento, es_repetidor, telefono FROM alumno";
        try (Connection conn = connect(); Statement statement = conn.createStatement(); ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                String apellido1 = resultSet.getString("apellido1");
                String apellido2 = resultSet.getString("apellido2");
                LocalDate fechaNacimiento = resultSet.getDate("fecha_nacimiento").toLocalDate();
                String esRepetidor = resultSet.getString("es_repetidor");
                String telefono;
                try {
                    telefono = resultSet.getString("telefono");
                } catch (SQLException e) {
                    telefono = ""; // Puedes poner aquí cualquier valor predeterminado o dejarlo vacío.
                }
                
                Alumno alumno = new Alumno(id, nombre, apellido1, apellido2, fechaNacimiento, esRepetidor, telefono);
                alumnos.add(alumno);
            }
        }
        return alumnos;
    }

}

