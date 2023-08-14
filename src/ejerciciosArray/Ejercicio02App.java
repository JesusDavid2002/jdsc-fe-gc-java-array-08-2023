package ejerciciosArray;

import javax.swing.JOptionPane;

public class Ejercicio02App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String longitud = JOptionPane.showInputDialog("Introduce la cantidad de números que se generen: ");
		String num1 = JOptionPane.showInputDialog("Introduce el primer número donde comenzará la generación de números: ");
		String num2 = JOptionPane.showInputDialog("Introduce el segundo número donde acabará la generación de números: ");
		generacionRandoms(longitud, num1, num2);
		
	}

	private static void generacionRandoms(String longitud, String numeroI, String numeroF) {
		// TODO Auto-generated method stub
		int numArray = Integer.parseInt(longitud);
		int numInicio = Integer.parseInt(numeroI);
		int numFinal = Integer.parseInt(numeroF);
				
		for(int i = 1; i <= numArray; i++) {
			int numero = (int) (Math.random() * (numFinal - numInicio + 1)) + numInicio;;
			System.out.println(numero);
		}
	}
}
