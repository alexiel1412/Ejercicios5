package Ejercicios5;

import java.util.Scanner;

import funciones.Funciones;

public class Ej5_10
{
	public static void main(String[] args)
	{
		/* Dados dos array de enteros de tamaños N y M respectivamente, concatenarlos en un nuevo array
		 * de tamaño N+M, es decir si los arrays de entrada son por ejemplo: 5 -1 -3 15 4 y 3 4 2, el array
		 * concatenado resultado deberá ser: 5 -1 -3 15 4 3 4 2.*/
		
		Scanner teclado = new Scanner (System.in);
		int tam1 = 0, tam2 = 0;
		while (tam1 < 1)
		{
			System.out.println("¿Cual será el tamaño del vector A?");
			tam1 = teclado.nextInt();
		}
		int [] lista1 = new int [tam1];
		Funciones.rellenarVectorRNAmplio(lista1);
		System.out.println("Vector A:");
		Funciones.mostrarVector(lista1);

		while (tam2 < 1)
		{
			System.out.println("¿Cual será el tamaño del vector B?");
			tam2 = teclado.nextInt();
		}
		int [] lista2 = new int [tam2];
		Funciones.rellenarVectorRNAmplio(lista2);
		System.out.println("Vector B:");
		Funciones.mostrarVector(lista2);

		int [] listaUnida = Funciones.unirVectores (lista1, lista2);
		System.out.println("Vector Final:");
		Funciones.mostrarVector(listaUnida);
		
		teclado.close();
	}
}
