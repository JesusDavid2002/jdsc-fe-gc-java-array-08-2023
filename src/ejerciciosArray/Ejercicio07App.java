package ejerciciosArray;

import javax.swing.JOptionPane;

public class Ejercicio07App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numero = JOptionPane.showInputDialog("Introduce una cantidad de euros a convertir: ");
		String moneda = JOptionPane.showInputDialog("De euros a que moneda quieres convertir: dolares, yenes o libras");
		
		switch (moneda.toLowerCase()) {
		case ("dolar"):
		case ("dolares"):
			euroDolar(numero);
			break;
		case("yen"):
		case ("yenes"):
			euroYen(numero);
			break;
		case("libra"):
		case("libras"):
			euroLibra(numero);
			break;
		}
	}

	private static void euroLibra(String numero) {
		// TODO Auto-generated method stub
		double valor = Double.parseDouble(numero);
		double resultado = valor * 0.86;
		JOptionPane.showMessageDialog(null, "La transacción a sido un éxito, ahora tiene: " + resultado + " libras.");
	}

	private static void euroYen(String numero) {
		// TODO Auto-generated method stub
		double valor = Double.parseDouble(numero);
		double resultado = valor * 129.852;
		JOptionPane.showMessageDialog(null, "La transacción a sido un éxito, ahora tiene: " + resultado + " yenes.");
		
	}

	private static void euroDolar(String numero) {
		// TODO Auto-generated method stub
		double valor = Double.parseDouble(numero);
		double resultado = valor * 1.28611;
		JOptionPane.showMessageDialog(null, "La transacción a sido un éxito, ahora tiene: " + resultado + " dólares.");
		
	}

}
