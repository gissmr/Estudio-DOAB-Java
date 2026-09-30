package unidad1.entrenamientos;

public class MontanaRusa {

    // El Guardia de la atracción
    public void subirAlJuego(double estatura) {

        if (estatura < 1.40) {
            throw new IllegalArgumentException("No cumples con la estatura");
        }
        System.out.println("¡Sube, abróchate el cinturón y disfruta el viaje!");

        // RETO 1: Escribe el 'if' preguntando si la estatura es menor a 1.40.
        // Si es así, lanza (throw) el IllegalArgumentException diciendo "No cumples la altura".
        }

    // El Escenario (Main)
    public static void main(String[] args) {
        MontanaRusa juego = new MontanaRusa();

        try {
            juego.subirAlJuego(1.20);
        } catch (IllegalArgumentException error) {
            System.out.println("No cumples con la estatura mínima");
        } catch (NullPointerException error2) {
            System.out.println("Debe ingresar su estatura antes de subir");
        }

        // RETO 2: Abre tu bloque 'try', y adentro manda a una persona de 1.20 a intentar subir al juego.
        // RETO 3: Atrapa el error con tu 'catch', y dile al usuario con un System.out.println:
        // "No cumples con la estatura mínima."
    }
}
