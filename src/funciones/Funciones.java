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
			vector[i] = random.nextInt(1, 101);   // Mete randoms de 1 a 100
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
	public static int [] rellenarVectorRNAmplio(int[] vector)
	{
		Scanner teclado = new Scanner(System.in);
		Random random = new Random ();
		System.out.println("Rellenando...");
		for (int i = 0; i < vector.length; i++)
		{
			vector[i] = random.nextInt(-100, 101);   // Mete randoms de -100 a 100
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
	public static double [] rellenarVectorRNAmplio(double[] vector)
	{
		Scanner teclado = new Scanner(System.in);
		Random random = new Random ();
		System.out.println("Rellenando...");
		for (int i = 0; i < vector.length; i++)
		{
			vector[i] = random.nextDouble(-100, 101);   // Mete randoms de 1 a 10
		}
		return vector;
	}

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

	public static void mostrarRango(int[] vector, int ini, int fin)
	{
		System.out.println("Los números que están entre " + ini + " y " + fin + " son:\n");
		for (int i = 0; i < vector.length; i++)
			if ((vector[i] >= ini && vector[i] <= fin) || (vector[i] <= ini && vector[i] >= fin))
				System.out.println("La casilla " + (i + 1) + ": " + vector[i]);
	}

	public static void mostrarRango(int[] vector, double ini, double fin)
	{
		System.out.printf("Los números que están entre %.2f y %.2f son:\n\n", ini, fin);
		for (int i = 0; i < vector.length; i++)
			if ((vector[i] >= ini && vector[i] <= fin) || (vector[i] <= ini && vector[i] >= fin))
				System.out.println("La casilla " + (i + 1) + ": " + vector[i]);
	}

	public static void mostrarRango(double[] vector, int ini, int fin)
	{
		System.out.println("Los números que están entre " + ini + " y " + fin + " son:\n");
		for (int i = 0; i < vector.length; i++)
			if ((vector[i] >= ini && vector[i] <= fin) || (vector[i] <= ini && vector[i] >= fin))
				System.out.printf("La casilla %d: %.2f\n", (i + 1), vector[i]);
	}

	public static void mostrarRango(double[] vector, double ini, double fin)
	{
		System.out.printf("Los números que están entre %.2f y %.2f son:\n\n", ini, fin);
		for (int i = 0; i < vector.length; i++)
			if ((vector[i] >= ini && vector[i] <= fin) || (vector[i] <= ini && vector[i] >= fin))
				System.out.printf("La casilla %d: %.2f\n", (i + 1), vector[i]);
	}

	public static void circularVectorIzq(int[] vector)
	{
		System.out.println("Modificando el vector:");
		int guardado = vector[0];
		for (int i = 0, j = 1; j < vector.length; i++, j++)
			vector[i] = vector[j];
		vector[vector.length - 1] = guardado;
	}
	

	public static void circularVectorIzq(double[] vector)
	{
		System.out.println("Modificando el vector:");
		double guardado = vector[0];
		for (int i = 0, j = 1; j < vector.length; i++, j++)
			vector[i] = vector[j];
		vector[vector.length - 1] = guardado;
	}
	

	public static void circularVectorDer(int[] vector)
	{
		System.out.println("Modificando el vector:");
		int guardado = vector[vector.length - 1];
		for (int i = vector.length - 2, j = vector.length - 1; i >= 0; i--, j--)
			vector[j] = vector[i];
		vector[0] = guardado;
	}
	
	public static void circularVectorDer(double[] vector)
	{
		System.out.println("Modificando el vector:");
		double guardado = vector[vector.length - 1];
		for (int i = vector.length - 2, j = vector.length - 1; i >= 0; i--, j--)
			vector[j] = vector[i];
		vector[0] = guardado;
	}

	public static void circularVector(int[] vector, boolean dir)
	{
		if (dir)
			circularVectorDer(vector);
		else
			circularVectorIzq(vector);
	}

	public static void circularVector(double[] vector, boolean dir)
	{
		if (dir)
			circularVectorDer(vector);
		else
			circularVectorIzq(vector);
	}
}
