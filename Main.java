

public class Main {

    public static void main(String[] args) {

        System.out.println("Iniciando el proceso de venta...");

        Cliente cliente = new Cliente(1, "Carlos Mendoza", "7788-9900");
        Empleado empleado = new Empleado(101, "Ana Gómez", "Cajera");
        Categoria categoria = new Categoria(5, "Electrónicos");

        Producto p1 = new Producto(201, "Mouse Gamer", 15.0, 25.0, categoria);
        Producto p2 = new Producto(202, "Teclado Mecánico", 30.0, 55.0, categoria);

        Venta nuevaVenta = new Venta(5001, "15/06/2026", cliente, empleado);

        DetalleVenta d1 = new DetalleVenta(1, 2, p1);
        DetalleVenta d2 = new DetalleVenta(2, 1, p2);

        nuevaVenta.agregarDetalle(d1);
        nuevaVenta.agregarDetalle(d2);

        System.out.println("====== COMPROBANTE GENERADO ======");
        System.out.println(nuevaVenta);
        System.out.println("==================================");
    }
}