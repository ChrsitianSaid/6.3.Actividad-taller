package src;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//Vehiculo.java
public abstract class Vehiculo {
 private String matricula;
 private String modelo;
 private List<Reparacion> reparaciones;

 public Vehiculo(String matricula, String modelo) {
     this.matricula = matricula;
     this.modelo = modelo;
     this.reparaciones = new ArrayList<>();
 }

 public void addReparacion(String descripcion, double costo) {
     Reparacion r = new Reparacion(descripcion, costo, LocalDate.now());
     reparaciones.add(r);
 }

 public String getMatricula() {
	return matricula;
 }

 public void setMatricula(String matricula) {
	this.matricula = matricula;
 }

 public String getModelo() {
	return modelo;
 }

 public void setModelo(String modelo) {
	this.modelo = modelo;
 }

 public List<Reparacion> getReparaciones() {
	return reparaciones;
 }

 public void setReparaciones(List<Reparacion> reparaciones) {
	this.reparaciones = reparaciones;
 }


}






