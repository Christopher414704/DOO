package Cafe;

public class OtrosIngredientes implements Ingredientes{
        String nombre;
        int cantidad;


    @Override
    public String obtenerNombre() {
        return nombre;
    }

    @Override
    public int obtenerCantidad() {
        return cantidad;
    }
}
