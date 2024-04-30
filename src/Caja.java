public class Caja extends Thread {
    private int id;
    private int clientesAtendidos;
    private int totalVentas;

    public Caja(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        Cliente cliente;
        while ((cliente = Supermercado.siguienteCliente()) != null) {
            this.clientesAtendidos++;
            this.totalVentas += cliente.getTiempoProcesamiento();
            try {
                Thread.sleep(cliente.getTiempoProcesamiento() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public int getIdCaja() {
        return id;
    }

    public int getClientesAtendidos() {
        return clientesAtendidos;
    }

    public int getTotalVentas() {
        return totalVentas;
    }
}
