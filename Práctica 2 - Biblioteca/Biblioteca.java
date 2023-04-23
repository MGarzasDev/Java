/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progdaw2223prac2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author seter
 */
public class Biblioteca {

    private static Libro[] libros;
    private static Revista[] revistas;

    public static void main(String[] args) {
        libros = new Libro[0];
        revistas = new Revista[0];
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        while (opcion != 0) {
            System.out.print("1. Ver libros"
                    + "\n2. Crear un libro"
                    + "\n3. Prestar un libro"
                    + "\n4. Devolver un libro"
                    + "\n5. Ver revistas"
                    + "\n6. Crear una revista"
                    + "\n7. Prestar una revista"
                    + "\n8. Devolver una revista"
                    + "\n0. Salir"
                    + "\nElige una opción: ");
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
                case 5:
                    verRevistas();
                    break;
                case 6:
                    crearRevista();
                    break;
                case 7:
                    prestarRevista();
                    break;
                case 8:
                    devolverRevista();
                    break;
                case 0:
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("La opcion no es válida.");
            }
        }
    }

    private static void verLibros() {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
        System.out.println("-----");
    }

    private static void verRevistas() {
        for (int i = 0; i < revistas.length; i++) {
            System.out.println(revistas[i]);
        }
        System.out.println("-----");
    }

    private static void crearLibro() {
        Scanner sc = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        String isbn = "";
        while (isbn.length() == 0) {
            System.out.print("Introduce el ISBN: ");
            isbn = sc.nextLine();
            if (buscarLibro(isbn) >= 0) {
                System.out.println("El ISBN ya existe, tiene que ser único.");
                isbn = "";
            }
        }
        System.out.print("Introduce el título: ");
        String titulo = sc.nextLine();
        System.out.print("Número de ejemplares: ");
        int ejemplares = scInt.nextInt();
        System.out.print("Nombre de la autoría: ");
        String nombre = sc.nextLine();
        System.out.print("Apellidos de la autoría: ");
        String apellidos = sc.nextLine();
        System.out.print("Fecha de nacimiento: ");
        //TODO: fecha de nacimiento
        System.out.println("");
        anadirLibro(new Libro(isbn, titulo, nombre, apellidos, null, ejemplares));
    }

    private static void anadirLibro(Libro libro) {
        Libro[] librosFin = Arrays.copyOf(libros, libros.length + 1);
        librosFin[librosFin.length - 1] = libro;
        libros = librosFin;
    }

    private static void anadirRevista(Revista revista) {
        Revista[] revistasFin = Arrays.copyOf(revistas, revistas.length + 1);
        revistasFin[revistasFin.length - 1] = revista;
        revistas = revistasFin;
    }

    private static void crearRevista() {
        Scanner sc = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        String issn = "";
        while (issn.length() == 0) {
            System.out.print("Introduce el ISSN: ");
            issn = sc.nextLine();
            if (buscarRevista(issn) >= 0) {
                System.out.println("El ISSN ya existe, tiene que ser único.");
                issn = "";
            }
        }
        System.out.print("Introduce el título: ");
        String titulo = sc.nextLine();
        System.out.print("Nombre de la autoría: ");
        String nombre = sc.nextLine();
        System.out.print("Apellidos de la autoría: ");
        String apellidos = sc.nextLine();
        System.out.print("Fecha de nacimiento: ");
        //TODO: fecha de nacimiento
        System.out.println("");
        anadirRevista(new Revista(issn, titulo, nombre, apellidos, null));
    }

    private static void prestarLibro() {
        int index = leerISBN();
        int ejemplares = libros[index].prestar();
        if (ejemplares < 0) {
            System.out.println("No hay ejemplares disponibles para hacer el préstamo");
        } else {
            System.out.println("Préstamo realizado. Quedan " + ejemplares + " ejemplares"
                    + "\n---------");
        }
    }

    private static void prestarRevista() {
        int index = leerISSN();
        int prestados = revistas[index].prestar();
        System.out.println("Se ha prestado la revista. Hay " + prestados + " prestadas.");
    }

    private static void devolverLibro() {
        int index = leerISBN();
        int ejemplares = libros[index].devolver();
        if (ejemplares < 0) {
            System.out.println("No había ningún libro prestado");
        } else {
            System.out.println("Ejemplar devuelto. Quedan " + ejemplares + " ejemplares.");
        }
    }

    private static void devolverRevista() {
        int index = leerISSN();
        int ejemplares = revistas[index].devolver();
        if (ejemplares < 0) {
            System.out.println("No había ninguna revista prestada");
        } else {
            System.out.println("Ejemplar devuelto. Quedan " + ejemplares + " ejemplares.");
        }
    }

    private static int buscarLibro(String isbn) {
        for (int i = 0; i < libros.length; i++) {
            if (libros[i].getIsbn().equals(isbn)) {
                return i;
            }
        }
        return -1;
    }

    private static int buscarRevista(String issn) {
        for (int i = 0; i < revistas.length; i++) {
            if (revistas[i].getIssn().equals(issn)) {
                return i;
            }
        }
        return -1;
    }

    private static int leerISBN() {
        Scanner sc = new Scanner(System.in);
        int index = -1;
        while (index == -1) {
            System.out.print("ISBN del libro: ");
            String isbn = sc.nextLine();
            if ((index = buscarLibro(isbn)) == -1) {
                System.out.println("El ISBN no existe.");
            }
        }
        return index;
    }

    private static int leerISSN() {
        Scanner sc = new Scanner(System.in);
        int index = -1;
        while (index == -1) {
            System.out.print("ISSN de la revista: ");
            String issn = sc.nextLine();
            if ((index = buscarRevista(issn)) == -1) {
                System.out.println("El ISSN no existe.");
            }
        }
        return index;
    }

}
