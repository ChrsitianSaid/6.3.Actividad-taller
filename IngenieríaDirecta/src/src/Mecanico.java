package src;

//Mecanico.java
public class Mecanico implements Especialista {
	private String nombre;
	private String especialidad;

	public Mecanico(String nombre, String especialidad) {
		this.nombre = nombre;
		this.especialidad = especialidad;
	}
	
    @Override
    public void reparar(Vehiculo v) {
		System.out.println("Reparando " + v.getModelo() + " con especialidad en " + especialidad);
    }
    // Getters y setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

}
