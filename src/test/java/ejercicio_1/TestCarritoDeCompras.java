package ejercicio_1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCarritoDeCompras {

    @Test
    public void envioColectivoSur(){
        var cliente = new Cliente("pepe");
        var carrito = new CarritoDeCompras(cliente, new ColectivosSur(), new CapitalFederal());

        carrito.agregarProducto(new ProductoInformatico("HP","Notebook",10000,3));
        carrito.agregarProducto(new ProductoInformatico("Logitech","Mouse",5000,4));

        assertEquals(16500, carrito.calcularPrecio(), 0.01);

    }

    @Test
    public void envioCorreoArgentino() {

        var cliente = new Cliente("pepe");
        var carrito = new CarritoDeCompras(cliente, new CorreoArgentino(new ServicioDestinoFake()), new Interior());

        carrito.agregarProducto(new ProductoInformatico("HP","Notebook",10000,3));
        carrito.agregarProducto(new ProductoInformatico("Logitech","Mouse",5000,4));

        assertEquals(16300, carrito.calcularPrecio(), 0.01);
    }
}
