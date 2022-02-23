package ejerciciotienda.servicios;

import ejerciciotienda.entidades.Producto;
import java.util.HashSet;
import java.util.Scanner;

public class ServicioProducto {
    
    public void mostrarProducto(Producto producto)
    {
        System.out.println("el codigo del producto es: " + producto.getCodigo());
        System.out.println("el nombre del producto es: " + producto.getNombre());
        System.out.println("el precio del producto es: " + producto.getPrecio());
        System.out.println("el codigo de fabricante es: " + producto.getCodigoFabricante());
        
    }
    
    public Producto crearProducto()
    {  
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el codigo del producto: ");
        int codigo = scanner.nextInt();
        
        System.out.println("Ingrese el nombre del producto: ");
        String nombre = scanner.next();
        
        System.out.println("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        
        System.out.println("Ingrese el codigo de fabricante: ");
        int codigoFabricante = scanner.nextInt();
        
        Producto producto = new Producto(codigo,nombre,precio,codigoFabricante);
        
        return producto;
    }
    
    public Producto modificarProducto(Producto producto)
    {
        Scanner scanner = new Scanner(System.in);     
        
        System.out.println("Ingrese el nombre del producto: ");
        String nombre = scanner.next();
        
        System.out.println("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
           
        producto.setNombre(nombre);
        producto.setPrecio(precio);

        return producto;
    }
    
}
