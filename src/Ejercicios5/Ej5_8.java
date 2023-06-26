package Ejercicios5;

import java.util.Scanner;

import funciones.Funciones;

public class Ej5_8
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		System.out.println("¿Cual será el tamaño de los vectores?");
		int tam = teclado.nextInt();
		int [] lista = new int [tam];
		Funciones.rellenarVector(lista);
		Funciones.mostrarVector(lista);
		if (Funciones.comprobarCapicua(lista))
			System.out.println("El vector es capicua.");
		else
			System.out.println("El vector no es capicua.");
	}
}
