package ejercicio_1;

public class ProductoInformatico implements Producto{

    private String marca;
    private String nombre;
    private float precio;
    private float peso;

    public ProductoInformatico(String marca, String nombre, float precio, float peso) {
        this.marca = marca;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
    }

    @Override
    public float sumarPrecioA(float total) {
        return total + precio;
    }

    @Override
    public float sumarPesoA(float total) {
        return total + peso;
    }
}
