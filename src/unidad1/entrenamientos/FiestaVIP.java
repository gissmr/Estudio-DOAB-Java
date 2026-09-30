package unidad1.entrenamientos;

import java.util.ArrayList;
public class FiestaVIP {
    private ArrayList<String> listaInvitados;
    // Constructor
    public FiestaVIP() {

        listaInvitados = new ArrayList<>();
        // RETO 1: Inicializa la lista de invitados aquí adentro (con la fábrica 'new')
    }

    //Metodo rápido para anotar a alguien en la lista antes de la fiesta

    public void anotarInvitado(String nombre) {
        listaInvitados.add(nombre);
    }
    //La acción del Guardia

    public boolean dejarEntrar(String nombreBuscado) {

        for (String invitadoActual : listaInvitados) {
            if (invitadoActual.equalsIgnoreCase(nombreBuscado)) {
                System.out.println("Nombre encontrado");
                return true;
            }
        } return false;
    }
    // El Escenario (Main)
    public static void main(String[] args) {
        FiestaVIP fiesta = new FiestaVIP();

        fiesta.anotarInvitado("Gisse");
        fiesta.anotarInvitado("Pedro");


        // Probamos al guardia de la puerta
        boolean entraGisse = fiesta.dejarEntrar("Gisse");
        System.out.println("¿Entra Gisse?: " + entraGisse); // Debería salir true
        boolean entraJuan = fiesta.dejarEntrar("Juan");
        System.out.println("¿Entra Juan?: " + entraJuan);   // Debería salir false
    }
}
