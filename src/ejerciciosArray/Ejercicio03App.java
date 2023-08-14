package ejerciciosArray;

import javax.swing.JOptionPane;

public class Ejercicio03App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numero = JOptionPane.showInputDialog("Introduce un número: ");
		if(comprobadorPrimo(numero)) {
			System.out.println(numero + " es un numero primo");
		}else {
			System.out.println(numero + " no es un numero primo");
		}
	}

	private static boolean comprobadorPrimo(String numero) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(numero);
		
	    for(int i = 2; i < num; i++) {
	    	if(num % i == 0) {
			return false;
	    	}
	    }
	    return num != 1;	
	}

}
