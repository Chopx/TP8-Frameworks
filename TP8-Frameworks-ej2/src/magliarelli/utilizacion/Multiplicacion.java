package magliarelli.utilizacion;

import java.util.InputMismatchException;
import java.util.Scanner;

import magliarelli.framework.Accion;

public class Multiplicacion implements Accion {

	@Override
	public void ejecutar() {
		int num1 = 0;
		int num2 = 0;
		System.out.println("Ejecutando MULTIPLICACION...");
		try {
			System.out.println("Ingrese el primer numero: ");
			Scanner sc1 = new Scanner(System.in);
			num1 = sc1.nextInt();
			System.out.println("Ingrese el segundo numero: ");
			Scanner sc2 = new Scanner(System.in);
			num2 = sc2.nextInt();
			System.out.println("El resultado de la MULTIPLICACION es de: " + multiplicar(num1, num2));
		} catch (InputMismatchException e) {
			System.out.println("Ingrese un número válido");
		}
	}

	@Override
	public String nombreItemMenu() {
		return "MULTIPLICACION";
	}

	@Override
	public String descripcionItemMenu() {
		return "Implementa una multiplicacion entre dos numeros.";
	}

	public int multiplicar(int a, int b) {
		return a * b;
	}

}
