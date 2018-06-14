package fempa.ejercicio3;

public class Coche {
	private String modelo;
	private String color;
	private String llantas;
	private String equipoSonido;
	private String repdroductorVideo;
	private String gps;

	public Coche() {
		this.modelo = null;
		this.color = null;
		this.llantas = null;
		this.equipoSonido = null;
		this.repdroductorVideo = null;
		this.gps = null;
	}

	public Coche(Builder builder) {
		this.modelo = builder.modelo;
		this.color = builder.color;
		this.llantas = builder.llantas;
		this.equipoSonido = builder.equipoSonido;
		this.repdroductorVideo = builder.repdroductorVideo;
		this.gps = builder.gps;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String _modelo) {
		this.modelo = _modelo;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String _color) {
		this.color = _color;
	}

	public String getLlantas() {
		return this.llantas;
	}

	public void setLlantas(String _llantas) {
		this.llantas = _llantas;
	}

	public String getEquipoSonido() {
		return this.equipoSonido;
	}

	public void setEquipoSonido(String _equipoSonido) {
		this.equipoSonido = _equipoSonido;
	}

	public String getRepdroductorVideo() {
		return this.repdroductorVideo;
	}

	public void setRepdroductorVideo(String _repdroductorVideo) {
		this.repdroductorVideo = _repdroductorVideo;
	}

	public String getGps() {
		return this.gps;
	}

	public void setGps(String _gps) {
		this.gps = _gps;
	}

	public static class Builder {
		private String modelo;
		private String color;
		private String llantas;
		private String equipoSonido;
		private String repdroductorVideo;
		private String gps;

		public Builder() {
		}

		public Builder setModelo(String _modelo) {
			this.modelo = _modelo;
			return this;
		}

		public Builder setColor(String _color) {
			this.color = _color;
			return this;
		}

		public Builder setLlantas(String _llantas) {
			this.llantas = _llantas;
			return this;
		}

		public Builder setEquipoSonido(String _equipoSonido) {
			this.equipoSonido = _equipoSonido;
			return this;
		}

		public Builder setRepdroductorVideo(String _repdroductorVideo) {
			this.repdroductorVideo = _repdroductorVideo;
			return this;
		}

		public Builder setGps(String _gps) {
			this.gps = _gps;
			return this;
		}

		public Coche build() {
			return new Coche(this);
		}

	}
}
