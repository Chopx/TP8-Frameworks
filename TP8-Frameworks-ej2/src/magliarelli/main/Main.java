package magliarelli.main;

import magliarelli.framework.Menu;

public class Main {

	public static void main(String[] args) {
		System.out.println("Aplicación de cuentas");
		Menu p = new Menu("../utilizacion/configuracion_framew.txt");
		p.menu();
	}
}
