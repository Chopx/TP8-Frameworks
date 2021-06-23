package magliarelli.framework;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

public class Menu {

	private List<Accion> accion = new ArrayList<>();

	public Menu(String ubicacionFrame) {
		Properties prop = new Properties();
		try (InputStream configFile = getClass().getResourceAsStream(ubicacionFrame);) {
			prop.load(configFile);
			String clase = prop.getProperty("items");
			String[] div = clase.split(";");
			for (int i = 0; i < div.length; i++) {
				Class c = Class.forName(div[i]);
				this.accion.add((Accion) c.getDeclaredConstructor().newInstance());
			}

		} catch (Exception e) {
			throw new RuntimeException("Error con la instancia de items");
		}
	}

	public void menu() {
		int num = 0;
		int pos;
		while (num != accion.size() + 1) {
			pos = 0;
			for (int i = 0; i < accion.size(); i++) {
				pos = i;
				System.out.println((pos + 1) + ". " + accion.get(i).nombreItemMenu() + " ("
						+ accion.get(i).descripcionItemMenu() + ")");

			}

			System.out.println((accion.size() + 1) + "." + " Salir");
			Scanner sc = new Scanner(System.in);

			try {
				num = sc.nextInt();
				if ((num > 0) && (num <= accion.size())) {
					accion.get(num - 1).ejecutar();
				} else {
					if ((num <= 0) || ((num > accion.size() + 1))) {
						System.out.println("El numero ingresado no es válido");
					}
				}
			} catch (InputMismatchException e) {
				System.out.println("Ingrese un número válido");
			}

		}

		System.out.println("Salio del Menu");
	}

}
