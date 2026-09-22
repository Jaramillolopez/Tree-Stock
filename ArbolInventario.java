public class ArbolInventario {
    private Producto raiz;

    public ArbolInventario() {
        this.raiz = null;
    }

    public void insertar(int id, String nombre) {
        raiz = insertarRecursivo(raiz, id, nombre);
    }

    private Producto insertarRecursivo(Producto actual, int id, String nombre) {
        if (actual == null) {
            return new Producto(id, nombre);
        }

        if (id < actual.id) {
            actual.izquierdo = insertarRecursivo(actual.izquierdo, id, nombre);
        } else if (id > actual.id) {
            actual.derecho = insertarRecursivo(actual.derecho, id, nombre);
        } else {
            System.out.println("⚠️ El producto con ID " + id + " ya existe.");
        }

        return actual;
    }

    public void mostrarInorden() {
        if (raiz == null) {
            System.out.println("📦 El inventario está vacío.");
        } else {
            System.out.println("\n--- LISTADO DE INVENTARIO (ORDENADO POR ID) ---");
            inordenRecursivo(raiz);
            System.out.println("----------------------------------------------");
        }
    }

    private void inordenRecursivo(Producto actual) {
        if (actual != null) {
            inordenRecursivo(actual.izquierdo);
            System.out.println("ID: " + actual.id + " | Nombre: " + actual.nombre);
            inordenRecursivo(actual.derecho);
        }
    }

    public boolean buscar(int id) {
        return buscarRecursivo(raiz, id);
    }

    private boolean buscarRecursivo(Producto actual, int id) {
        if (actual == null) {
            return false;
        }

        if (id == actual.id) {
            System.out.println("✅ Producto Encontrado -> ID: " + actual.id + " | Nombre: " + actual.nombre);
            return true;
        }

        if (id < actual.id) {
            return buscarRecursivo(actual.izquierdo, id);
        } else {
            return buscarRecursivo(actual.derecho, id);
        }
    }
}