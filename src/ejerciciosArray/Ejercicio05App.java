package ejerciciosArray;

import javax.swing.JOptionPane;

public class Ejercicio05App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numero = JOptionPane.showInputDialog("Introduce un numero en base decimal para pasarlo a binario: ");
		conversionDecBin(numero);
	}

	private static void conversionDecBin(String numero) {
		// TODO Auto-generated method stub
		int decimal = Integer.parseInt(numero);
		int[] arrayBinarios = new int [32];
		
		int resultado = 0;
		while (decimal > 0) {
			int resto = decimal % 2;
			arrayBinarios[resultado] = resto;
			decimal /= 2;
			resultado++;
		}
		
		for(int i = resultado - 1; i >= 0; i--) {
			System.out.println(arrayBinarios[i]);
		}
	}

}
