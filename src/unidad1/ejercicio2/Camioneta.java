package unidad1.ejercicio2;

public class Camioneta extends Vehiculo{

    private int capCarga;

    public Camioneta() {
    }

    public Camioneta(String patente, int diasArriendo, double precioBase, int capCarga) {
        super(patente, diasArriendo, precioBase);
        //this.capCarga = capCarga;
        this.setCapCarga(capCarga);
    }

    public int getCapCarga() {
        return capCarga;
    }

    public void setCapCarga(int capCarga) {
        this.capCarga = capCarga;
    }

    @Override
    public double calcularCosto() {

        double precioDiario = getPrecioBase();
        double costo = precioDiario * getDiasArriendo();
        double costoFinal = costo;
        if (this.capCarga > 1000) {
            costoFinal = costo + 15000;
        }
        return costoFinal;
    }
}
