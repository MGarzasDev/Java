/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author JoséManuelRuizGarcía
 */
public class Biblioteca {

    private static Libro[] libros;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scNum = new Scanner(System.in);
        libros = new Libro[0];

        //Caso 2:
        anadirLibro();

    }

    private static void anadirLibro() {

        Scanner sc = new Scanner(System.in);
        Scanner scNum = new Scanner(System.in);
        //1. Pido datos
        System.out.println("Introduce ISBN:");
        String isbn = sc.nextLine();
        //Comprobar que ese isbn no existía ya
        System.out.println("Introduce título:");
        String titulo = sc.nextLine();
        System.out.println("Introduce numero ejemplares:");
        int ejemplares = scNum.nextInt();
        System.out.println("Nombre:");
        String nombre = sc.nextLine();
        System.out.println("Apellidos:");
        String apellidos = sc.nextLine();
        System.out.println("Dia:");
        int dia = scNum.nextInt();
        System.out.println("Mes:");
        int mes = scNum.nextInt();
        System.out.println("Año:");
        int ano = scNum.nextInt();

        LocalDate ld = LocalDate.of(ano, mes, dia);
        //2. Construyo objeto
        Libro libro = new Libro(isbn, titulo, nombre, apellidos, ld, ejemplares);
        //3. Redimensiono array
        redimensionarArrayLibros();
        //4. Meto el libro en el array
        libros[libros.length - 1] = libro;
    }

    private static void redimensionarArrayLibros() {
        //1.Creo auxiliar con un hueco más
        Libro[] librosAux = new Libro[libros.length + 1];
        //2.Copio contenidos
        for (int i = 0; i < libros.length; i++) {
            librosAux[i] = libros[i];
        }
        //3. Asgino libros al auxiliar
        libros = librosAux;
    }
    
    private static String prestarLibro(){
        Scanner sc = new Scanner(System.in);
        Scanner scNum = new Scanner(System.in);
        //1. Pido datos
        System.out.println("Introduce ISBN:");
        String isbn = sc.nextLine();
        int index = -1;
        for (int i = 0; i < libros.length; i++) {
            if (libros[i].getIsbn().equals(isbn)){
                index = i;
            }
        }
        if (index >= 0){
            int quedan = libros[index].prestar();
            return "Quedan " + quedan + " libros";
        }else{
            return "no lo he encontrado.";
        }
        
    }

}
