package programaColaborativo;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion;
		double num1, num2, result;//Ger
		
		System.out.println("Bienvenido, trabajo de Germán Díaz y Manuel Martínez\n");
		
		do {
			
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicación");
			System.out.println("0. Salir");
			opcion = Leer.datoInt();
			
			switch (opcion) {
			
			case 1:
				System.out.println("Introduce un número para sumar: ");
				num1=Leer.datoDouble();
				
				System.out.println("Introduce otro número para sumarlo: ");
				num2=Leer.datoDouble();
				
				result=num1+num2;
				
				System.out.printf("%f + %f = %f \n", num1, num2, result);
				
			case 2:
				
			case 3:
				
			case 0:
				System.out.println("\n\nGracias por usar el programa.");
			default:
			
			}
			
		} while (opcion != 0);
		
	}

}
