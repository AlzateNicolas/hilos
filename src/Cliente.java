import java.util.HashMap;
import java.util.Map;

public class Cliente {
    private int id;
    private Map<Articulo, Integer> articulos;
    private int tiempoProcesamiento;

    public Cliente(int id) {
        this.id = id;
        this.articulos = new HashMap<>();
        for (Articulo articulo : Articulo.values()) {
            this.articulos.put(articulo, (int) (Math.random() * 10 + 1));
        }
        this.tiempoProcesamiento = this.articulos.values().stream().mapToInt(Integer::intValue).sum();
    }

    public int getTiempoProcesamiento() {
        return tiempoProcesamiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTiempoProcesamiento(int tiempoProcesamiento) {
        this.tiempoProcesamiento = tiempoProcesamiento;
    }

    public Map<Articulo, Integer> getArticulos() {
        return articulos;
    }

    public void setArticulos(Map<Articulo, Integer> articulos) {
        this.articulos = articulos;
    }

    // otros getters y setters
}
