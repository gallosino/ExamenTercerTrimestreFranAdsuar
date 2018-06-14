package fempa.ejercicio6;

public class PlacaInduccion {

	private Induccion elemento;

	public void calentarElemento() {
		System.out.println("Enviando calor al elemento");
		this.elemento.recibirCalorPorInduccion();
	}

	public Induccion getElemento() {
		return this.elemento;
	}

	public void setElemento(Induccion _elemento) {
		this.elemento = _elemento;
	}
}
