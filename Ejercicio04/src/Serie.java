
public class Serie {
	
	private String titulo;
	private int numeroTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	/*
	 * Constructor por defecto
	 */
	public Serie() {
		this.titulo = "";
		this.numeroTemporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
	}
	
	/*
	 * Constructor 2 items:
	 * - Titulo
	 * - Creador
	 */
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = creador;
	}
	
	/*
	 * Creador 5 items:
	 * - Titulo
	 * - Numero Temporadas
	 * - Entregado
	 * - Genero
	 * - Creador
	 */
	public Serie(String titulo, int numeroTemporadas, boolean entregado, String genero, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadas;
		this.entregado = entregado;
		this.genero = genero;
		this.creador = creador;
	}

	// Getters
	
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	
	/**
	 * @return the numeroTemporadas
	 */
	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}

	/**
	 * @return the entregado
	 */
	public boolean isEntregado() {
		return entregado;
	}

	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * @return the creador
	 */
	public String getCreador() {
		return creador;
	}

}
