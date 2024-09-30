package ar.edu.davinci;

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Producto 1", 10.0);
        Producto producto2 = new Producto("Producto 2", 15.0);
        Producto producto3 = new Producto("Producto 3", 20.0);
        Producto producto4 = new Producto("Producto 4", 5.0);

        Caja caja1 = new Caja("Caja 1");
        caja1.agregarElemento(producto1);
        caja1.agregarElemento(producto2);

        Caja caja2 = new Caja("Caja 2");
        caja2.agregarElemento(producto3);
        caja2.agregarElemento(producto4);

        Caja cajaGrande = new Caja("Caja Grande");
        cajaGrande.agregarElemento(caja1);
        cajaGrande.agregarElemento(caja2);

        Pedido pedido = new Pedido();
        pedido.agregarElemento(cajaGrande);

        System.out.println("Precio total del pedido: $" + pedido.getPrecioTotal());

        Producto producto5 = new Producto("Producto 5", 30.0);

        Caja caja3 = new Caja("Caja 3");
        caja3.agregarElemento(producto5);
        pedido.agregarElemento(caja3);

        System.out.println("Nuevo precio total del pedido: $" + pedido.getPrecioTotal());

        Pedido pedidoProductos = new Pedido();
        pedidoProductos.agregarElemento(producto1);
        pedidoProductos.agregarElemento(producto2);
        pedidoProductos.agregarElemento(producto3);

        System.out.println("Precio total del pedido de productos: $" + pedidoProductos.getPrecioTotal());
    }
}
