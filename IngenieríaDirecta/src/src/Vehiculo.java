package src;

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

 // Getters y setters omitidos para brevedad
}

//Coche.java
public class Coche extends Vehiculo {
 private int numPuertas;

 public Coche(String matricula, String modelo, int numPuertas) {
     super(matricula, modelo);
     this.numPuertas = numPuertas;
 }
 // Getters y setters
}

//Moto.java
public class Moto extends Vehiculo {
 private boolean tieneSidecar;

 public Moto(String matricula, String modelo, boolean tieneSidecar) {
     super(matricula, modelo);
     this.tieneSidecar = tieneSidecar;
 }
 // Getters y setters
}
