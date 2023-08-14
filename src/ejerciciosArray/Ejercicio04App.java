package ejerciciosArray;

import javax.swing.JOptionPane;

public class Ejercicio04App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numero = JOptionPane.showInputDialog("Introduce un numero para calcular su factorial: ");
		JOptionPane.showMessageDialog(null, "El factorial del número " + numero + " es " + factorialNumero(numero)); 
	}

	private static int factorialNumero(String numero) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(numero);
		int acumulador = 1;
		
		for(int i = 1; i <= num; i++){
			acumulador *= i;
		}
		return acumulador;
	}

}
