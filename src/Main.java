public class Main {
    public static void main(String[] args) {
        Supermercado.iniciar();

        // Imprimir resultados
        for (Caja caja : Supermercado.getCajas()) {
            System.out.println("Caja " + caja.getIdCaja() + ": Clientes atendidos = " + caja.getClientesAtendidos() + ", Total ventas = " + caja.getTotalVentas());
        }
    }
}
