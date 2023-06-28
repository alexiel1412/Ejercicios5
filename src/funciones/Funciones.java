package funciones;

import java.util.Random;
import java.util.Scanner;

public class Funciones
{
	public static int [] rellenarVectorRN(int[] vector)
	{
		Scanner teclado = new Scanner(System.in);
		Random random = new Random ();
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
		for (int i = 0; i < vector.length; i++)
		{
			vector[i] = random.nextDouble(1, 101);   // Mete randoms de 1 a 100
		}
		return vector;
	}
	public static int [] rellenarVectorRNAmplio(int[] vector)
	{
		Scanner teclado = new Scanner(System.in);
		Random random = new Random ();
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
		for (int i = 0; i < vector.length; i++)
		{
			vector[i] = random.nextDouble(-100, 101);   // Mete randoms de -100 a 100
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
			System.out.printf("%.2f\t", vector[i]);
		}
		System.out.println();
	}

	public static void mostrarMenoresA(int num, int[] vector)
	{
		for (int i = 0; i < vector.length; i++)
			if (vector[i] < num)
				System.out.println("La casilla " + (i + 1) + ": " + vector[i]);
	}

	public static void mostrarMenoresA(double num, int[] vector)
	{
		for (int i = 0; i < vector.length; i++)
			if (vector[i] < num)
				System.out.println("La casilla " + (i + 1) + ": " + vector[i]);
	}

	public static void mostrarMenoresA(int num, double[] vector)
	{
		for (int i = 0; i < vector.length; i++)
			if (vector[i] < num)
				System.out.printf("Casilla %d: %.2f\n", (i + 1), vector[i]);
	}

	public static void mostrarMenoresA(double num, double[] vector)
	{
		for (int i = 0; i < vector.length; i++)
			if (vector[i] < num)
				System.out.printf("Casilla %d: %.2f\n", (i + 1), vector[i]);
	}

	public static void mostrarRango(int[] vector, int ini, int fin)
	{
		for (int i = 0; i < vector.length; i++)
			if ((vector[i] >= ini && vector[i] < fin) || (vector[i] <= ini && vector[i] > fin))
				System.out.println("Casilla " + (i + 1) + ": " + vector[i]);
	}

	public static void mostrarRango(int[] vector, double ini, double fin)
	{
		for (int i = 0; i < vector.length; i++)
			if ((vector[i] >= ini && vector[i] < fin) || (vector[i] <= ini && vector[i] > fin))
				System.out.println("Casilla " + (i + 1) + ": " + vector[i]);
	}

	public static void mostrarRango(double[] vector, int ini, int fin)
	{
		for (int i = 0; i < vector.length; i++)
			if ((vector[i] >= ini && vector[i] < fin) || (vector[i] <= ini && vector[i] > fin))
				System.out.printf("Casilla %d: %.2f\n", (i + 1), vector[i]);
	}

	public static void mostrarRango(double[] vector, double ini, double fin)
	{
		for (int i = 0; i < vector.length; i++)
			if ((vector[i] >= ini && vector[i] < fin) || (vector[i] <= ini && vector[i] > fin))
				System.out.printf("Casilla %d: %.2f\n", (i + 1), vector[i]);
	}

	public static void circularVectorIzq(int[] vector)
	{
		int guardado = vector[0];
		for (int i = 0; i < vector.length; i++)
			vector[i] = vector[i + 1];
		vector[vector.length - 1] = guardado;
	}
	

	public static void circularVectorIzq(double[] vector)
	{
		double guardado = vector[0];
		for (int i = 0; i < vector.length; i++)
			vector[i] = vector[i + 1];
		vector[vector.length - 1] = guardado;
	}
	

	public static void circularVectorDer(int[] vector)
	{
		int guardado = vector[vector.length - 1];
		for (int i = vector.length - 1; i > 0; i--)
			vector[i] = vector[i - 1];
		vector[0] = guardado;
	}
	
	public static void circularVectorDer(double[] vector)
	{
		double guardado = vector[vector.length - 1];
		for (int i = vector.length - 1; i > 0; i--)
			vector[i] = vector[i - 1];
		vector[0] = guardado;
	}

	public static void circularVector(int[] vector, boolean dir) //false izquierda, true derecha
	{
		if (dir)
			circularVectorDer(vector);
		else
			circularVectorIzq(vector);
	}

