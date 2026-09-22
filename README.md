# Tree-Stock: Sistema de Gestión de Inventario con Árboles Binarios de Búsqueda (ABB)

**Estudiante :** Fernando Jaramillo López  
**Tarea: ** Manipulación de Árboles en Java  
**Tecnologías / Entorno:** Java JDK 17 (Eclipse Temurin), VS Code / Geany, Git/GitHub en Puppy Linux.

---

## 📌 Descripción del Proyecto

**Tree-Stock** es una aplicación de consola desarrollada en Java que utiliza la estructura de datos de un **Árbol Binario de Búsqueda (ABB)** para gestionar un inventario de productos de forma eficiente. El sistema garantiza el almacenamiento ordenado por clave (`ID`) utilizando referencias y punteros explícitos a nodos hijos (izquierdo y derecho).

---

## 🏗️ Arquitectura del Sistema

El proyecto está dividido estrictamente en **tres clases principales**:

1. **`Producto.java` (Nodo):**
   * Representa cada elemento del árbol.
   * Atributos: `id` (int), `nombre` (String).
   * Punteros: `izquierdo` (referencia a subárbol izquierdo) y `derecho` (referencia a subárbol derecho).

2. **`ArbolInventario.java` (Lógica del Árbol):**
   * Contiene la referencia a la `raiz`.
   * **Inserción Recursiva:** Coloca nodos menores a la izquierda y mayores a la derecha.
   * **Recorrido Inorden:** Muestra los productos de forma ascendente (de menor a mayor por ID).
   * **Búsqueda Recursiva:** Localiza un producto de forma eficiente mediante su ID ($O(\log n)$ en árboles balanceados).

3. **`Main.java` (Interfaz de Consola):**
   * Proporciona un menú interactivo implementado con `switch-case`.
   * Opciones: Registrar producto, Mostrar inventario ordenado, Buscar producto por ID y Salir.

---

## 🚀 Instrucciones de Ejecución

1. Clonar el repositorio localmente:
   ```bash
   git clone [https://github.com/jaramillolopez/Tree-Stock.git](https://github.com/jaramillolopez/Tree-Stock.git)
   cd Tree-Stock

   ## 📸 Evidencias de Funcionamiento
   

1. **Registro de Productos:**  
   ![Registro de Productos](CAPTURAS/REGISTRARPRODUCTO.png)

2. **Mostrar Inventario (Inorden):**  
   ![Recorrido Inorden](CAPTURAS/MOSTRARINVENTARIO.png)

3. **Búsqueda de Productos:**  
   ![Búsqueda de Productos](CAPTURAS/BUSCARPRODUCTO.png)