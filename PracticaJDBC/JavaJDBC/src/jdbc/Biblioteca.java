/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbc;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Miguel De La Torre Garzás
 */
public class Biblioteca {

    public static Libro[] libros;

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         libros = new Libro [10];

        // Se mostrará el menú y se realizarán operaciones hasta que el usuario eliga salir
        int opcion = 1000000;
        while (opcion > 0) {
            mostrarMenu();
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    verLibros();
                    break;
                case 2:
                    crearLibro();
                    break;
                case 3:
                    prestarLibro();
                    break;
                case 4:
                    devolverLibro();
                    break;
                case 0:
                    System.out.println("\n¡Nos vemos!");
                   
                    break;
                default:
                    System.out.println("\nLa opción seleccionada no existe, vuelve a intentarlo");
                    break;
            }
        }

       
    }

    public static void mostrarMenu() {
        System.out.println("\n--- Menú de la biblioteca ---");
        System.out.println("1. Ver libros");
        System.out.println("2. Crear un libro");
        System.out.println("3. Prestar un libro");
        System.out.println("4. Devolver un libro");
        System.out.println("0. Salir");
        System.out.print("\nElige una opción: ");
    }

    public static void verLibros() {
        System.out.println("\n--- Libros ---");
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null) {
                System.out.println(libros[i]);
            }
        }
    }

    public static void crearLibro() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- Crear libro ---");
        System.out.print("Introduce el ISBN: ");
        String isbn = sc.nextLine();

        // Comprobar que el ISBN no esté en uso
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null && libros[i].getISBN().equals(isbn)) {
                System.out.println("El ISBN ya está en uso");
                return;
            }
        }

        System.out.print("Introduce el título: ");
        String titulo = sc.nextLine();
        System.out.print("Introduce el número de ejemplares: ");
        int ejemplares = sc.nextInt();
        sc.nextLine(); // Consume salto de línea
        System.out.print("Introduce el nombre del autor: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce los apellidos del autor: ");
        String apellidos = sc.nextLine();
        System.out.println("Introduce la fecha de nacimiento del autor (aaaa-mm-dd):");
        LocalDate fechaNacimiento = LocalDate.parse(sc.nextLine());
        Autoria autoria = new Autoria(nombre, apellidos, fechaNacimiento);

        // Añadir libro al array
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] == null) {
                libros[i] = new Libro(isbn, titulo, autoria, ejemplares, 0);
                break;
            }
        }
    }

    public static void prestarLibro() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- Prestar libro ---");
        System.out.print("Introduce el ISBN del libro a prestar: ");
        String isbn = sc.nextLine();

        // buscar libro con el ISBN introducido
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null && libros[i].getISBN().equals(isbn)) {
                boolean disponibles = libros[i].prestar();
                if (disponibles == true) {
                    System.out.println("Quedan " + disponibles + " ejemplares disponibles");
                } else {
                    System.out.println("No quedan libros disponibles para prestar");
                }
                return;
            }
        }

        System.out.println("No se ha encontrado ningún libro con ese ISBN");
    }

    public static void devolverLibro() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- Devolver libro ---");
        System.out.print("Introduce el ISBN del libro a devolver: ");
        String isbn = sc.nextLine();

        // buscar libro con el ISBN introducido
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null && libros[i].getISBN().equals(isbn)) {
                int disponibles = libros[i].devolver();
                if (disponibles >= 0) {
                    System.out.println("Quedan " + disponibles + " ejemplares disponibles");
                } else {
                    System.out.println("No había ningún libro prestado");
                }
                return;
            }
        }

        System.out.println("No se ha encontrado ningún libro con ese ISBN");
    }
}
