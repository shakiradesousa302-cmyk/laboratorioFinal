package proyecto;

public class Venta {

    private int idVenta;
    private Cliente cliente;
    private Empleado empleado;
    private DetalleVenta detalle;

    public Venta(int idVenta, Cliente cliente,
                 Empleado empleado, DetalleVenta detalle) {
        this.idVenta = idVenta;
        this.cliente = cliente;
        this.empleado = empleado;
        this.detalle = detalle;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public DetalleVenta getDetalle() {
        return detalle;
    }

    public double calcularTotal() {
        return detalle.calcularSubtotal();
    }

    @Override
    public String toString() {
        return "Venta #" + idVenta +
               "\nCliente: " + cliente.getNombre() +
               "\nEmpleado: " + empleado.getNombre() +
               "\nTotal: $" + calcularTotal();
    }
}