package Ejercicios5;

import java.util.Scanner;

import funciones.Funciones;

public class Ej5_9
{
	public static void main(String[] args)
	{
		/* Dado un array de enteros de tamaño N, copiarlo a otro array de igual tamaño
		 * pero de forma inversa, es decir, si por ejemplo el array de entrada es: 5 -1 -3 15 4,
		 * el resultado debe ser un nuevo array cuyos valores son: 4 15 -3 -1 5.*/
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("¿Cual será el tamaño del vector?");
		int tam = teclado.nextInt();
		int [] lista = new int [tam];
		Funciones.rellenarVectorRNAmplio(lista);
		Funciones.mostrarVector(lista);

		int [] copia = new int [tam];
		
		Funciones.copiarVectorInversa(lista, copia);
		Funciones.mostrarVector(copia);

	}

}
