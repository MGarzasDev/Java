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
import java.util.ArrayList;
import java.util.List;

/**
 * La clase LibroDAO proporciona los métodos CRUD para interactuar con la tabla de libros
 * en la base de datos. Se conecta a la base de datos MySQL a través de JDBC.
 * 
 * @author mdela
 */

public class LibroDAO {
    
    /**
     * Constantes de conexión a la base de datos
     */

    private static final String CONNECTION_URL = "jdbc:mysql://localhost:3306/TrivialJDBC?useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    
    /**
     * Crea una nueva entrada de libro en la base de datos.
     * 
     * @param libro el libro a agregar.
     * @return el número de filas afectadas, o -1 si falla la operación.
     */
    
    public int create(Libro libro) {
        String sql = "INSERT INTO Libros (ISBN, titulo, id_autoria, ejemplares, prestados) VALUES (?, ?, ?, ?, ?)";
        AutoriaDAO autoriaDAO = new AutoriaDAO();
        int idAutoria = autoriaDAO.create(libro.getAutoria());

        if (idAutoria == -1) {
            return -1;
        }

        try (Connection connection = DriverManager.getConnection(CONNECTION_URL, USER, PASSWORD);
             PreparedStatement pstmt = connection.prepareStatement(sql)) {

            pstmt.setString(1, libro.getISBN());
            pstmt.setString(2, libro.getTitulo());
            pstmt.setInt(3, idAutoria);
            pstmt.setInt(4, libro.getEjemplares());
            pstmt.setInt(5, libro.getPrestados());

            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }
    
     /**
     * Lee una entrada de libro de la base de datos.
     * 
     * @param isbn el isbn del libro a leer.
     * @return el libro leído, o null si no se encuentra.
     */

    public Libro read(String isbn) {
        Libro libro = null;
        String sql = "SELECT * FROM Libros WHERE ISBN=?";
        AutoriaDAO autoriaDAO = new AutoriaDAO();

        try (Connection connection = DriverManager.getConnection(CONNECTION_URL, USER, PASSWORD);
             PreparedStatement pstmt = connection.prepareStatement(sql)) {

            pstmt.setString(1, isbn);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    String titulo = rs.getString("titulo");
                    int idAutoria = rs.getInt("id_autoria");
                    int ejemplares = rs.getInt("ejemplares");
                    int prestados = rs.getInt("prestados");

                    Autoria autoria = autoriaDAO.read(idAutoria);
                    if (autoria != null) {
                        libro = new Libro(isbn, titulo, autoria, ejemplares, prestados);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return libro;
    }
    
     /**
     * Actualiza una entrada de libro en la base de datos.
     * 
     * @param libro el libro con la información actualizada.
     * @return el número de filas afectadas, o -1 si falla la operación.
     */

    public int update(Libro libro) {
        String sql = "UPDATE Libros SET titulo=?, id_autoria=?, ejemplares=?, prestados=? WHERE ISBN=?";
        AutoriaDAO autoriaDAO = new AutoriaDAO();
        int idAutoria = autoriaDAO.create(libro.getAutoria());

        if (idAutoria == -1) {
            return -1;
        }

        try (Connection connection = DriverManager.getConnection(CONNECTION_URL, USER, PASSWORD);
             PreparedStatement pstmt = connection.prepareStatement(sql)) {

            pstmt.setString(1, libro.getTitulo());
            pstmt.setInt(2, idAutoria);
            pstmt.setInt(3, libro.getEjemplares());
            pstmt.setInt(4, libro.getPrestados());
            pstmt.setString(5, libro.getISBN());

            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }
    
     /**
     * Elimina una entrada de libro de la base de datos.
     * 
     * @param isbn el isbn del libro a eliminar.
     * @return el número de filas afectadas, o -1 si falla la operación.
     */

        public int delete(String isbn) {
        String sql = "DELETE FROM Libros WHERE ISBN=?";

        try (Connection connection = DriverManager.getConnection(CONNECTION_URL, USER, PASSWORD);
             PreparedStatement pstmt = connection.prepareStatement(sql)) {

            pstmt.setString(1, isbn);
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }
        
     /**
     * Encuentra todas las entradas de libro en la base de datos.
     * 
     * @return una lista de todos los libros, o una lista vacía si no hay libros.
     */
        
        public List<Libro> findAll() {
        List<Libro> libros = new ArrayList<>();
        String sql = "SELECT * FROM Libros";
        AutoriaDAO autoriaDAO = new AutoriaDAO();

        try (Connection connection = DriverManager.getConnection(CONNECTION_URL, USER, PASSWORD);
             PreparedStatement pstmt = connection.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                String isbn = rs.getString("ISBN");
                String titulo = rs.getString("titulo");
                int idAutoria = rs.getInt("id_autoria");
                int ejemplares = rs.getInt("ejemplares");
                int prestados = rs.getInt("prestados");

                Autoria autoria = autoriaDAO.read(idAutoria);
                if (autoria != null) {
                    libros.add(new Libro(isbn, titulo, autoria, ejemplares, prestados));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return libros;
    }
        
     /**
     * Busca libros por título en la base de datos.
     * 
     * @param keywords las palabras clave para buscar en los títulos.
     * @return una lista de libros que coinciden, o una lista vacía si no hay coincidencias.
     */
        
         public List<Libro> searchByTitle(String keywords) {
        List<Libro> libros = new ArrayList<>();
        String sql = "SELECT * FROM Libros WHERE titulo LIKE ?";
        AutoriaDAO autoriaDAO = new AutoriaDAO();

        try (Connection connection = DriverManager.getConnection(CONNECTION_URL, USER, PASSWORD);
             PreparedStatement pstmt = connection.prepareStatement(sql)) {

            pstmt.setString(1, "%" + keywords + "%");

            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    String isbn = rs.getString("ISBN");
                    String titulo = rs.getString("titulo");
                    int idAutoria = rs.getInt("id_autoria");
                    int ejemplares = rs.getInt("ejemplares");
                    int prestados = rs.getInt("prestados");

                    Autoria autoria = autoriaDAO.read(idAutoria);
                    if (autoria != null) {
                        libros.add(new Libro(isbn, titulo, autoria, ejemplares, prestados));
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return libros;
    }
         
     /**
     * Busca libros por autor en la base de datos.
     * 
     * @param keywords las palabras clave para buscar en los nombres y apellidos de los autores.
     * @return una lista de libros que coinciden, o una lista vacía si no hay coincidencias.
     */
         
         public List<Libro> searchByAuthor(String keywords) {
        List<Libro> libros = new ArrayList<>();
        String sql = "SELECT * FROM Libros INNER JOIN Autorias ON Libros.id_autoria = Autorias.id WHERE Autorias.nombre LIKE ? OR Autorias.apellido LIKE ?";
        AutoriaDAO autoriaDAO = new AutoriaDAO();

        try (Connection connection = DriverManager.getConnection(CONNECTION_URL, USER, PASSWORD);
             PreparedStatement pstmt = connection.prepareStatement(sql)) {

            pstmt.setString(1, "%" + keywords + "%");
            pstmt.setString(2, "%" + keywords + "%");

            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    String isbn = rs.getString("ISBN");
                    String titulo = rs.getString("titulo");
                    int idAutoria = rs.getInt("id_autoria");
                    int ejemplares = rs.getInt("ejemplares");
                    int prestados = rs.getInt("prestados");

                    Autoria autoria = autoriaDAO.read(idAutoria);
                    if (autoria != null) {
                        libros.add(new Libro(isbn, titulo, autoria, ejemplares, prestados));
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return libros;
    }
}

