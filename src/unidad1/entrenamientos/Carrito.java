package unidad1.entrenamientos;

import java.util.ArrayList;

public class Carrito {

    //Reservamos el espacio para el carrito

    private ArrayList<String> listaProductos;

    //El Constructor (Cuando el cliente entra al súper y saca un carro vacío)
    public Carrito() {

        listaProductos = new ArrayList<>();
        // RETO 1: Construye la lista aquí adentro (llama a la fábrica con la palabra 'new')
    }

    //Metodo rápido para echar cosas al carro

    public void agregarProducto(String productoNuevo) {
        listaProductos.add(productoNuevo);
    }

    // Metodo para leer la boleta en la caja
    public void mostrarBoleta() {
        System.out.println("--- TU BOLETA ---");

        for (String productoBuscado : listaProductos) {
            System.out.println("-" + productoBuscado);
        }

        // RETO 2: Escribe el ciclo 'for' especial para revisar cada
        // producto (vamos a apodarlo 'p') que esté adentro de tu lista 'productos'.


        // RETO 3: Adentro de las llaves de tu for, imprime la variable 'p'
    }

    // El Escenario (Main)
    public static void main(String[] args) {
        Carrito miCarro = new Carrito();

        // Echamos 3 cosas al carro
        miCarro.agregarProducto("Leche");
        miCarro.agregarProducto("Pan");
        miCarro.agregarProducto("Huevos");

        // Imprimimos la boleta
        miCarro.mostrarBoleta();
    }
}