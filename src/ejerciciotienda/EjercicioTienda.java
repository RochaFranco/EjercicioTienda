package ejerciciotienda;

import ejerciciotienda.entidades.Producto;
import ejerciciotienda.persistencia.DAOProducto;
import ejerciciotienda.servicios.ServicioMenu;
import ejerciciotienda.servicios.ServicioProducto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjercicioTienda {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        ServicioProducto servicioProducto = new ServicioProducto();
        DAOProducto dao = new DAOProducto();
        ServicioMenu servicioMenu = new ServicioMenu(servicioProducto,dao);
       
   
        servicioMenu.mostrarYEjecutarMenu();
     
     
        
        
    }
    
    
    
}
    

