package magliarelli.utilizacion;

import java.util.InputMismatchException;
import java.util.Scanner;

import magliarelli.framework.Accion;

public class Suma implements Accion {

	@Override
	public void ejecutar() {
		int num1 = 0;
		int num2 = 0;
		System.out.println("Ejecutando SUMA...");
		try {
			System.out.println("Ingrese el primer numero: ");
			Scanner sc1 = new Scanner(System.in);
			num1 = sc1.nextInt();
			System.out.println("Ingrese el segundo numero: ");
			Scanner sc2 = new Scanner(System.in);
			num2 = sc2.nextInt();
			System.out.println("El resultado de la SUMA es de: " + sumar(num1, num2));
		} catch (InputMismatchException e) {
			System.out.println("Ingrese un número válido");
		}

	}

	@Override
	public String nombreItemMenu() {
		return "SUMA";
	}

	@Override
	public String descripcionItemMenu() {
		return "Implementa una suma entre dos numeros.";
	}

	public int sumar(int a, int b) {
		return a + b;
	}
}
