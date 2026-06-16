

public class DetalleVenta {

    private Producto producto;
    private int cantidad;

    public DetalleVenta(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public DetalleVenta(int i, int j, Producto p1) {
		// TODO Auto-generated constructor stub
	}

	public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double calcularSubtotal() {
        return producto.getPrecioVenta() * cantidad;
    }

    @Override
    public String toString() {
        return producto.getNombre() + " x" + cantidad +
               " = $" + calcularSubtotal();
    }
}