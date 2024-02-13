package accesodatos_ejercicio2;


public class Producto {
    private int codigo;
    private String nombre;
    private double precio;
    private int codigoFabricante;

    // Constructor
    public Producto(int codigo, String nombre, double precio, int codigoFabricante) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.codigoFabricante = codigoFabricante;
    }

    // Getters
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

    // Setters
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

   
    @Override
    public String toString() {
        return "Producto{" +
               "codigo=" + codigo +
               ", nombre='" + nombre + '\'' +
               ", precio=" + precio +
               ", codigoFabricante=" + codigoFabricante +
               '}';
    }
}