	public static void circularVector(double[] vector, boolean dir) //false izquierda, true derecha
	{
		if (dir)
			circularVectorDer(vector);
		else
			circularVectorIzq(vector);
	}

	
	public static int localizarMayorDe(int[] vector, int lim)
	{
		for (int i = 0; i < vector.length; i++)
			if (vector[i] > lim)
				return i;
		return -1;
	}

	public static int localizarMayorDe(double[] vector, double lim)
	{
		for (int i = 0; i < vector.length; i++)
			if (vector[i] > lim)
				return i;
		return -1;
	}

	public static void mostrarVectorRango(int[] vector, int pos)
	{
		for (int i = pos; i < vector.length; i++)
			System.out.printf("%d ", vector[i]);
		System.out.println();
	}

	public static void mostrarVectorRango(double[] vector, int pos)
	{
		for (int i = pos; i < vector.length; i++)
			System.out.printf("%.2f\t", vector[i]);
		System.out.println();
	}

	public static boolean vectoresParalelos(int[] vector1, int[] vector2)
	{

		int i;
		double aux = vector1[0] / (double) vector2[0];
		double res = 0, division = 0;

		if (vector1.length == 1 || Double.isInfinite(division) || division == 0.0)
			return false;
			
		if (! Double.isNaN(aux))
			res = aux;

		for (i = 1; i < vector1.length; i++)
		{
			division = vector1[i] / (double) vector2[i];
			if (Double.isInfinite(division) || division == 0.0)
				return false;
			if (! Double.isNaN(division))
			{
				if (res != 0 && res != division)
					return false;
				res = division;
			}
		}
		return true;
	}

	public static boolean vectoresParalelos(double[] vector1, double[] vector2)
	{
		int i;
		double aux = vector1[0] / vector2[0];
		double res = 0, division = 0;

		if (vector1.length == 1 || Double.isInfinite(division) || division == 0.0)
			return false;
			
		if (! Double.isNaN(aux))
			res = aux;

		for (i = 1; i < vector1.length; i++)
		{
			division = vector1[i] / vector2[i];
			if (Double.isInfinite(division) || division == 0.0)
				return false;
			if (! Double.isNaN(division))
			{
				if (res != 0 && res != division)
					return false;
				res = division;
			}
		}
		return true;
	}

	public static boolean comprobarCapicua(int[] vector)
	{
		if (vector.length == 1)
			return true;
		// for (int i = 0, j = vector.length - 1; i < j; i++, j--)
			// if (vector[i] != vector[j])
		for (int i = 0; i < (vector.length / 2); i++)
			if (vector[i] != vector[vector.length - 1 - i])
				return false;
		return true;
	}

	public static void copiarVectorInversa(int[] vector, int[] copia)
	{
		for (int i = 0; i < vector.length; i++)
			copia[copia.length - 1 - i] = vector[i];
	}

	public static void copiarVectorInversa(double[] vector, double[] copia)
	{
		for (int i = 0; i < vector.length; i++)
			copia[copia.length - 1 - i] = vector[i];
	}

	public static int[] unirVectores(int[] vector1, int[] vector2)
	{
		int tamFin = vector1.length + vector2.length;
		int [] vectorFin = new int [tamFin];
		for (int i = 0; i < tamFin; i++)
		{
			if (i < vector1.length)
				vectorFin[i] = vector1[i];
			else
				vectorFin[i] = vector2[i - vector1.length];
		}
		return vectorFin;
	}

	public static double[] unirVectores(double[] vector1, double[] vector2)
	{
		int tamFin = vector1.length + vector2.length;
		double [] vectorFin = new double [tamFin];
		for (int i = 0; i < tamFin; i++)
		{
			if (i < vector1.length)
				vectorFin[i] = vector1[i];
			else
				vectorFin[i] = vector2[i - vector1.length];
		}
		return vectorFin;
	}

	public static int[] sumarVectores(int[] vector1, int[] vector2)
	{
		int [] vectorSumado = new int [vector1.length];
		for (int i = 0; i < vectorSumado.length; i++)
			vectorSumado[i] = vector1[i] + vector2[i];
		return vectorSumado;
	}
	
	public static double[] sumarVectores(double[] vector1, double[] vector2)
	{
		double [] vectorSumado = new double [vector1.length];
		for (int i = 0; i < vectorSumado.length; i++)
			vectorSumado[i] = vector1[i] + vector2[i];
		return vectorSumado;
	}
}
