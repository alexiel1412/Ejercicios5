package Ejercicios5;

import java.util.Random;
import java.util.Scanner;

import funciones.Funciones;

public class Ej5_6
{
	public static void main(String[] args)
	{
		/*  Dado un array de enteros de tamaño N, se debe buscar el primer elemento del array 
			mayor que un número A, y a partir de él inclusive, visualizar todos los valores de los 
			siguientes hasta el último elemento del array.*/
		Scanner teclado = new Scanner (System.in);
		System.out.println("¿Cual será el tamaño del vector?");
		int tam = teclado.nextInt();
		int [] lista = new int [tam];
		Funciones.rellenarVectorRNAmplio(lista);
		Funciones.mostrarVector(lista);
		System.out.println("Número máximo a buscar en el vector:");
		Random random = new Random ();
		int lim = random.nextInt(1, 101);
		System.out.println("El límite es: " + lim);
		int pos = Funciones.localizarMayorDe(lista, lim);
		if (pos == -1)
			System.out.println("No hay números mayores que el límite en el vector.");
		else
			Funciones.mostrarVectorRango(lista, pos);
		
	}
}
