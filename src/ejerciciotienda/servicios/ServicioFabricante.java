package ejerciciotienda.servicios;

import java.util.*;
import ejerciciotienda.entidades.Fabricante;

public class ServicioFabricante {
    
    public Fabricante crearFabricante(){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el codigo de fabricante: ");
        int codigo = scanner.nextInt();
        
        System.out.println("Ingrese el nombre del fabricante");
        String nombre = scanner.next();
        
        Fabricante fabricante = new Fabricante(codigo, nombre);
        
        return fabricante;
        
    }
    
}
