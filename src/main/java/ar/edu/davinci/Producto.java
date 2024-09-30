package ar.edu.davinci;

class Producto extends Elemento {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public double getPrecioTotal() {
        return precio;
    }

    @Override
    public String toString() {
        return nombre + ": $" + precio;
    }
}

