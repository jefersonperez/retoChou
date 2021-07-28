package com.choucair.formacion;

import java.util.Random;

public class pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Inicializamos la variable que almacenará la matrícula.
		String Matricula = "";
		// Inicializamos la instancia de la clase Random con la que
		// generaremos el valor aleatorio.
		Random rnd = new Random();
		for (int i = 0; i < 6; i++)
		{
		    // Con este condicional verificamos si estamos en la parte
		    // numérica o alfabética de la matrícula.
		    // Solo debe entrar al condicional si estamos generando los
		    // números de la matrícula.
		    if(i < 3)
		    {
		        // Con esta instrucción se genera un número aleatorio entre
		        // 0 y 9, no se incluye el 10.
		    	Matricula += (char)(rnd.nextInt(26) + 65);
		      
		    }
		    // Entrará en esta parte del condicional cuando estemos generando
		    // las letras de la matrícula.
		    else
		    {
		        // Con esta instrucción se genera un número aleatorio entre
		        // 65 y 90, no se incluye el 91. Luego se convierte a un 
		        // caracter ASCII.
		    	  Matricula += rnd.nextInt(10);
		    }
		}

	    System.out.println("La matrícula es: " + Matricula);
	}

}
