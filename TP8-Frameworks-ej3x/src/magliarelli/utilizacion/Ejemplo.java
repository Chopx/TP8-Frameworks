package magliarelli.utilizacion;

import magliarelli.frameworkv2.Accion;

public class Ejemplo implements Accion {

	@Override
	public String descripcionItemMenu() {
		return "ejemplo desc";
	}

	@Override
	public void ejecutar() {
		System.out.println("ejemplo");
	}

	@Override
	public String nombreItemMenu() {
		return "ejemplo nom";
	}

}
