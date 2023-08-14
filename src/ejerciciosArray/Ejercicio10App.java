package ejerciciosArray;

import javax.swing.JOptionPane;

public class Ejercicio10App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String array = JOptionPane.showInputDialog("Introduce el tamaño del array: ");
		String num1 = JOptionPane.showInputDialog("Introduce el primer número donde comenzará la generación de números: ");
		String num2 = JOptionPane.showInputDialog("Introduce el segundo número donde acabará la generación de números: ");
		
		mostrarArray(generacionArray(array, num1, num2));
	}

	
	private static int[] generacionArray(String array, String num1, String num2) {
		// TODO Auto-generated method stub
		int numArray = Integer.parseInt(array);
		int numInicio = Integer.parseInt(num1);
		int numFinal = Integer.parseInt(num2);
		int[] arrayPrimos = new int[numArray];
		int acumuladorPrimos = 0;

		while(acumuladorPrimos < numArray) {
			int numero = (int) (Math.random() * (numFinal - numInicio + 1)) + numInicio;;
			if(comprobadorPrimo(numero)) {
				arrayPrimos[acumuladorPrimos] = numero;
				acumuladorPrimos ++;
			}
		}
		return arrayPrimos;
	}

	private static boolean comprobadorPrimo(int numero) {
		// TODO Auto-generated method stub
		
	    for(int i = 2; i < numero; i++) {
	    	if(numero % i == 0) {
			return false;
	    	}
	    }
	    return numero != 1;	
	}
	
	private static void mostrarArray(int[] generacionArray) {
		// TODO Auto-generated method stub
		System.out.println("Array de números primos generados: ");
		for(int primos: generacionArray) {
			System.out.println(primos);
		}
	}


}
