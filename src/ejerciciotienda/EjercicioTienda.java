package ejerciciotienda;

import ejerciciotienda.entidades.Producto;
import ejerciciotienda.servicios.ServicioProducto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EjercicioTienda {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        ServicioProducto servicio = new ServicioProducto();
     
        Connection connection = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/tienda?useSSL=false";
            connection = DriverManager.getConnection(url, "root", "root");   
            System.out.println("Ingrese");
        }
        catch (SQLException ex)
        {
            connection = null;
            ex.printStackTrace();
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        
        String sql = "SELECT * FROM producto";
        
        Statement stmt = connection.createStatement();
        
        ResultSet rs = stmt.executeQuery(sql);
        
        while(rs.next()){
            int codigo = rs.getInt("codigo");
            
            String nombre = rs.getString("nombre");
            
            double precio = rs.getDouble("precio");
            
            int codigoFabricante = rs.getInt("codigo_fabricante");
            
            Producto producto = new Producto(codigo, nombre, precio, codigoFabricante);
            
            servicio.mostrarProducto(producto);
            
        }
        
    }
    
    
    
}
    

