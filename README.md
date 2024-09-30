# Cajas y Productos

Imagina que tienes dos tipos de objetos: **Productos** y **Cajas**. Una Caja puede contener varios Productos, así como cierto número de Cajas más pequeñas. Estas Cajas pequeñas también pueden contener algunos Productos o incluso Cajas más pequeñas, y así sucesivamente.

Digamos que decides crear un sistema de pedidos que utiliza estas clases. Los pedidos pueden contener productos sencillos sin envolver, así como cajas llenas de productos y otras cajas. ¿Cómo determinarás el precio total de ese pedido?

Modela el escenario propuesto para poder resolver `getPrecioTotal()`, identificando los roles dentro del patrón.

## Roles dentro del Patrón Composite

1. **Componente (Elemento)**:
   - **Clase**: `Elemento`
   - **Descripción**: Clase abstracta que define la interfaz común. Contiene el método `getPrecioTotal()` que deben implementar las subclases.

2. **Hoja (Producto)**:
   - **Clase**: `Producto`
   - **Descripción**: Representa objetos individuales sin hijos. Implementa `getPrecioTotal()` devolviendo el precio del producto.

3. **Compuesto (Caja)**:
   - **Clase**: `Caja`
   - **Descripción**: Puede contener otros objetos (productos o cajas). Implementa `getPrecioTotal()` sumando el precio de todos los elementos que contiene.

4. **Cliente (Pedido)**:
   - **Clase**: `Pedido`
   - **Descripción**: Interactúa con los componentes, agregando productos y cajas, y calcula el precio total del pedido usando el método `getPrecioTotal()`.
