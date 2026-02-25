package src;

//Coche.java
public class Coche extends Vehiculo {
private int numPuertas;

public Coche(String matricula, String modelo, int numPuertas) {
   super(matricula, modelo);
   this.numPuertas = numPuertas;
}
// Getters y setters

public int getNumPuertas() {
	return numPuertas;
}

public void setNumPuertas(int numPuertas) {
	this.numPuertas = numPuertas;
}
}
