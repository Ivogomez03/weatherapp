package isi.deso.tp;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pablo
 */
public class Bebida extends ItemMenu {
    private double graduacionAlcohol;
    private int tamanio;
    
    public Bebida(int id, String nombre, String descripcion, Categoria categoria, double precio, int tamanio, double graduacionAlcohol){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precio = precio;
        this.tamanio = tamanio;
        this.graduacionAlcohol = graduacionAlcohol;
    }
    
    @Override
    public double peso(double p){
        if(graduacionAlcohol > 0){
            return ((0.99 * tamanio) * 1.2);
        }
        else {
            return ((1.04 * tamanio) * 1.2);
        }
    }
    @Override
    public boolean esComida(){
        return false;
    }
    @Override
    public boolean esBebida(){
        return true;
    }
    @Override
    public boolean aptoVegano(){
        return false; //supongo que es asi porque no tiene variables para poder definirlo sino
    }
    
    public boolean esBebidaAlcoholica(){
        return this.graduacionAlcohol>0;
    }
    
    public int getTamanio(){
        return this.tamanio;
    }
    public double getGraduacionAlcohol(){
       return this.graduacionAlcohol;
    }

}
