package Listas;

public class Nodo {
    Object dato; // Cambiamos el tipo de dato a Object para permitir enteros, caracteres u otros objetos
    Nodo enlace;

    public Nodo(Object x) {
        dato = x;
        enlace = null;
    }

    public Nodo(Object x, Nodo n) {
        dato = x;
        enlace = n;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo n) {
        enlace = n;
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "dato=" + dato +
                ", enlace=" + enlace +
                '}';
    }
}