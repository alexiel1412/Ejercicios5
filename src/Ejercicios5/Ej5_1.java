package Ejercicios5;

import funciones.Funciones;
import java.util.Scanner;

public class Ej5_1
{
	public static void main(String[] args)
	{
		/* Rellenar un array de tamaño N con valores enteros dados por el usuario a través del 
		teclado. */
		Scanner teclado = new Scanner (System.in);
		System.out.println("¿Cual será el tamaño del vector?");
		int tam = teclado.nextInt();
		int [] lista = new int [tam];
		Funciones.rellenarVector(lista);
		Funciones.mostrarVector(lista);
	}

}
