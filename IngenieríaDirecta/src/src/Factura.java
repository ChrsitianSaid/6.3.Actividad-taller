package src;

//Factura.java
public class Factura {
 private String numeroFactura;
 private double baseImponible;
 private double totalConIVA;
 private Reparacion reparacionAsociada;
 private Cliente cliente;

 public Factura(String numeroFactura, double baseImponible, double totalConIVA, Reparacion reparacion, Cliente cliente) {
     this.numeroFactura = numeroFactura;
     this.baseImponible = baseImponible;
     this.totalConIVA = totalConIVA;
     this.reparacionAsociada = reparacion;
     this.cliente = cliente;
 }

 public double calcularTotal() {
     return baseImponible * 1.21; // Suponiendo un IVA del 21%
 }
 // Getters y setters

 public String getNumeroFactura() {
	return numeroFactura;
 }

 public void setNumeroFactura(String numeroFactura) {
	this.numeroFactura = numeroFactura;
 }

 public double getBaseImponible() {
	return baseImponible;
 }

 public void setBaseImponible(double baseImponible) {
	this.baseImponible = baseImponible;
 }

 public double getTotalConIVA() {
	return totalConIVA;
 }

 public void setTotalConIVA(double totalConIVA) {
	this.totalConIVA = totalConIVA;
 }

 public Reparacion getReparacionAsociada() {
	return reparacionAsociada;
 }

 public void setReparacionAsociada(Reparacion reparacionAsociada) {
	this.reparacionAsociada = reparacionAsociada;
 }

 public Cliente getCliente() {
	return cliente;
 }

 public void setCliente(Cliente cliente) {
	this.cliente = cliente;
 }
}
