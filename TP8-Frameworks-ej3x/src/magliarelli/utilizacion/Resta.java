package magliarelli.utilizacion;

import java.util.InputMismatchException;
import java.util.Scanner;

import magliarelli.frameworkv2.Accion;

public class Resta implements Accion {

	@Override
	public void ejecutar() {
		int num1 = 0;
		int num2 = 0;
		System.out.println("Ejecutando RESTA...");
		try {
			System.out.println("Ingrese el primer numero: ");
			Scanner sc1 = new Scanner(System.in);
			num1 = sc1.nextInt();
			System.out.println("Ingrese el segundo numero: ");
			Scanner sc2 = new Scanner(System.in);
			num2 = sc2.nextInt();
			System.out.println("El resultado de la RESTA es de: " + resta(num1, num2));
		} catch (InputMismatchException e) {
			System.out.println("Ingrese un número válido");
		}

	}

	@Override
	public String nombreItemMenu() {
		return "RESTA";
	}

	@Override
	public String descripcionItemMenu() {
		return "Implementa una resta entre dos numeros.";
	}

	public int resta(int a, int b) {
		return a - b;
	}
}
