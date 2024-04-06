package Listas;

import java.util.Scanner;

public class Lista {
    public Nodo primero;

    public Lista() {
        primero = null;
    }

    private String leerCadena() {
        System.out.println("Ingrese un caracter, escriba -1 para terminar: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().trim(); // Leer la entrada como cadena y eliminar espacios en blanco
    }

    public Lista crearLista() {
        String entrada;
        primero = null;
        do {
            entrada = leerCadena();
            if (!entrada.equals("-1")) {
                primero = new Nodo(entrada, primero); // Crear un nodo con la cadena como dato
            }
        } while (!entrada.equals("-1"));
        return this;
    }

    public Lista insertarCabezaLista(String entrada) {
        Nodo nuevo = new Nodo(entrada);
        nuevo.enlace = primero;
        primero = nuevo;
        return this;
    }

    public void visualizar() {
        Nodo n = primero;
        int k = 0;
        while (n != null) {
            System.out.print(n.dato + " ");
            n = n.enlace;
            k++;
            if (k % 15 == 0) {
                System.out.println(); // Imprimir nueva línea después de cada 15 elementos
            }
        }
    }
}