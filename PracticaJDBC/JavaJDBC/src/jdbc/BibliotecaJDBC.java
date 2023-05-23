/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbc;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

/**
 * La clase BibliotecaJDBC se encarga de interactuar con el usuario a través de una interfaz de consola.
 * Esta clase utiliza las clases AutoriaDAO y LibroDAO para interactuar con la base de datos.
 *
 * @author mdela
 */
public class BibliotecaJDBC {
    
     /**
     * Método principal que gestiona la interacción con el usuario a través del menú de la biblioteca.
     * @param args argumentos de la línea de comandos
     */
    
    public static void main(String[] args) {
         // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        LibroDAO libroDAO = new LibroDAO();
        AutoriaDAO autoriaDAO = new AutoriaDAO();

        int opcion;
        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine(); // Consume el salto de línea

            switch (opcion) {
                case 1:
                    verLibros(libroDAO);
                    break;
                case 2:
                    crearLibro(sc, libroDAO, autoriaDAO);
                    break;
                case 3:
                    prestarLibro(libroDAO);
                    break;
                case 4:
                    devolverLibro(sc,libroDAO);
                    break;
                case 5:
                    buscarLibrosPorTitulo(sc, libroDAO);
                    break;
                case 6:
                    buscarLibrosPorAutoria(sc, libroDAO);
                    break;
                case 7:
                    eliminarLibro(sc, libroDAO, autoriaDAO);
                    break;
                case 0:
                    System.out.println("\n¡Nos vemos!");
                    break;
                default:
                    System.out.println("\nLa opción seleccionada no existe, vuelve a intentarlo");
                    break;
            }
        } while (opcion != 0);

