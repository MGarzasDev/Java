/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

/**
 * La clase AutoriaDAO proporciona los métodos CRUD para interactuar con la base de datos.
 * Se conecta a la base de datos MySQL a través de JDBC.
 * @author mdela
 */

public class AutoriaDAO {
    
     /**
     * Constantes de conexión a la base de datos
     */

    private static final String CONNECTION_URL = "jdbc:mysql://localhost:3306/TrivialJDBC?useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "";

     /**
     * Crea una nueva entrada de autoría en la base de datos.
     * 
     * @param autoria  la autoría a agregar.
     * @return el id de la autoría creada, o -1 si falla la operación.
     */
    
    public int create(Autoria autoria) {
        String sql = "INSERT INTO Autorias (nombre, apellido, fechaNacimiento) VALUES (?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(CONNECTION_URL, USER, PASSWORD);
             PreparedStatement pstmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            pstmt.setString(1, autoria.getNombre());
            pstmt.setString(2, autoria.getApellido());
            pstmt.setDate(3, java.sql.Date.valueOf(autoria.getFechaNacimiento()));

            int affectedRows = pstmt.executeUpdate();

            if (affectedRows > 0) {
                try (ResultSet rs = pstmt.getGeneratedKeys()) {
                    if (rs.next()) {
                        return rs.getInt(1);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }
    
      /**
     * Lee una entrada de autoría de la base de datos.
     * 
     * @param id el id de la autoría a leer.
     * @return la autoría leída, o null si no se encuentra.
     */

    public Autoria read(int id) {
        Autoria autoria = null;
        String sql = "SELECT * FROM Autorias WHERE id=?";

        try (Connection connection = DriverManager.getConnection(CONNECTION_URL, USER, PASSWORD);
             PreparedStatement pstmt = connection.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    String nombre = rs.getString("nombre");
                    String apellido = rs.getString("apellido");
                    LocalDate fechaNacimiento = rs.getDate("fechaNacimiento").toLocalDate();
                    autoria = new Autoria(nombre, apellido, fechaNacimiento);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return autoria;
    }
    
     /**
     * Actualiza una entrada de autoría en la base de datos.
     * 
     * @param autoria la autoría con la información actualizada.
     * @param id el id de la autoría a actualizar.
     * @return el número de filas afectadas, o -1 si falla la operación.
     */

    public int update(Autoria autoria, int id) {
        String sql = "UPDATE Autorias SET nombre=?, apellido=?, fechaNacimiento=? WHERE id=?";

        try (Connection connection = DriverManager.getConnection(CONNECTION_URL, USER, PASSWORD);
             PreparedStatement pstmt = connection.prepareStatement(sql)) {

            pstmt.setString(1, autoria.getNombre());
            pstmt.setString(2, autoria.getApellido());
            pstmt.setDate(3, java.sql.Date.valueOf(autoria.getFechaNacimiento()));
            pstmt.setInt(4, id);

            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

    /**
     * Elimina una entrada de autoría de la base de datos.
     * 
     * @param id el id de la autoría a eliminar.
     * @return el número de filas afectadas, o -1 si falla la operación.
     */
    
    public int delete(int id) {
        String sql = "DELETE FROM Autorias WHERE id=?";

        try (Connection connection = DriverManager.getConnection(CONNECTION_URL, USER, PASSWORD);
             PreparedStatement pstmt = connection.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }
}
