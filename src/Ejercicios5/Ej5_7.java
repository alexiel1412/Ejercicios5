package Ejercicios5;

import java.util.Scanner;

import funciones.Funciones;

public class Ej5_7
{
	public static void main(String[] args)
	{
		/* Dados dos arrays de reales de tamaño N, suponiendo que modelan dos vectores de un 
			espacio N-dimensional, decir si son paralelos o no. Son paralelos si todos sus valores 
			son proporcionales*/
		Scanner teclado = new Scanner (System.in);
		System.out.println("¿Cual será el tamaño de los vectores?");
		int tam = teclado.nextInt();
		double [] lista1 = new double [tam];
		Funciones.rellenarVector(lista1);
		System.out.println("Vector A:");
		Funciones.mostrarVector(lista1);

		double [] lista2 = new double [tam];
		Funciones.rellenarVector(lista2);
		System.out.println("Vector B:");
		Funciones.mostrarVector(lista2);
		if (Funciones.vectoresParalelos(lista1, lista2))
			System.out.println("Los vectores son paralelos.");
		else
			System.out.println("Los vectores no son paralelos.");
		
	}
}
