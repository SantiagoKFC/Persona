package Informacion;

public class Persona {
	String nombre;
	int edad;

	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
public void Mostrarinformacion() {
	System.out.println("Usted se llama "+nombre);
	System.out.println("tiene "+edad+"de edad");
}
}
