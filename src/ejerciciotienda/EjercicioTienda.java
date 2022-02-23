package ejerciciotienda;

import ejerciciotienda.entidades.Producto;
import ejerciciotienda.servicios.ServicioProducto;
import java.util.ArrayList;
import java.util.List;

public class EjercicioTienda {

    public static void main(String[] args) {
        ServicioProducto servicio = new ServicioProducto();
        
       // Producto producto = servicio.crearProducto();
         Producto producto1 = new Producto(01, "Mesa", 35000, 01);
        Producto producto2 = new Producto(02, "silla", 25000, 01);
        
        List<Producto>Productos = new ArrayList<>();
        
        Productos.add(producto1);
        Productos.add(producto2);
        
        servicio.mostrarListaDeProductos(Productos);
        
    }
    
    
    
}
    

