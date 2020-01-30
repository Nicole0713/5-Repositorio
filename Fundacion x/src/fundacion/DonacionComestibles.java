package fundacion;

public class DonacionComestibles extends Donacion {

    private String tipodeComestible;
    private boolean enlatado;

    public DonacionComestibles() {

    }

    public DonacionComestibles(String codigo,Donante donante, String motivo, String tipo,boolean enlatado ) {
        super(codigo, donante, motivo);
        this.tipodeComestible = tipo;
        this.enlatado = enlatado;
    }

    public String getTipodeComestible() {
        return this.tipodeComestible;
    }

    public boolean getenlatado() {
        return this.enlatado;
    }

    public void setTipodeComestible(String tipo) {
        this.tipodeComestible = tipo;
    }

    public void setEnlatado(boolean enlatado) {
        this.enlatado = enlatado;
    }

}
