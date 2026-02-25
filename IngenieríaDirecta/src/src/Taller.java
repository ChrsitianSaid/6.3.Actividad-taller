package src;

//Taller.java
public class Taller {
 private String nombre;
 private Mecanico mecanicoAsignado;

 public Taller(String nombre, Mecanico mecanicoAsignado) {
     this.nombre = nombre;
     this.mecanicoAsignado = mecanicoAsignado;
 }

 public void gestionarReparacion(Vehiculo v, String desc, double costo) {
     v.addReparacion(desc, costo);
     mecanicoAsignado.reparar(v);
 }
 // Getters y setters

 public String getNombre() {
	return nombre;
 }

 public void setNombre(String nombre) {
	this.nombre = nombre;
 }

 public Mecanico getMecanicoAsignado() {
	return mecanicoAsignado;
 }

 public void setMecanicoAsignado(Mecanico mecanicoAsignado) {
	this.mecanicoAsignado = mecanicoAsignado;
 }
}
