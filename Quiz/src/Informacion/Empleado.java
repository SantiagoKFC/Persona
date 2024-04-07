package Informacion;

public class Empleado extends Persona{
	double salario;
	String Cargo;

	public Empleado(String nombre, int edad, double salario, String cargo) {
		super(nombre, edad);
		this.salario = salario;
		Cargo = cargo;
	}
	public void MostarInformacion(){
		Mostrarinformacion();
		System.out.println("Su salario actual es $ "+salario);
		System.out.println("Su cargo actual en la empresa es "+Cargo);
	}
}
