package unidad1.ejercicio1;

public class Main {
    public static void main(String[] args) {

        Paquete paq1 = new Paquete("PAQ-1001", 120, 2.5, 6000, true);
        paq1.asegurar();
        Paquete paq2 = new Paquete("PAQ-1002", 45, 1.0, 3000, false);


        Documento doc1 = new Documento("DOC-9001", 800, 0.2, true);
        Documento doc2 = new Documento("DOC-9002", 15, 0.1, false);

        GestorEnvios miGestor = new GestorEnvios();
        miGestor.registrarEnvio(paq1);
        miGestor.registrarEnvio(paq2);
        miGestor.registrarEnvio(doc1);
        miGestor.registrarEnvio(doc2);

        Envio encontrado = miGestor.buscarEnvio("PAQ-1001");
        System.out.println("Envío n°: " + encontrado.getNumeroRastreo() + " encontrado.");

        miGestor.listarEnvios();
    }

}


