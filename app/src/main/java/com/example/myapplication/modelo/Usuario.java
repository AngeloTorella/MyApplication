package com.example.myapplication.modelo;

import java.util.ArrayList;

public class Usuario {

    private String nombre;
    private double capital;
    private ArrayList<Tickets> ordenes;

    //para cuando cargamos los usuarios del archivo
    public Usuario(String nombre, double capital, ArrayList<Tickets> ordenes) {
        this.nombre = nombre;
        this.capital = capital;
        this.ordenes = ordenes;
    }

    //usuario sin ordenes o nuevo
    public Usuario(String nombre, double capital) {
        this.nombre = nombre;
        this.capital = capital;
        this.ordenes = new ArrayList<Tickets>();
    }

    public Usuario() {
        this.ordenes = new ArrayList<Tickets>();
    }

    public String getNombre() {
        return nombre;
    }

    public double getCapital() {
        return capital;
    }

    public ArrayList<Tickets> getOrdenes() {
        return ordenes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public void setOrdenes(ArrayList<Tickets> tickets) {
        this.ordenes = tickets;
    }

}
