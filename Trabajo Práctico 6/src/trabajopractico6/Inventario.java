/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
        System.out.println("✅ Producto agregado: " + p.getNombre());
    }

    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("⚠️ El inventario está vacío.");
            return;
        }
        System.out.println("\n--- LISTA DE PRODUCTOS ---");
        productos.forEach(Producto::mostrarInfo);
    }

    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public void eliminarProducto(String id) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            productos.remove(p);
            System.out.println("🗑️ Producto eliminado: " + p.getNombre());
        } else {
            System.out.println("❌ Producto con ID '" + id + "' no encontrado.");
        }
    }

    public void actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            System.out.println("🔄 Stock actualizado para '" + p.getNombre() + "': " + nuevaCantidad);
        } else {
            System.out.println("❌ Producto con ID '" + id + "' no encontrado.");
        }
    }

    public void filtrarPorCategoria(CategoriaProducto categoria) {
        System.out.println("\n--- PRODUCTOS EN CATEGORÍA: " + categoria.name() + " ---");
        boolean encontrado = false;
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                p.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("⚠️ No hay productos en la categoría " + categoria.name());
        }
    }

    public int obtenerTotalStock() {
        return productos.stream().mapToInt(Producto::getCantidad).sum();
    }

    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) return null;
        return Collections.max(productos, Comparator.comparingInt(Producto::getCantidad));
    }

    public void filtrarProductosPorPrecio(double min, double max) {
        System.out.printf("%n--- PRODUCTOS CON PRECIO ENTRE $%.2f y $%.2f ---%n", min, max);
        boolean encontrado = false;
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                p.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("⚠️ No hay productos en ese rango de precio.");
        }
    }

    public void mostrarCategoriasDisponibles() {
        System.out.println("\n--- CATEGORÍAS DISPONIBLES ---");
        for (CategoriaProducto cat : CategoriaProducto.values()) {
            System.out.println(cat.name() + ": " + cat.getDescripcion());
        }
    }
}