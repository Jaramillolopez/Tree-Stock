import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArbolInventario inventario = new ArbolInventario();
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        System.out.println("==========================================");
        System.out.println("   SISTEMA DE INVENTARIO \"TREE-STOCK\"   ");
        System.out.println("==========================================");

        do {
            System.out.println("\n--- MENÚ DE OPCIONES ---");
            System.out.println("1. Registrar Producto");
            System.out.println("2. Mostrar Inventario (Inorden)");
            System.out.println("3. Buscar Producto por ID");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el ID del producto (entero): ");
                        int id = Integer.parseInt(scanner.nextLine());
                        System.out.print("Ingrese el nombre del producto: ");
                        String nombre = scanner.nextLine();
                        inventario.insertar(id, nombre);
                        System.out.println("✔️ Producto registrado correctamente.");
                        break;

                    case 2:
                        inventario.mostrarInorden();
                        break;

                    case 3:
                        System.out.print("Ingrese el ID del producto a buscar: ");
                        int idBuscar = Integer.parseInt(scanner.nextLine());
                        boolean encontrado = inventario.buscar(idBuscar);
                        if (!encontrado) {
                            System.out.println("❌ El producto con ID " + idBuscar + " no existe.");
                        }
                        break;

                    case 0:
                        System.out.println("Saliendo del sistema Tree-Stock. ¡Hasta luego!");
                        break;

                    default:
                        System.out.println("⚠️ Opción no válida. Intente nuevamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Error: Debe ingresar un valor numérico válido.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}