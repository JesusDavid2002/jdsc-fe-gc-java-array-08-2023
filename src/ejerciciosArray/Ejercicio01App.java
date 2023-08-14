package ejerciciosArray;

import javax.swing.JOptionPane;

public class Ejercicio01App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String figura = JOptionPane.showInputDialog("Elige una de las siguientes figuras: Ciruclo, cuadrado, triangulo");
		switch (figura.toLowerCase()) {
			case "triangulo":
				String altura = JOptionPane.showInputDialog("Altura del triangulo: ");
				String base = JOptionPane.showInputDialog("Base del triangulo: ");
				calculoTriangulo(altura, base);
				break;
			case "cuadrado":
				String lado = JOptionPane.showInputDialog("Lado del cuadrado: ");
				calculoCuadrado(lado);
				break;
			case "circulo":
				String radio = JOptionPane.showInputDialog("Radio del circulo: ");
				calculoCirculo(radio);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Eso no es una figura");
		}
	}

	private static void calculoTriangulo(String altura, String base) {
		// TODO Auto-generated method stub
		double alturaCalculo = Double.parseDouble(altura); 
		double baseCalculo = Double.parseDouble(base); 
		double operacion = ((alturaCalculo * baseCalculo) / 2);
		JOptionPane.showMessageDialog(null, "El área del triangulo es: " + operacion);
	}
	
	private static void calculoCuadrado(String lado) {
		// TODO Auto-generated method stub
		double ladoCalculo = Double.parseDouble(lado);
		double operacion = ladoCalculo * ladoCalculo;
		JOptionPane.showMessageDialog(null, "El área del cuadrado es: " + operacion);
	}
	
	private static void calculoCirculo(String radio) {
		// TODO Auto-generated method stub
		double radioCalculo = Double.parseDouble(radio);
		double operacion = ((Math.pow(radioCalculo, 2)) * Math.PI);
		JOptionPane.showMessageDialog(null, "El área del circulo es: " + operacion);
	}
}
