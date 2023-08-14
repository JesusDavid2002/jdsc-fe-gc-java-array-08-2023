package ejerciciosArray;

import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio12App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String array = JOptionPane.showInputDialog("Introduce el tamaño del array: ");
        int longitudArray = Integer.parseInt(array);

        String numero = JOptionPane.showInputDialog("Introduce el dígito para filtrar (0-9): ");
        int num = Integer.parseInt(numero);

        comprobador(num, longitudArray);
    }

    private static void comprobador(int num, int longitudArray) {
		// TODO Auto-generated method stub
    	 if (num >= 0 && num <= 9) {
             int[] arrayRandom = llenarArray(longitudArray);
             int[] arrayFiltrado = seleccionarDatos(arrayRandom, num);

             System.out.print("El array contiene estos números: ");
             mostrarArray(arrayRandom);

             System.out.print("\nDel array anterior, los números que acaban en " + num + " son: ");
             mostrarArray(arrayFiltrado);
         } else {
             System.out.println("Dígito no válido. Debe ser un número entre 0 y 9.");
         }
	}

	private static int[] llenarArray(int longitudArray) {
        int[] array = new int[longitudArray];
        Random random = new Random();

        for (int i = 0; i < longitudArray; i++) {
        	array[i] = random.nextInt(300);
        }

        return array;
    }

    private static int[] seleccionarDatos(int[] arrayRandom, int num) {
        int[] arrayNumFinal = new int[arrayRandom.length];
        int acumulador = 0;

        for (int numero : arrayRandom) {
            int ultimoDigito = numero % 10;
            if (ultimoDigito == num) {
                arrayNumFinal[acumulador] = numero;
                acumulador++;
            }
        }

        int[] comparadorArray = new int[acumulador];
        System.arraycopy(arrayNumFinal, 0, comparadorArray, 0, acumulador);
        return comparadorArray;
    }

    private static void mostrarArray(int[] array) {
        for (int numero : array) {
            System.out.print(numero + "\n");
        }
        System.out.println();
    }
    

}
