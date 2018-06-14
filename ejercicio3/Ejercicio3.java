package fempa.ejercicio3;

public class Ejercicio3 {

	String modelo = "Golf";
	String color = "Rojo";
	String llantas = "Aleación 17";
	String equipoSonido = "Pionner";
	String reproductorVideo = "Philips";
	String gps = "Tom Tom";

	Coche coche1 = new Coche.Builder().setModelo(this.modelo).setColor(this.color).setLlantas(this.llantas)
			.setEquipoSonido(this.equipoSonido).setRepdroductorVideo(this.reproductorVideo).setGps(this.gps).build();

	String color1 = "Rojo";
	String llantas1 = "Tapacubos";

	Coche coche2 = new Coche.Builder().setModelo(this.modelo).setColor(this.color1).setLlantas(this.llantas1)
			.setEquipoSonido(this.equipoSonido).setRepdroductorVideo(this.reproductorVideo).setGps(this.gps).build();
}