package ar.edu.davinci;

import java.util.ArrayList;
import java.util.List;

class Pedido {
    private List<Elemento> elementos = new ArrayList<>();

    public void agregarElemento(Elemento elemento) {
        elementos.add(elemento);
    }

    public double getPrecioTotal() {
        double total = 0;
        for (Elemento elemento : elementos) {
            total += elemento.getPrecioTotal();
        }
        return total;
    }
}
