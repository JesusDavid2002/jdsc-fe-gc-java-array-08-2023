package ejerciciosArray;

import javax.swing.JOptionPane;

public class Ejercicio06App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numero = JOptionPane.showInputDialog("Introduce un número positivo: ");
		int num = Integer.parseInt(numero);
		if(num >= 0) {
			calcularCifras(num);
		}else {
			JOptionPane.showMessageDialog(null, "Ese número es uno negativo, no positivo.");
		}
	}

	private static void calcularCifras(int num) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "El número " + num + " tiene " + String.valueOf(num).length() + " cifras.");
		
	}

}
