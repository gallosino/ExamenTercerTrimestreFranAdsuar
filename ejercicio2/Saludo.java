package fempa.ejercicio2;

public class Saludo {

	private static final Singleton instance = new Saludo();

	private Saludo() {
	}

	public static Singleton getInstance() {
		return (instance);
	}

	public static void saludar() {
		System.out.println("¡Hola amigos!");
	
	}
