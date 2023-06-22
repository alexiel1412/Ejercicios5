package funciones;

import java.util.Scanner;

public class Funciones
{
	public static void rellenarVector(int[] lista)
	{
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < lista.length; i++)
		{
			System.out.println("Introduzca el dato " + (i + 1) + ":");
			lista[i] = teclado.nextInt();
		}
	}
	
	public static void rellenarVector(double[] lista)
	{
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < lista.length; i++)
		{
			System.out.println("Introduzca el dato " + (i + 1) + ":");
			lista[i] = teclado.nextDouble();
		}
	}

	public static void mostrarVector(int[] lista)
	{
		for (int i = 0; i < lista.length; i++)
		{
			System.out.printf("%d ", lista[i]);
		}
	}

	public static void mostrarVector(double[] lista)
	{
		for (int i = 0; i < lista.length; i++)
		{
			System.out.printf("%.2f ", lista[i]);
		}
	}
}
