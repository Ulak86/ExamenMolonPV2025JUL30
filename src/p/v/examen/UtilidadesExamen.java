
//2.
//Parte 1: Crear un array y llenarlo con números del usuario (1 punto)
//	Escribe una función crearArray que:
//		Pida al usuario el tamaño del array (entre 1 y 100).	
//		Llene el array con números introducidos por el usuario.	
//		Devuelva el array.
//
//3.
//Parte 2: Mostrar el array (1 punto)
//	Escribe una función mostrarArray que reciba un array lo recorra y lo imprima.
//
//4.
//Parte 3: Calcular el promedio de los números (1 punto)
//	Escribe una función calcularPromedio que:
//		Reciba un array.	
//		Calcule y devuelva el promedio de los números.
//
//5.
//Parte 4: Encontrar el número máximo y mínimo (1 punto)
//	Escribe una función encontrarExtremos que:
//		Reciba un array.	
//		Encuentre y devuelva el valor máximo y el mínimo.
//
//6.
//Parte 5: Filtrar números mayores que el promedio (1 punto)
//	Escribe una función filtrarMayoresQuePromedio que:	
//		Reciba un array y el promedio calculado.	
//		Devuelva un nuevo array con los números mayores que el promedio.

package p.v.examen;

import java.util.Scanner;

public class UtilidadesExamen {
	
	/**
	 * Metodo que solicita por consola al usuario el tamano del array de 1 dimension a crear hasta que introduzca un mayor que 0 y menor que 100 
	 * Si el valor introducido es valido dimensiona el array a ese valor
	 * Si el valor introducido no es valido informa al usuario
	 * Solicita al usuario  1 a 1 todos los valores del array
	 * Recibe sc que es el objeto Scanner creado en el metodo de la clase que contiene el main
	 * @param sc
	 * @return el array de enteros creado por el usuario
	 */
	public static int[] crearArray(Scanner sc) {

		int tamanoArray = 0;
		int[] arrayTamanoUsuario = null;
		do {
			System.out.println("Introduce el tamano del array que quieres crear (min 1 max 100):");
			tamanoArray = sc.nextInt();
			if (tamanoArray > 0 && 100 >= tamanoArray) {
				arrayTamanoUsuario = new int[tamanoArray];

			} else {
				System.out.println("El valor introducido no es correcto");
			}
		} while (!(tamanoArray > 0 && 100 >= tamanoArray));

		System.out.println("\nAhora rellenaremos el array con numeros enteros");
		for (int i = 0; i < arrayTamanoUsuario.length; i++) {
			System.out.println("\nIntroduce el valor para la posicion " + (i + 1) + " del array.");
			arrayTamanoUsuario[i] = sc.nextInt();
		}

		return arrayTamanoUsuario;
	}

	/**
	 * Metodo sobrecargado que imprime uno a uno los valores de un array de 1 dimension de enteros 
	 * @param arrayObt
	 */
	public static void mostrarArray(int[] arrayObt) {

		System.out.println();
		for (int numero : arrayObt) {
			System.out.print(numero + "\t");
		}
		System.out.println();
	}


	/**
	 * Metodo sobrecargado que imprime uno a uno los valores de un array de 1 dimension de doubles 
	 * Creado originalmente para imprimir el valor promedio y usado finalmente tambien por el metodo filtrarMayoresQuePromedio
	 * @param arrayObt
	 */
	public static void mostrarArray(double[] arrayObt) {

		System.out.println();
		for (double numero : arrayObt) {
			System.out.print(numero + "\t");
		}
		System.out.println();
	}

	/**
	 * Recorre uno a uno sus valores del array y los suma en el sumatorio.
	 * Divide este sumatorio entre el numero total de valores del array.
	 * Devuelve el valor promedio en un array de dimension 1 y tamano 1.
	 * @param arrayObt
	 * @return double[] calcularPromedio
	 */
	public static double[] calcularPromedio(int[] arrayObt) {
		int sumatorio = 0;

		for (int i = 0; i < arrayObt.length; i++) {
			sumatorio += arrayObt[i];
		}

		double promedio =  (sumatorio / (double)arrayObt.length);
		double[] calcularPromedio = { promedio };

		return calcularPromedio;
	}

	/**
	 * Este metodo declara 2 variables, una que contendra el valor maximo y otra el minimo e inicializa ambas con el valor del elemento [0] del array.
	 * Compara uno a uno los elementos restantes del array con esos valores y cada vez que evalua que uno es mayor o menor reemplaza el valor de la variable correspondiente.
	 * Devuelve el valor de estas 2 variables en un array de 1 dimension de tamano 2.
	 * @param arrayObt
	 * @return int[] valoresMaxYMin
	 */
	public static int[] encontrarExtremos(int[] arrayObt) {

		int valMaximo = arrayObt[0];
		int valMinimo = arrayObt[0];

		for (int i = 1; i < arrayObt.length; i++) {
			int aux = arrayObt[i];
			if (aux > valMaximo) {
				valMaximo = aux;
			}
			if (aux < valMinimo) {
				valMinimo = aux;
			}

		}

		int[] valoresMaxYMin = { valMaximo, valMinimo };

		return valoresMaxYMin;
	}

	/**
	 * Este metodo pasa el array que recibe al metodo calcularPromedio y almacena su resultado en una variable.
	 * Cuenta y almacena en otra variable el numero de valores en el array que son mayores que el de la variable promedio
	 * Genera un nuevo array d 1 dimension de tamano igual al numero de valores en el array recibido que son mayores que el de la variable promedio
	 * Rellena el nuevo array con los valores del array recibido que son mayores que el valor de la variable promedio. 
	 * @param arrayObt
	 * @return
	 */
	public static double[] filtrarMayoresQuePromedio(int[] arrayObt) {

		double promedio = calcularPromedio(arrayObt)[0];

		int cantMayores = 0;
		for (int i = 0; i < arrayObt.length; i++) {
			if (((double) arrayObt[i]) > promedio) {
				cantMayores++;
			}
		}

		double[] mayoresQuePromedio = new double[cantMayores];

		cantMayores -= 1;
		for (int i = 0; i < arrayObt.length; i++) {
			if (((double) arrayObt[i]) > promedio) {
				mayoresQuePromedio[cantMayores] = arrayObt[i];
				cantMayores--;
			}
		}

		return mayoresQuePromedio;
	}
}
