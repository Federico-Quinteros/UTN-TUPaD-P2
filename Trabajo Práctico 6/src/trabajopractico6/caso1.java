/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico6;

public class caso1 {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        Producto p1 = new Producto("P001", "Arroz 1kg", 1200.0, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Smartphone XYZ", 25000.0, 10, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Camiseta Algodón", 3500.0, 100, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Licuadora Pro", 8000.0, 15, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Galletitas Choco", 800.0, 200, CategoriaProducto.ALIMENTOS);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        inventario.listarProductos();

        System.out.println("\n Buscando producto con ID 'P003':");
        Producto buscado = inventario.buscarProductoPorId("P003");
        if (buscado != null) {
            buscado.mostrarInfo();
        } else {
            System.out.println(" No encontrado.");
        }

        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);

        System.out.println("\n️ Eliminando producto con ID 'P005':");
        inventario.eliminarProducto("P005");
        System.out.println("️ Productos restantes:");
        inventario.listarProductos();

        inventario.actualizarStock("P001", 75);

        System.out.println("\n Total de stock disponible: " + inventario.obtenerTotalStock());

        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        System.out.println("\n Producto con mayor stock:");
        if (mayorStock != null) {
            mayorStock.mostrarInfo();
        } else {
            System.out.println(" Inventario vacío.");
        }

        inventario.filtrarProductosPorPrecio(1000.0, 3000.0);
        inventario.mostrarCategoriasDisponibles();
    }
}