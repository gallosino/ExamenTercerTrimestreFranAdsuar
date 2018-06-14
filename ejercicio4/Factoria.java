package fempa.ejercicio4;

public class Factoria {
	public static Coche gettTipoCoche(String tipo, String modelo, String color, String llantas, String gps) {
		switch (tipo.toLowerCase()) {
		case "CocheHibrido":
			CocheHibrido hib = new CocheHibrido();
			hib.setModelo(modelo);
			hib.setColor(color);
			hib.setLlantas(llantas);
			hib.setGps(gps);

			return (hib);
		case "CocheGasolina":
			CocheGasolina gas = new CocheGasolina();
			gas.setModelo(modelo);
			gas.setColor(color);
			gas.setLlantas(llantas);
			gas.setGps(gps);

			return (gas);
		}

		return (null);
	}
}
