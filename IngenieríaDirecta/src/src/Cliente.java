package src;

import java.util.ArrayList;
import java.util.List;

//Cliente.java
public class Cliente {
 private String dni;
 private String nombre;
 private List<Vehiculo> vehiculos;

 public Cliente(String dni, String nombre) {
     this.dni = dni;
     this.nombre = nombre;
     this.vehiculos = new ArrayList<>();
 }

 public void addVehiculo(Vehiculo v) {
     vehiculos.add(v);
 }
 // Getters y setters

 public String getDni() {
	return dni;
 }

 public void setDni(String dni) {
	this.dni = dni;
 }

 public String getNombre() {
	return nombre;
 }

 public void setNombre(String nombre) {
	this.nombre = nombre;
 }

 public List<Vehiculo> getVehiculos() {
	return vehiculos;
 }

 public void setVehiculos(List<Vehiculo> vehiculos) {
	this.vehiculos = vehiculos;
 }
}