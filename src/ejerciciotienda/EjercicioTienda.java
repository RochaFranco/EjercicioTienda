package ejerciciotienda;

import ejerciciotienda.entidades.Producto;

public class EjercicioTienda {

    public static void main(String[] args) {
        
        Producto producto = new Producto(0,"Manopla",420,69);
        
        mostrarProducto(producto);
  
    }
    
    public static void mostrarProducto(Producto producto)
    {
        System.out.println("el codigo del producto es: " + producto.getCodigo());
        System.out.println("el nombre del producto es: " + producto.getNombre());
        System.out.println("el precio del producto es: " + producto.getPrecio());
        System.out.println("el codigo de fabricante es: " + producto.getCodigoFabricante());
        
    }
    
}
    

