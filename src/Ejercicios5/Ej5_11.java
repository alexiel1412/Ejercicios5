package Ejercicios5;

import java.util.Scanner;

import funciones.Funciones;

public class Ej5_11
{
	public static void main(String[] args)
	{
		/* Dados dos vectores, calcular la suma de ambos.*/
		Scanner teclado = new Scanner (System.in);
		System.out.println("¿Cual será el tamaño de los vectores?");
		int tam = teclado.nextInt();
		double [] lista1 = new double [tam];
		Funciones.rellenarVectorRNAmplio(lista1);
		System.out.println("Vector A:");
		Funciones.mostrarVector(lista1);

		double [] lista2 = new double [tam];
		Funciones.rellenarVectorRNAmplio(lista2);
		System.out.println("Vector B:");
		Funciones.mostrarVector(lista2);

		double [] listaSumado = Funciones.sumarVectores (lista1, lista2);
		System.out.println("Vector Sumado:");
		Funciones.mostrarVector(listaSumado);
	}

}
