package ejerciciosArray;

import java.util.Scanner;

public class Ejercicio08App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] valores = rellenarArray();
		mostrarArray(valores);
	}


	private static int[] rellenarArray() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] arrayNumeros = new int [10];
		
		for(int i = 0; i < arrayNumeros.length; i++) {
			System.out.println("Introduce " + (i+1) + " número: ");
			arrayNumeros[i] = scanner.nextInt();
		}
		scanner.close();
		return arrayNumeros;
	}
	
	private static void mostrarArray(int[] valores) {
		// TODO Auto-generated method stub
		System.out.println("Valores del array: ");
		for(int numero: valores) {
			System.out.println(numero);
		}
	}
}
