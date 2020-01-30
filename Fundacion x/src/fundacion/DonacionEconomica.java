package fundacion;

public class DonacionEconomica extends Donacion {

    private double monto;
    private String divisa;
    private String banco;


    public DonacionEconomica() {

    }

    public DonacionEconomica(double monto, String divisa, String banco, String codigo, Donante donante, String motivo) {
        super(codigo, donante, motivo);
        this.monto = monto;
        this.divisa = divisa;
        this.banco = banco;
    }

    public double getMonto() {
        return monto;
    }

    public String getDivisa() {
        return divisa;
    }

    public String getBanco() {
        return banco;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setDivisa(String divisa) {
        this.divisa = divisa;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

}