        sc.close();
    }
    
    /**
     * Imprime el menú de la biblioteca en la consola.
     */

    public static void mostrarMenu() {
        System.out.println("\n--- Menú de la biblioteca ---");
        System.out.println("1. Ver libros");
        System.out.println("2. Crear un libro");
        System.out.println("3. Prestar un libro");
        System.out.println("4. Devolver un libro");
        System.out.println("5. Buscar libros por título");
        System.out.println("6. Buscar libros por autoría");
        System.out.println("7. Eliminar un libro");
        System.out.println("0. Salir");
        System.out.print("\nElige una opción: ");
    }

    /**
     * Muestra todos los libros disponibles en la biblioteca.
     * @param libroDAO objeto para interactuar con la base de datos de libros
     */

    
    public static void verLibros(LibroDAO libroDAO) {
    List<Libro> libros = libroDAO.findAll();

    if (libros.isEmpty()) {
        System.out.println("\nNo hay libros en la biblioteca.");
    } else {
        System.out.println("\nLibros en la biblioteca:");
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}
    
     /**
     * Crea un nuevo libro en la biblioteca.
     * @param sc objeto Scanner para leer la entrada del usuario
     * @param libroDAO objeto para interactuar con la base de datos de libros
     * @param autoriaDAO objeto para interactuar con la base de datos de autorías
     */

public static void crearLibro(Scanner sc, LibroDAO libroDAO, AutoriaDAO autoriaDAO) {
    System.out.print("\nISBN: ");
    String isbn = sc.nextLine();

    if (libroDAO.read(isbn) != null) {
        System.out.println("Ya existe un libro con ese ISBN.");
        return;
    }

    System.out.print("Título: ");
    String titulo = sc.nextLine();

    System.out.print("Número de ejemplares: ");
    int numEjemplares = sc.nextInt();
    sc.nextLine(); // Consume el salto de línea

    System.out.print("Nombre del autor: ");
    String nombreAutor = sc.nextLine();

    System.out.print("Apellidos del autor: ");
    String apellidosAutor = sc.nextLine();

    System.out.print("Año de nacimiento del autor: ");
    int anio = sc.nextInt();

    System.out.print("Mes de nacimiento del autor: ");
    int mes = sc.nextInt();

    System.out.print("Día de nacimiento del autor: ");
    int dia = sc.nextInt();
    sc.nextLine(); // Consume el salto de línea

    LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
    Autoria autor = new Autoria(nombreAutor, apellidosAutor, fechaNacimiento);
    int autorId = autoriaDAO.create(autor);

    if (autorId != -1) {
        autor.setId(autorId);
        Libro libro = new Libro(isbn, titulo, autor, numEjemplares, 0);
        int filasAfectadas = libroDAO.create(libro);
        if (filasAfectadas != -1) {
            System.out.println("Libro creado con éxito.");
        } else {
            System.out.println("Error al crear el libro.");
        }
    } else {
        System.out.println("Error al crear la autoría.");
    }
}

     /**
     * Realiza el préstamo de un libro en la biblioteca.
     * @param libroDAO objeto para interactuar con la base de datos de libros
     */

public static void prestarLibro(LibroDAO libroDAO) {
    Scanner sc = new Scanner(System.in);

    System.out.println("\n--- Prestar libro ---");
    System.out.print("Introduce el ISBN del libro a prestar: ");
    String isbn = sc.nextLine();

    // buscar libro con el ISBN introducido en la base de datos
    Libro libro = libroDAO.read(isbn);
    if (libro != null) {
        boolean prestarResult = libro.prestar(); // intenta prestar el libro
        if (prestarResult) {
            libroDAO.update(libro); // actualiza los datos del libro en la base de datos
            System.out.println("Se ha prestado el libro. Quedan " + (libro.getEjemplares() - libro.getPrestados()) + " ejemplares disponibles.");
        } else {
            System.out.println("No quedan libros disponibles para prestar");
        }
    } else {
        System.out.println("No se ha encontrado ningún libro con ese ISBN");
    }
}

     /**
     * Devuelve un libro a la biblioteca.
     * @param sc objeto Scanner para leer la entrada del usuario
     * @param libroDAO objeto para interactuar con la base de datos de libros
     */

public static void devolverLibro(Scanner sc, LibroDAO libroDAO) {
    System.out.print("\nIntroduzca el ISBN del libro a devolver: ");
    String isbn = sc.nextLine();

    Libro libro = libroDAO.read(isbn);
    if (libro != null) {
        libro.devolver();
        libroDAO.update(libro);
               System.out.println("Libro devuelto con éxito. Ejemplares disponibles: " + libro.getEjemplares());
    } else {
        System.out.println("No se encontró el libro con el ISBN proporcionado.");
    }
}

     /**
     * Busca libros por título en la biblioteca.
     * @param sc objeto Scanner para leer la entrada del usuario
     * @param libroDAO objeto para interactuar con la base de datos de libros
     */

public static void buscarLibrosPorTitulo(Scanner sc, LibroDAO libroDAO) {
    System.out.print("\nIntroduzca palabras clave para buscar por título: ");
    String keywords = sc.nextLine();

    List<Libro> libros = libroDAO.searchByTitle(keywords);
    if (libros.isEmpty()) {
        System.out.println("No se encontraron libros con esas palabras clave en el título.");
    } else {
        System.out.println("Libros encontrados:");
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}

     /**
     * Busca libros por autor en la biblioteca.
     * @param sc objeto Scanner para leer la entrada del usuario
     * @param libroDAO objeto para interactuar con la base de datos de libros
     */

public static void buscarLibrosPorAutoria(Scanner sc, LibroDAO libroDAO) {
    System.out.print("\nIntroduzca palabras clave para buscar por autoría: ");
    String keywords = sc.nextLine();

    List<Libro> libros = libroDAO.searchByAuthor(keywords);
    if (libros.isEmpty()) {
        System.out.println("No se encontraron libros con esas palabras clave en la autoría.");
    } else {
        System.out.println("Libros encontrados:");
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}

     /**
     * Elimina un libro de la biblioteca.
     * @param sc objeto Scanner para leer la entrada del usuario
     * @param libroDAO objeto para interactuar con la base de datos de libros
     * @param autoriaDAO objeto para interactuar con la base de datos de autorías
     */
public static void eliminarLibro(Scanner sc, LibroDAO libroDAO, AutoriaDAO autoriaDAO) {
    System.out.print("\nIntroduzca el ISBN del libro a eliminar: ");
    String isbn = sc.nextLine();

      Libro libro = libroDAO.read(isbn);
    if (libro != null) {
        int filasAfectadas = libroDAO.delete(isbn);
        if (filasAfectadas > 0) {
            int autorId = libro.getAutoria().getId();
            autoriaDAO.delete(autorId);
            System.out.println("Libro y su autoría eliminados con éxito.");
        } else {
            System.out.println("Error al eliminar el libro.");
        }
    } else {
        System.out.println("No se encontró el libro con el ISBN proporcionado.");
    }
}



}

