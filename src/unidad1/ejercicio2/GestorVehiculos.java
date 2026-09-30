package unidad1.ejercicio2;

import java.util.ArrayList;

public class GestorVehiculos {

    private ArrayList<Vehiculo> listaVehiculos;

    public GestorVehiculos() {

        listaVehiculos = new ArrayList<>();
    }

    public void registrarVehiculo(Vehiculo nvoVehiculo) {

        listaVehiculos.add(nvoVehiculo);
        System.out.println("-Vehículo registrado-");
    }

    public Vehiculo buscarVehiculo(String codigo) {
        for (Vehiculo vehiculoBuscado : listaVehiculos) {
            if (vehiculoBuscado.getPatente().equalsIgnoreCase(codigo)) {
                System.out.println("Vehículo patente: " + codigo + "encontrado correctamente");
                return vehiculoBuscado;
            }
        } return null;
    }
}


