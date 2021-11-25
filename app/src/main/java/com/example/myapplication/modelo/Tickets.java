package com.example.myapplication.modelo;

public class Tickets {

    private String nombre;
    private boolean estado; // true indica una compra y false una venta
    private int cantidad;
    private double precio;


    public Tickets(String nombre, boolean estado, int cantidad, double precio) {
        this.nombre = nombre;
        this.estado = true;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Tickets(String nombre, boolean estado, int cantidad, double precio, byte xs) {
        this.nombre = nombre;
        this.estado = false;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Tickets() {
        this.nombre = "no name";
        this.estado = false;
        this.cantidad = 0;
        this.precio = 0;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    private void agregar(int cantidad, double precio){
        this.cantidad += cantidad;
        if(this.precio==0)
            this.precio = precio;
        else
            this.precio = (this.precio + precio)/2;
    }

    private void eliminar(int cantidad){
        this.cantidad -= cantidad;
        if(this.cantidad == 0) this.precio=0;
    }

    //calcularPNL(ticket.getPrecioActual,precio,true)
    public double calcularPnl(double precioActual,double exposure,boolean compra) {
        if(compra)
            return (exposure*(precioActual - precio))/100;
        else
            return (exposure*(precio - precioActual))/100;
    }

    public double calcularExposure(int cantidad, double precio) {
        return (cantidad*precio);
    }

    public void comprar(int cantidad,Usuario usuario,double precioActual){
        //double precioActual = obtenerPrecio().doubleValue();
        agregar(cantidad,precioActual);
        usuario.setCapital(usuario.getCapital() - calcularExposure(cantidad,precioActual));
    }

    public void vender(int cantidad,Usuario usuario,double precioActual){
        //double precioActual = obtenerPrecio().doubleValue();
        eliminar(cantidad);
        usuario.setCapital(usuario.getCapital() + calcularExposure(cantidad,precioActual));
    }

}
