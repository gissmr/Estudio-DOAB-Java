package unidad1.ejercicio2;

public abstract class Vehiculo {

    protected String patente;
    protected int diasArriendo;
    protected double precioBase;




    public Vehiculo() {
    }

    public Vehiculo(String patente, int diasArriendo, double precioBase) {
        //this.patente = patente;
        this.setPatente(patente);
        //this.diasArriendo = diasArriendo;
        this.setDiasArriendo(diasArriendo);
        //this.precioBase = precioBase;
        this.setPrecioBase(precioBase);
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {

        if (patente == null || patente.length() < 6 ) {
            throw new IllegalArgumentException("La patente debe tener un mínimo de 6 carácteres");
        }
        this.patente = patente;
    }

    public int getDiasArriendo() {
        return diasArriendo;
    }

    public void setDiasArriendo(int diasArriendo) {

        if (diasArriendo < 1 || diasArriendo > 30) {
            throw new IllegalArgumentException("Los días deben ser entre 1 a 30");
        }
        this.diasArriendo = diasArriendo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {

        if (precioBase <= 0) {
            throw new IllegalArgumentException("EL precio debe ser mayor a 0");
        }  this.precioBase = precioBase;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "patente='" + patente + '\'' +
                ", diasArriendo=" + diasArriendo +
                '}';
    }

    public abstract double calcularCosto();
}
