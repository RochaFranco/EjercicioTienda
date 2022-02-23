package ejerciciotienda;

import ejerciciotienda.entidades.Producto;
import ejerciciotienda.servicios.ServicioProducto;

public class EjercicioTienda {

    public static void main(String[] args) {
        
        Producto producto = new Producto(0,"Manopla",420,69);
        
        ServicioProducto servicio = new ServicioProducto();
  
        servicio.mostrarProducto(producto);
    }
    
    
    
}
    

