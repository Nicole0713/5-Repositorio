package fundacion;

import java.util.Scanner;

public abstract class Donacion {

    Scanner sc = new Scanner(System.in);

    protected String codigo;
    protected Donante donante;
    protected String motivo;

    public Donacion() {

    }

    public Donacion(String codigo, Donante donante, String motivo) {
        this.codigo = codigo;
        this.donante = donante;
        this.motivo = motivo;
    }

    public Donacion(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public Donante getDonante() {
        return donante;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDonante(Donante donante) {
        this.donante = donante;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;

    }

}
