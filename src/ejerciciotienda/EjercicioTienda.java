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
       
     servicio.mostrarListaDeProductos(productos);
        
        
    }
    
    
    
}
    

