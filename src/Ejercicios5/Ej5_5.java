package Ejercicios5;

import java.util.Scanner;

import funciones.Funciones;

public class Ej5_5
{
	public static void main(String[] args)
	{
		/*  Dado un array de enteros de tamaño N, rotar sus valores una posición a la derecha, es 
			decir, si tenemos un array como el siguiente: 5 -1 -3 15 4, el resultado deberá ser el 
			array rotado a la derecha: 4 5 -1 -3 15. */
		Scanner teclado = new Scanner (System.in);
		System.out.println("¿Cual será el tamaño del vector?");
		int tam = teclado.nextInt();
		int [] lista = new int [tam];
		Funciones.rellenarVectorRNAmplio(lista);
		Funciones.mostrarVector(lista);
		System.out.println("Modificando el vector:");
		Funciones.circularVector(lista, true);
		Funciones.mostrarVector(lista);
	}
}
