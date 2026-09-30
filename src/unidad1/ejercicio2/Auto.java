package unidad1.ejercicio2;

public class Auto extends Vehiculo implements Mantenible{

    private int cantPasajeros;
    private boolean revisionAlDia, mantencionVehiculo;

    public Auto() {
    }

    public Auto(String patente, int diasArriendo, double precioBase, int cantPasajeros, boolean revisionAlDia, boolean mantencionVehiculo) {
        super(patente, diasArriendo, precioBase);
        //this.cantPasajeros = cantPasajeros;
        this.setCantPasajeros(cantPasajeros);
        //this.revisionAlDia = true;
        this.setRevisionAlDia(true);
        //this.mantencionVehiculo = false;
        this.setMantencionVehiculo(false);
    }

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }

    public boolean isRevisionAlDia() {
        return revisionAlDia;
    }

    public void setRevisionAlDia(boolean revisionAlDia) {
        this.revisionAlDia = revisionAlDia;
    }

    public boolean isMantencionVehiculo() {
        return mantencionVehiculo;
    }

    public void setMantencionVehiculo(boolean mantencionVehiculo) {
        this.mantencionVehiculo = mantencionVehiculo;
    }

    @Override
    public double calcularCosto() {

        double precioDiario = getPrecioBase();
        double costo = precioDiario * getDiasArriendo();
        double costoFinal = costo;
        if (this.cantPasajeros > 4) {
            costoFinal = costo * 1.15;
        }
        return costoFinal;
    }

    @Override
    public boolean mantAlDia() {
        return revisionAlDia;
    }

    @Override
    public void activarMantencion() {
        mantencionVehiculo = true;
    }
}
