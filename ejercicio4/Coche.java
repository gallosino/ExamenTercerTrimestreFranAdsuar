package fempa.ejercicio4;

public class Coche {
	protected String modelo;
	protected String color;
	protected String llantas;
	protected String gps;

	public Coche() {
		this.modelo = null;
		this.color = null;
		this.llantas = null;
		this.gps = null;

	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getLlantas() {
		return llantas;
	}

	public void setLlantas(String llantas) {
		this.llantas = llantas;
	}

	public String getGps() {
		return gps;
	}

	public void setGps(String gps) {
		this.gps = gps;
	}
}