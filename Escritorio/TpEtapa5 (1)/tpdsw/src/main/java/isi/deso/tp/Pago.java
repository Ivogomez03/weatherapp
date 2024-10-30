/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isi.deso.tp;
import java.util.ArrayList;
/**
 *
 * @author tobir
 */
public abstract class Pago
{
        private static int contadorID = 0;
	protected int id_pago;
   	protected double monto;
    	protected TipoPago tipo;

	public Pago(double monto, TipoPago tipo) {
            this.id_pago = contadorID++;
            this.monto = monto;
            this.tipo = tipo;
   	}
	
	public abstract void realizarPago( ArrayList < ItemsPedido > l);
	
}

