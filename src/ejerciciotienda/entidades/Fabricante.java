package ejerciciotienda.entidades;

public class Fabricante {
    
    int codigo;
    String nombre;

    public Fabricante(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Fabricante() {
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
