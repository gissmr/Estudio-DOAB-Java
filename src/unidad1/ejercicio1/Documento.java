package unidad1.ejercicio1;

public class Documento extends Envio {

    private boolean urgente;

    public Documento() {
    }

    public Documento(String numeroRastreo, int distancia, double pesoBase, boolean urgente) {
        super(numeroRastreo, distancia, pesoBase);
        this.urgente = urgente;
    }

    public boolean isUrgente() {
        return urgente;
    }

    public void setUrgente(boolean urgente) {
        this.urgente = urgente;
    }

    @Override
    public double calcularCosto() {

        double costoBase = 1000;
        double costoExtra = this.getDistancia() * 10;
        costoBase = costoBase + costoExtra;
        double cargoFijo = 1500;

        if (urgente) {
            costoBase = costoBase + cargoFijo;
        }
        return costoBase;
    }
}