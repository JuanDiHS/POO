package co.edu.udistrital.controller;

import co.edu.udistrital.model.Estudiante;
import co.edu.udistrital.model.Persona;
import co.edu.udistrital.model.Profesor;

public class AplMain {

	public static void main(String[] args) {
		Persona a = new Persona("Carlos", 19);
		System.out.println("_____________________________");
		System.out.println(a);
		System.out.println("_____________________________");
		Estudiante b = new Estudiante("Ana", 21, "Econom�a");
		System.out.println(b);
		System.out.println("_____________________________");
		Profesor c = new Profesor("Juan", 28, 32, "Programaci�n");
		System.out.println(c);
		System.out.println("_____________________________");


	}

}
