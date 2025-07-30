//7.
//Parte 6: Crear el método main (3 puntos)
//
//Paso 1. Llamar al método crearArray() guardar el array que devuelve en una variable
//
//Paso 2. Llamar al método mostrarArray pasando el array obtenido
//
//Paso 3. Llamar al método calcularPromedio pasando el array obtenido y mostrar el resultado devuelto
//
//Paso 4. Llamar al método calcularPromedio pasando el array obtenido y mostrar el resultado devuelto
//
//Paso 5. Llamar al método encontrarExtremos pasando el array obtenido y mostrar el resultado devuelto
//
//Paso 6. Llamar al método filtrarMayoresQuePromedio pasando el array obtenido y mostrar el resultado devuelto;

package p.v.examen;

import java.util.Scanner;

public class Examen {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arrayObt = UtilidadesExamen.crearArray(sc);

		System.out.println("\nLos valores del array son:");
		UtilidadesExamen.mostrarArray(arrayObt);

		System.out.println("\nEl valor promedio del array es:");
		UtilidadesExamen.mostrarArray(UtilidadesExamen.calcularPromedio(arrayObt));

		System.out.println("\nLos valores maximo y minimo son:");
		UtilidadesExamen.mostrarArray(UtilidadesExamen.encontrarExtremos(arrayObt));
	
		System.out.println("\nEl/los valor/valores mayor/mayores que el promedio son:");
		UtilidadesExamen.mostrarArray(UtilidadesExamen.filtrarMayoresQuePromedio(arrayObt));
		
		sc.close();
		System.out.println("\nPrograma cerrado");
	}

}
