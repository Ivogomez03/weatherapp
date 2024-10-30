package isi.deso.tp;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pablo
 */
public abstract class ItemMenu {
    protected int id;
    protected String nombre, descripcion;
    protected Categoria categoria;
    protected double precio;
    
    public abstract double peso(double p);
    public abstract boolean esComida();
    public abstract boolean esBebida();
    public abstract boolean aptoVegano();
    
    
    

    @Override
    public String toString(){
        String s = (this.getId() + " " + this.getNombre() + " " + this.getDescripcion() + " " + this.categoria.toString() + " " + this.getPrecio());
        return s;
    }
    public void printLn(){
        System.out.println(this.toString());
    }
    public int getId(){
        return this.id;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public double getPrecio(){
        return this.precio;
    }
    public Categoria getCategoria(){
        return this.categoria;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setNombre(String n){
        this.nombre = n;
    }
    public void setDescripcion(String n){
        this.descripcion = n;
    }
    
    public void setPrecio(double p){
        this.precio = p;
    }
}
