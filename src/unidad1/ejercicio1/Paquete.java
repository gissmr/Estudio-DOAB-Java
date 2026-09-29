package unidad1.ejercicio1;

public class Paquete extends Envio implements Asegurable {

    private int volumen;
    private boolean seguroAlDia, seguroActivo;

    public Paquete() {
    }

    public Paquete(String numeroRastreo, int distancia, double pesoBase, int volumen, boolean seguroAlDia) {
        super(numeroRastreo, distancia, pesoBase);
        //this.volumen = volumen;
        this.setVolumen(volumen);
        //this.seguroAlDia = seguroAlDia;
        this.setSeguroAlDia(seguroAlDia);
        //this.seguroActivo = false;
        this.setSeguroActivo(false);
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public boolean isSeguroAlDia() {
        return seguroAlDia;
    }

    public void setSeguroAlDia(boolean seguroAlDia) {
        this.seguroAlDia = seguroAlDia;
    }

    public boolean isSeguroActivo() {
        return seguroActivo;
    }

    public void setSeguroActivo(boolean seguroActivo) {
        this.seguroActivo = seguroActivo;
    }

    @Override
    public double calcularCosto() {

        double costoBase = 2000;
        double costoExtra = this.getDistancia() * 50;
        costoBase = costoExtra + costoBase;
        if (this.volumen > 5000) {
            costoBase = costoBase * 1.15;
        }
        return costoBase;
    }

    @Override
    public boolean seguroActivado() {
        return seguroActivo;
    }

    @Override
    public void asegurar() {
        seguroActivo = true;

    }
}
