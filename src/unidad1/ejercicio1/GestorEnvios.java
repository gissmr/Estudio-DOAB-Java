package unidad1.ejercicio1;

import java.util.ArrayList;

public class GestorEnvios {

    private ArrayList<Envio> listaEnvios;

    public GestorEnvios() {
        listaEnvios = new ArrayList<>();
    }

    public void registrarEnvio(Envio nuevoEnvio) {

        listaEnvios.add(nuevoEnvio);
        System.out.println("Envío agregado correctamente.");
    }

    public Envio buscarEnvio(String codigo) {

        for (Envio envioBuscado : listaEnvios) {
            if (envioBuscado.getNumeroRastreo().equalsIgnoreCase(codigo)) {
                return envioBuscado;
            }
        }
        return null;
    }
}
