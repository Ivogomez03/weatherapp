/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isi.deso.tp;

/**
 *
 * @author ivogo
 */
public class ItemsPedido {
    private int cantidad;
    private ItemMenu itemMenu;
    private int id_pedido;
    
    public ItemsPedido(int cant,ItemMenu item, int pedido){
        this.itemMenu = item;
        this.cantidad = cant;
        this.id_pedido = pedido;
    }
    
    public ItemMenu getItemMenu(){
        return this.itemMenu;
    }
    
    public String toString(){
        return this.id_pedido + " " + this.itemMenu.toString() + " " + this.cantidad;
    }
    
    public int getCantidad(){
        return this.cantidad;
    }
    public int getIDPedido(){
        return this.id_pedido;
    }
    public void setItemMenu(ItemMenu item){
        this.itemMenu = item;
    }
    public void setCantidad(int cant){
        this.cantidad = cant;
    }
    public void setIDPedido(int pedido){
        this.id_pedido = pedido;
    }
    public double getPrecio(){
        return this.itemMenu.getPrecio()*this.cantidad;
    }
    
}
