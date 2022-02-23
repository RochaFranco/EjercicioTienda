package ejerciciotienda.servicios;

import ejerciciotienda.entidades.Producto;

public class ServicioProducto {
    
    public void mostrarProducto(Producto producto)
    {
        System.out.println("el codigo del producto es: " + producto.getCodigo());
        System.out.println("el nombre del producto es: " + producto.getNombre());
        System.out.println("el precio del producto es: " + producto.getPrecio());
        System.out.println("el codigo de fabricante es: " + producto.getCodigoFabricante());
        
    }
    
}
