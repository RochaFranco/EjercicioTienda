package ejerciciotienda;

import ejerciciotienda.entidades.Producto;
import ejerciciotienda.persistencia.DAOProducto;
import ejerciciotienda.servicios.ServicioProducto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EjercicioTienda {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        ServicioProducto servicio = new ServicioProducto();
       DAOProducto dao = new DAOProducto();
       
       List<Producto> productos = dao.obtenerLista();
       
        System.out.println("a) Lista el nombre de todos los productos que hay en la tabla producto.");
        System.out.println("b) Lista los nombres y los precios de todos los productos de la tabla producto.");
        System.out.println("c) Listar aquellos productos que su precio esté entre 120 y 202.");
        System.out.println("d) Buscar y listar todos los Portátiles de la tabla producto.");
        System.out.println("e) Listar el nombre y el precio del producto más barato.");
        System.out.println("f) Ingresar un producto a la base de datos.");
        System.out.println("g) Ingresar un fabricante a la base de datos");
        System.out.println("h) Editar un producto con datos a elección.");
     
     
        
        
    }
    
    
    
}
    

