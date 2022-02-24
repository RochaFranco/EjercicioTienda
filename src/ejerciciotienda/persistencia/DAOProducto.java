package ejerciciotienda.persistencia;

import ejerciciotienda.entidades.Fabricante;
import ejerciciotienda.entidades.Producto;
import java.sql.*;
import java.util.*;

public class DAOProducto {
    
    public List<Producto> obtenerLista() throws ClassNotFoundException, SQLException{
        
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
        
        List<Producto> productos = new ArrayList<>();
        
        while(rs.next()){
            int codigo = rs.getInt("codigo");
            
            String nombre = rs.getString("nombre");
            
            double precio = rs.getDouble("precio");
            
            int codigoFabricante = rs.getInt("codigo_fabricante");
            
            Producto producto = new Producto(codigo, nombre, precio, codigoFabricante);

            
            productos.add(producto);
            
        }
        
        connection.close();
        
        return productos;
        
    } 
    
    public List<Producto> obtenerPortatiles() throws SQLException, ClassNotFoundException
    {
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
        
        String sql = "SELECT * FROM producto WHERE nombre LIKE '%portatil%' ";
        Statement stmt = connection.createStatement(); 
        ResultSet rs = stmt.executeQuery(sql);
        
        List<Producto> productos = new ArrayList<>();
        
        while(rs.next()){
            int codigo = rs.getInt("codigo");
            
            String nombre = rs.getString("nombre");
            
            double precio = rs.getDouble("precio");
            
            int codigoFabricante = rs.getInt("codigo_fabricante");
            
            Producto producto = new Producto(codigo, nombre, precio, codigoFabricante);

            
            productos.add(producto);
            
        }
        
        connection.close();
        
        return productos;
    }
    
    public List<Producto> obtenerProductoMasBarato() throws SQLException, ClassNotFoundException
    {
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
        
        String sql = "SELECT * FROM producto GROUP BY codigo ORDER BY precio ASC LIMIT 1 ";
        
        Statement stmt = connection.createStatement();
        
        ResultSet rs = stmt.executeQuery(sql);
        
        List<Producto> productos = new ArrayList<>();
        
        while(rs.next()){
            int codigo = rs.getInt("codigo");
            
            String nombre = rs.getString("nombre");
            
            double precio = rs.getDouble("precio");
            
            int codigoFabricante = rs.getInt("codigo_fabricante");
            
            Producto producto = new Producto(codigo, nombre, precio, codigoFabricante);

            
            productos.add(producto);
            
        }
        
        connection.close();
        
        return productos;
    }
    
    public void agregarProducto(Producto nuevoProducto) throws SQLException, ClassNotFoundException
    {
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
        
        String sql = "INSERT INTO producto VALUES(" + nuevoProducto.getCodigo()+ ", '"+ nuevoProducto.getNombre() + "', " + nuevoProducto.getPrecio()+ ", "+ nuevoProducto.getCodigoFabricante()+");";
        
        Statement stmt = connection.createStatement();
        
        stmt.executeUpdate(sql);
        
        connection.close();
        
    }
    
    public void agregarFabricante(Fabricante fabricante) throws SQLException, ClassNotFoundException
    {
        
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
        
        String sql = "INSERT INTO fabricante VALUES("+ fabricante.getCodigo()+", '" + fabricante.getNombre() + "');";
        
        Statement stmt = connection.createStatement();
        
        stmt.executeUpdate(sql);
        
        connection.close();
        
    }
    
}
