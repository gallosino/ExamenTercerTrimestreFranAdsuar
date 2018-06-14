package fempa.ejercicio7;

public class Ejercicio7 {

	public static void main(String[] args) {
		Bicicleta bici1 = new BicicletaTrek();
		Bicicleta bici2 = new BicicletaBH();
		Cambio cambio1 = new CambioShimano();
		Cambio cambio2 = new CambioCampagnolo();
		bici1.setCambio(cambio1);
		bici1.setCambio(cambio2);
		bici2.setCambio(cambio1);
		bici2.setCambio(cambio2);
	}

}
