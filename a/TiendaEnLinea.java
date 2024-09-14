import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TiendaEnLinea {
    public static void main(String[] args) {
        List<Articulos> articulos = new ArrayList<>();
        List<Pujas> pujas = new ArrayList<>();
        List<Postor> postores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        Articulos articulo1 = new Articulos("Laptop", "Una laptop potente", "Nuevo", 500, 600);
        Articulos articulo2 = new Articulos("Teléfono", "Último modelo", "Nuevo", 200, 250);
        articulos.add(articulo1);
        articulos.add(articulo2);

        // Agregar pujas
        Pujas puja1 = new Pujas(500, "Puja1", 1, 500, "2024-09-30", 0, "");
        Pujas puja2 = new Pujas(200, "Puja2", 2, 200, "2024-09-30", 0, "");
        pujas.add(puja1);
        pujas.add(puja2);

        // Agregar postores
        Postor postor1 = new Postor("Juan", "Pérez", "Calle Falsa 123", 1, "juan@example.com", puja1, 0, "");
        Postor postor2 = new Postor("Ana", "García", "Avenida Siempre Viva 456", 2, "ana@example.com", puja2, 0, "");
        postores.add(postor1);
        postores.add(postor2);

        // Mostrar artículos y pujas
        mostrarArticulos(articulos);
        mostrarPujas(pujas);
        mostrarPostores(postores);

        // Realizar una puja
        System.out.println("\nRealizar una puja:");
        System.out.print("Ingrese el registro de la puja: ");
        String registroPuja = scanner.nextLine();
        System.out.print("Ingrese el monto de la puja: ");
        int monto = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Ingrese el nombre del postor: ");
        String nombrePostor = scanner.nextLine();

        realizarPuja(pujas, postores, registroPuja, monto, nombrePostor);

        // Mostrar pujas después de la puja
        mostrarPujas(pujas);

        scanner.close();
    }

    public static void mostrarArticulos(List<Articulos> articulos) {
        System.out.println("Artículos disponibles:");
        for (Articulos articulo : articulos) {
            System.out.println("Nombre: " + articulo.getNombre() +
                    ", Descripción: " + articulo.getDescripcion() +
                    ", Estado: " + articulo.getEstado() +
                    ", Precio Inicial: " + articulo.getPrecioInicial() +
                    ", Precio Final: " + articulo.getPrecioFinal());
        }
    }

    public static void mostrarPujas(List<Pujas> pujas) {
        System.out.println("Pujas registradas:");
        for (Pujas puja : pujas) {
            System.out.println("Registro: " + puja.getRegistro() +
                    ", Precio Mayor: " + puja.getPrecioMayor() +
                    ", Id Postor: " + puja.getIdPostor() +
                    ", Precio Venta: " + puja.getPrecioVenta() +
                    ", Fecha Limite: " + puja.getFechaLimite() +
                    ", Precio Final Mayor: " + puja.getPrecioFinalMayor() +
                    ", Usuario Ganador: " + puja.getUsuarioGanador());
        }
    }

    public static void mostrarPostores(List<Postor> postores) {
        System.out.println("Postores registrados:");
        for (Postor postor : postores) {
            System.out.println("Nombre: " + postor.getNombre() +
                    ", Apellido: " + postor.getApellido() +
                    ", Dinero Pujado: " + postor.getDineroPujado() +
                    ", Objeto Ganado: " + postor.getObjetoGanado());
        }
    }

    public static void realizarPuja(List<Pujas> pujas, List<Postor> postores, String registroPuja, int monto,
            String nombrePostor) {
        for (Pujas puja : pujas) {
            if (puja.getRegistro().equals(registroPuja) && monto > puja.getPrecioFinalMayor()) {
                puja.setPrecioFinalMayor(monto);
                puja.setUsuarioGanador(nombrePostor);

                for (Postor postor : postores) {
                    if (postor.getNombre().equals(nombrePostor)) {
                        postor.setDineroPujado(monto);
                        postor.setObjetoGanado(puja.getRegistro());
                        break;
                    }
                }

                System.out.println("Puja realizada exitosamente por " + nombrePostor);
                return;
            }
        }
        System.out.println("Puja fallida. Revisa el registro o monto.");
    }
}