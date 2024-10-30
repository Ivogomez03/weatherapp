/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isi.deso.tp;

/**
 *
 * @author franc
 */
public class Categoria {
    private int id;
    private String descripcion;
    private TipoDeItem tipo;
    
    public Categoria(int id, String descripcion, TipoDeItem tipo){
        this.id = id;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }
    
    public String toString(){
        return this.id + " " + this.descripcion + " " + this.tipo;
    }
}
