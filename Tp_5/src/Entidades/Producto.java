package Entidades;

public class Producto {
    
private int codigo;
private double precio;
private String descripcion;
private String categoria;

    public Producto() {
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    

public Producto(double precio, String descripcion, String categoria) {
        this.precio = precio;
        this.descripcion = descripcion;
        this.categoria = categoria;
    }

     public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    




}
