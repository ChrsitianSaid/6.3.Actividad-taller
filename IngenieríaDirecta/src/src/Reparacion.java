package src;

import java.time.LocalDate;

//Reparacion.java
public class Reparacion {
 private String descripcion;
 private double costo;
 private LocalDate fecha;

 public Reparacion(String descripcion, double costo, LocalDate fecha) {
     this.descripcion = descripcion;
     this.costo = costo;
     this.fecha = fecha;
 }
 // Getters y setters

 public String getDescripcion() {
	return descripcion;
 }

 public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
 }

 public double getCosto() {
	return costo;
 }

 public void setCosto(double costo) {
	this.costo = costo;
 }

 public LocalDate getFecha() {
	return fecha;
 }

 public void setFecha(LocalDate fecha) {
	this.fecha = fecha;
 }
}
