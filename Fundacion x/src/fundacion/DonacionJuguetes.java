package fundacion;

public class DonacionJuguetes extends Donacion {

    private String tipo;
    private int cantidad;
    private String juguetes[];

    public DonacionJuguetes() {

    }

    public DonacionJuguetes(String codigo, String tipo, int cantidad) {
        super(codigo);
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String[] getJuguetes() {
        return juguetes;
    }

    public void setJuguetes(String[] juguetes) {
        this.juguetes = juguetes;
    }

}
