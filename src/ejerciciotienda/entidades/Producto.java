package ejerciciotienda.entidades;

public class Producto {
    
        int codigo;
        String nombre;
        double precio;
        int codigoFabricante;

        public Producto(int codigo, String nombre, double precio, int codigoFabricante) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.precio = precio;
            this.codigoFabricante = codigoFabricante;
        }

        public Producto() {
        }

        public int getCodigo() {
            return codigo;
        }

        public String getNombre() {
            return nombre;
        }

        public double getPrecio() {
            return precio;
        }

        public int getCodigoFabricante() {
            return codigoFabricante;
        }

        public void setCodigo(int codigo) {
            this.codigo = codigo;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public void setCodigoFabricante(int codigoFabricante) {
            this.codigoFabricante = codigoFabricante;
        } 

    }   
    
