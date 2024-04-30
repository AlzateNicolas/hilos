import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Supermercado {
    private static Queue<Cliente> colaClientes = new LinkedList<>();
    private static List<Caja> cajas = new ArrayList<>();

    public static void iniciar() {
        // Crear clientes
        for (int i = 0; i < 100; i++) {
            colaClientes.add(new Cliente(i));
        }

        // Crear cajas
        for (int i = 0; i < 10; i++) {
            Caja caja = new Caja(i);
            cajas.add(caja);
            caja.start();
        }

        // Esperar a que todas las cajas terminen
        for (Caja caja : cajas) {
            try {
                caja.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static synchronized Cliente siguienteCliente() {
        return colaClientes.poll();
    }

    public static List<Caja> getCajas() {
        return cajas;
    }
}
