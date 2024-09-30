package ar.edu.davinci;

import java.util.ArrayList;
import java.util.List;

class Caja extends Elemento {
    private List<Elemento> elementos = new ArrayList<>();
    private String nombre;

    public Caja(String nombre) {
        this.nombre = nombre;
    }

    public void agregarElemento(Elemento elemento) {
        elementos.add(elemento);
    }

    @Override
    public double getPrecioTotal() {
        double total = 0;
        for (Elemento elemento : elementos) {
            total += elemento.getPrecioTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        return nombre + " contiene: " + elementos.size() + " elementos.";
    }
}
