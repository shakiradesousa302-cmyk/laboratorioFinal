package proyecto;

public class Venta {

    private int idVenta;
    private String cliente;
    private Cliente empleado;
    private Empleado detalle;

    public Venta(int idVenta, String string,
                 Cliente cliente2, Empleado empleado2) {
        this.idVenta = idVenta;
        this.cliente = string;
        this.empleado = cliente2;
        this.detalle = empleado2;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public String getCliente() {
        return cliente;
    }

    public Cliente getEmpleado() {
        return empleado;
    }

    public Empleado getDetalle() {
        return detalle;
    }

    public double calcularTotal() {
        return detalle.calcularSubtotal();
    }

    @Override
    public String toString() {
        return "Venta #" + idVenta +
               "\nCliente: " + cliente.getBytes() +
               "\nEmpleado: " + empleado.getNombre() +
               "\nTotal: $" + calcularTotal();
    }

	public void agregarDetalle(DetalleVenta d1) {
		// TODO Auto-generated method stub
		
	}
}