package Ejercicios5;

import java.util.Random;
import java.util.Scanner;

import funciones.Funciones;

public class Ej5_3
{
	public static void main(String[] args)
	{
		/*  Dado un array de reales del tamaño N, visualizar por pantalla todos los elementos del 
			mismo cuyo valor pertenezca al intervalo [a,b).   */
		Scanner teclado = new Scanner (System.in);
		System.out.println("¿Cual será el tamaño del vector?");
		int tam = teclado.nextInt();
		double [] lista = new double [tam];
		Funciones.rellenarVectorRNAmplio(lista);
		Funciones.mostrarVector(lista);
	
		System.out.println("Indique el número a comparar:");
		Random random = new Random ();
		double ini = random.nextDouble(-100, 101);   // Mete randoms de 1 a 10
		double fin = random.nextDouble(-100, 101);   // Mete randoms de 1 a 10
		System.out.printf("Los números que están entre %.2f y %.2f son:\n", ini, fin);
		Funciones.mostrarRango(lista, ini, fin);
	}
}
