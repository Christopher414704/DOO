package Cafe;

public class Agua implements Ingredientes{
    int cantidad;

    @Override
    public String obtenerNombre() {
        return "Agua";
    }

    @Override
    public int obtenerCantidad() {
        return cantidad;
    }
}
