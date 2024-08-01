package Cafe;

public class Leche implements Ingredientes{
    String tipo;
    int cantidad;

    @Override
    public String obtenerNombre() {
        return tipo;
    }

    @Override
    public int obtenerCantidad() {
        return cantidad;
    }
}
