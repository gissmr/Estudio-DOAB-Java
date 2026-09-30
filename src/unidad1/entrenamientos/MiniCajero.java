package unidad1.entrenamientos;

public class MiniCajero {

    public void retirarDinero(int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("Monto inválido");
        }

        System.out.println("Bip bop... Aquí tienes tus " + cantidad + " pesos.");
    }


    public static void main(String[] args) {
        MiniCajero cajero = new MiniCajero();

        try {
            cajero.retirarDinero(-5000);

        } catch (IllegalArgumentException error) {
            System.out.println("Alerta: Intentaste sacar plata negativa");
        } catch (NullPointerException error2) {
            System.out.println("Error, debes ingresar un valor");
        }
    }
}