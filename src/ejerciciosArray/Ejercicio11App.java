package ejerciciosArray;

import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio11App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String array = JOptionPane.showInputDialog("Introduce el tamaño de los arrays: ");
		int longitudArray = Integer.parseInt(array);
		
		int[] array1 = rellenarArrays(longitudArray);
		int[] array2 = array1.clone();
		reasignarArrays(array2);
		int[] arrayResult = multiplicarArrays(array1, array2);
		
		System.out.println("Contenido del primer array: ");
		mostrarArrays(array1);
		
		System.out.println("\nContenido del segundo array: ");
		mostrarArrays(array2);
		
		System.out.println("\nResultado de la multiplicación entre los 2 arrays: ");
		mostrarArrays(arrayResult);
	}



	private static int[] rellenarArrays(int longitudArray) {
		// TODO Auto-generated method stub
		int[] array = new int [longitudArray];
		Random random = new Random();
		
		for(int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(100);
		}
		return array;
	}

	private static void reasignarArrays(int[] array) {
		// TODO Auto-generated method stub
		Random random = new Random();
		for(int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(100);
		}
	}

	private static int[] multiplicarArrays(int[] array1, int[] array2) {
		// TODO Auto-generated method stub
		int[] resultado = new int [array1.length];
		
		for(int i = 0; i < resultado.length; i++) {
			resultado[i]= array2[i] * array1[i];
		}
		return resultado;
	}

	private static void mostrarArrays(int[] arrays) {
		// TODO Auto-generated method stub
		for(int numero: arrays) {
			System.out.println(numero);
		}
	}
	
}
