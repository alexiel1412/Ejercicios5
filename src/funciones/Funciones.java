package funciones;

import java.util.Random;
import java.util.Scanner;

public class Funciones
{
	public static int [] rellenarVectorRN(int[] vector)
	{
		Scanner teclado = new Scanner(System.in);
		Random random = new Random ();
		System.out.println("Rellenando...");
		for (int i = 0; i < vector.length; i++)
		{
			vector[i] = random.nextInt(1, 101);   // Mete randoms de 1 a 10
		}
		return vector;
	}
	
	public static double [] rellenarVectorRN(double[] vector)
	{
		Scanner teclado = new Scanner(System.in);
		Random random = new Random ();
		System.out.println("Rellenando...");
		for (int i = 0; i < vector.length; i++)
		{
			vector[i] = random.nextDouble(1, 101);   // Mete randoms de 1 a 10
		}
		return vector;
	}
	/*
	int aleat = random.nextInt(11);
	while (aleat != 10)
	{
		System.out.println(aleat);
		aleat = random.nextInt(11);
	}
	*/
	public static void rellenarVector(int[] vector)
	{
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < vector.length; i++)
		{
			System.out.println("Introduzca el dato " + (i + 1) + ":");
			vector[i] = teclado.nextInt();
		}
	}
	
	public static void rellenarVector(double[] vector)
	{
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < vector.length; i++)
		{
			System.out.println("Introduzca el dato " + (i + 1) + ":");
			vector[i] = teclado.nextDouble();
		}
		System.out.println();
	}

	public static void mostrarVector(int[] vector)
	{
		for (int i = 0; i < vector.length; i++)
		{
			System.out.printf("%d ", vector[i]);
		}
		System.out.println();
	}

	public static void mostrarVector(double[] vector)
	{
		for (int i = 0; i < vector.length; i++)
		{
			System.out.printf("%.2f ", vector[i]);
		}
		System.out.println();
	}

	public static void mostrarMenoresA(int num, int[] vector)
	{
		System.out.println("Menores a " + num);
		for (int i = 0; i < vector.length; i++)
			if (vector[i] < num)
				System.out.println("La casilla " + (i + 1) + ": " + vector[i]);
	}

	public static void mostrarMenoresA(double num, int[] vector)
	{
		System.out.printf("Menores a %.2f:\n\n", num);
		for (int i = 0; i < vector.length; i++)
			if (vector[i] < num)
				System.out.println("La casilla " + (i + 1) + ": " + vector[i]);
	}

	public static void mostrarMenoresA(int num, double[] vector)
	{
		System.out.println("Menores a " + num);
		for (int i = 0; i < vector.length; i++)
			if (vector[i] < num)
				System.out.printf("La casilla %d: %.2f\n", (i + 1), vector[i]);
	}

	public static void mostrarMenoresA(double num, double[] vector)
	{
		System.out.printf("Menores a %.2f:\n\n", num);
		for (int i = 0; i < vector.length; i++)
			if (vector[i] < num)
				System.out.printf("La casilla %d: %.2f\n", (i + 1), vector[i]);
	}
}
