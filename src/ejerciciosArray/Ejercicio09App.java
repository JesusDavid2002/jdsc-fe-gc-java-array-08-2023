package ejerciciosArray;

import javax.swing.JOptionPane;

public class Ejercicio09App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String array = JOptionPane.showInputDialog("Introduce el tamaño del array: ");
		mostrarArray(rellenarArray(array));
	}


	private static int[] rellenarArray(String array) {
		// TODO Auto-generated method stub
		int longitudArry = Integer.parseInt(array);
		int numMin = 0;
		int numMax = 9;
		int[] arrayNumeros = new int [longitudArry];
		
		for (int i = 0; i < arrayNumeros.length; i++) {
			arrayNumeros[i] = (int) (Math.random() * (numMax - numMin + 1)) + numMin;
		}
		return arrayNumeros;
	}

	private static void mostrarArray(int[] rellenarArray) {
		// TODO Auto-generated method stub
		int total = 0;
		
		System.out.println("Valores del array: ");
		for(int numero: rellenarArray) {
			System.out.println(numero);
			total += numero;
		}
		
		System.out.println("La suma de todos los valores del array es: "+total);
	}
}
