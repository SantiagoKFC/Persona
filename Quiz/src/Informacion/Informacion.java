package Informacion;
import java.util.Scanner;
public class Informacion {
	public static void responderPreguntas() {
		System.out.println("1. ¿Cuál es la diferencia entre una clase `Persona` y una clase `Empleado` en términos de atributos y métodos");
		System.out.println("La diferencia entre las clases es que 'Empleado' ademas de heredar los mismos atributos de'Persona', esta clase tiene sus propios atributos");
		System.out.println("2. ¿Cómo se establece la relación de herencia entre `Empleado` y `Persona` en Java?");
		System.out.println("la relacion entre las dos clases se realiza a traves de la palabra reservada 'extends' para que se sepa quien es la clase madre y la clase hija");
		System.out.println("3. ¿Qué es un constructor en Java y cuál es su propósito?");
		System.out.println("Este nos ayuda a la creacion del objeto, dandonos los atributos de este y sus parametros ");
		System.out.println("4. ¿Por qué es útil utilizar la herencia en la programación orientada a objetos?");
		System.out.println("Esta sirve para conectar clases, teniendo una clase madre que le da su informacion a una clase hija que la obtiene y la puede utilizar ");
		System.out.print("5. ¿Cómo se llama el proceso de crear un objeto a partir de una clase en Java?");
		System.out.println("A ese proceso es la creacion del constructor");
	}
	public static void main(String[] args) {
		String name,position;
		int age;
		double salary;
		
		Scanner sc = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		
		System.out.println("¿Cual es su nombre? ");
		name=sc.nextLine();
		
		System.out.println("¿Cual es su edad? ");
		age=sc.nextInt();
		
		System.out.println("¿Cual es su salario? ");
		salary=sc.nextDouble();
		
		System.out.println("¿Cual es su cargo en la empresa? ");
		position=s.nextLine();
		
		Empleado Empleado1= new Empleado(name,age,salary,position);
		Empleado1.MostarInformacion();
		
		responderPreguntas();
	}

}
