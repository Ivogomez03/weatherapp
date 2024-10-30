package isi.deso.tp;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pablo
 */
public class Plato extends ItemMenu {
    private int calorias;
    private boolean aptoCeliaco, aptoVegetariano;
    
    public Plato(int id, String nombre, String descripcion, Categoria categoria, double precio, int calorias, boolean aptoCeliaco, boolean aptoVegetariano){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precio = precio;
        this.calorias = calorias;
        this.aptoCeliaco = aptoCeliaco;
        this.aptoVegetariano = aptoVegetariano;
    }
    
    @Override
    public double peso(double p){
       return (1.1 * p);
    }
    @Override
    public boolean esComida(){
        return true;
    }
    @Override
    public boolean esBebida(){
        return false;
    }
    @Override
    public boolean aptoVegano(){
        return (aptoCeliaco & aptoVegetariano);
    }
    
    public int getCalorias(){
        return this.calorias;
    }    
    public boolean getAptoCeliaco(){
        return this.aptoCeliaco;
    }
    
    public void setCalorias(int cal){
        this.calorias = cal;
    }    
    public void setAptoCeliaco(boolean x){
        this.aptoCeliaco = x;
    }    
    public void setAptoVegetariano(boolean x){
        this.aptoCeliaco = x;
    }
    public boolean setAptoVegetariano(){
        return this.aptoCeliaco;
    }
}
