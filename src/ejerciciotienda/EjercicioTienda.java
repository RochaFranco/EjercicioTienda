package ejerciciotienda;

import ejerciciotienda.entidades.Producto;
import ejerciciotienda.servicios.ServicioProducto;

public class EjercicioTienda {

    public static void main(String[] args) {
        ServicioProducto servicio = new ServicioProducto();
        
        Producto producto = servicio.crearProducto();
        
        servicio.mostrarProducto(producto);
        
    }
    
    
    
}
    

