package Ejercicios5;

import java.util.Random;
import java.util.Scanner;

import funciones.Funciones;

public class Ej5_2
{
	public static void main(String[] args)
	{
		/* Dado un array de enteros de tamaño N, visualizar por pantalla todos los elementos del 
			mismo cuyo valor sea menor que un número A.  */
		Scanner teclado = new Scanner (System.in);
		System.out.println("¿Cual será el tamaño del vector?");
		int tam = teclado.nextInt();
		double [] lista = new double [tam];
		Funciones.rellenarVectorRN(lista);
		Funciones.mostrarVector(lista);

		System.out.println("Indique el número a comparar:");
		Random random = new Random ();
		double num = random.nextDouble(1, 101);   // Mete randoms de 1 a 10
		Funciones.mostrarMenoresA(num, lista);
		
	}
}
