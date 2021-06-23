package magliarelli.utilizacion;

import java.util.InputMismatchException;
import java.util.Scanner;

import magliarelli.framework.Accion;

public class Division implements Accion {

	@Override
	public void ejecutar() {
		int num1 = 0;
		int num2 = 0;
		System.out.println("Ejecutando DIVISION...");
		try {
			System.out.println("Ingrese el primer numero: ");
			Scanner sc1 = new Scanner(System.in);
			num1 = sc1.nextInt();
			System.out.println("Ingrese el segundo numero: ");
			Scanner sc2 = new Scanner(System.in);
			num2 = sc2.nextInt();
			System.out.println("El resultado de la DIVISION es de: " + division(num1, num2));
		} catch (InputMismatchException e) {
			System.out.println("Ingrese un número válido");
		}
	}

	@Override
	public String nombreItemMenu() {
		return "DIVISION";
	}

	@Override
	public String descripcionItemMenu() {
		return "Implementa una division entre dos numeros.";
	}

	public float division(int a, int b) {
		float division = a / b;
		return division;
	}
}