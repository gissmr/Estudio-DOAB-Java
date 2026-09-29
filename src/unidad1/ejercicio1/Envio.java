package unidad1.ejercicio1;

public abstract class Envio {

    protected String numeroRastreo;
    protected int distancia;
    protected double pesoBase;

    public Envio() {
    }

    public Envio(String numeroRastreo, int distancia, double pesoBase) {
        //this.numeroRastreo = numeroRastreo;
        this.setNumeroRastreo(numeroRastreo);
        //this.distancia = distancia;
        this.setDistancia(distancia);
        //this.pesoBase = pesoBase;
        this.setPesoBase(pesoBase);
    }

    public String getNumeroRastreo() {
        return numeroRastreo;
    }

    public void setNumeroRastreo(String numeroRastreo) {

        if (numeroRastreo == null || numeroRastreo.length() < 5) {
            throw new IllegalArgumentException("El número de rastreo debe tener al menos 5 carácteres.");
        }
        this.numeroRastreo = numeroRastreo;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {

        if (distancia < 1 || distancia > 5000) {
            throw new IllegalArgumentException("La distancia debe estar entre 1 y 5000.");
        }
        this.distancia = distancia;
    }

    public double getPesoBase() {
        return pesoBase;
    }

    public void setPesoBase(double pesoBase) {

        if (pesoBase < 0) {
            throw new IllegalArgumentException("El peso debe ser mayor a 0.")
        }
        this.pesoBase = pesoBase;
    }

    @Override
    public String toString() {
        return "Envio{" +
                "numeroRastreo='" + numeroRastreo + '\'' +
                ", distancia=" + distancia +
                '}';
    }

    public abstract double calcularCosto();
}
