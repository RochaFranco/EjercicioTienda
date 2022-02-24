package ejerciciotienda.servicios;
import ejerciciotienda.persistencia.DAOProducto;
import java.sql.SQLException;
import java.util.*;

public class ServicioMenu  {
    
    private final ServicioProducto servicioProducto;
    private final DAOProducto dao;
    
    

    public ServicioMenu(ServicioProducto servicioProducto, DAOProducto dao) {
        this.servicioProducto = servicioProducto;
        this.dao = dao;
        
    }
    
    public void mostrarYEjecutarMenu() throws ClassNotFoundException, SQLException{
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("a) Lista el nombre de todos los productos que hay en la tabla producto.");
        System.out.println("b) Lista los nombres y los precios de todos los productos de la tabla producto.");
        System.out.println("c) Listar aquellos productos que su precio esté entre 120 y 202.");
        System.out.println("d) Buscar y listar todos los Portátiles de la tabla producto.");
        System.out.println("e) Listar el nombre y el precio del producto más barato.");
        System.out.println("f) Ingresar un producto a la base de datos.");
        System.out.println("g) Ingresar un fabricante a la base de datos");
        System.out.println("h) Editar un producto con datos a elección.");
        System.out.print("Ingrese la opcion: ");
        String opcion = scanner.next();
        
        switch(opcion)
        {
            case "a": 
                servicioProducto.mostrarListaDeProductos(dao.obtenerLista());
                break;
                
            case "b": 
                servicioProducto.mostrarListaDeNombreYPrecioDeProductos(dao.obtenerLista());
                break;
                
            case "c":
                servicioProducto.mostrarProductosEntre120y202(dao.obtenerLista());
                break;
                
            case "d":
                servicioProducto.mostrarListaDeProductos(dao.obtenerPortatiles());

                break;
                
            case "e":
                servicioProducto.mostrarListaDeProductos(dao.obtenerProductoMasBarato());
                break;
                
            case "f":
                break;
                
            case "g":
                break;
                
            case "h":
                break;
                
                default: System.out.println("Opcion incorrecta");
                break;
        }
    }
    
    
}
