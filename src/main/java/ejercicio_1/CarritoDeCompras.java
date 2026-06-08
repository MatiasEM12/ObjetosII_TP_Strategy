package ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras {
    private Cliente cliente;
    private List<Producto> productos;
    private TipoEnvio tipoEnvio;

    public CarritoDeCompras(Cliente cliente, TipoEnvio tipoEnvio,Destino destino) {
        this.cliente = cliente;
        this.tipoEnvio = tipoEnvio;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public float calcularPrecio() {
        float total = 0;
        float totalPeso=0;
        for (Producto producto : productos) {
            total += producto.sumarPrecioA(total);
            totalPeso += producto.sumarPesoA(totalPeso);
        }


        return total;

    }
}
