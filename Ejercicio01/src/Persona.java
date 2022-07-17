
public class Persona {

	public enum Gender {
		HOMBRE,
		MUJER,
		OTRO
	}
	
	private final Gender GENDER = Gender.HOMBRE;
	
	private String nombre;
	private int edad;
	private Persona.Gender sexo = GENDER;
	private Double peso;
	private Double altura;
	private String dni;
	
	/*
	 * Constructor por defecto
	 */
	public Persona(String dni) {
		this.nombre = "";
		this.edad = 0;
		this.peso = 0.00;
		this.altura = 0.00;
		this.dni = dni;
	}
	
	/*
	 * Constructor 
	 * - Nombre 
	 * - Edad 
	 * - Sexo
	 * - Dni
	 */
	public Persona(String nombre, int edad, String sexo, String dni) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = seleccionarSexo(sexo);
		this.peso = 0.00;
		this.altura = 0.00;
		this.dni = dni;
	}
	
	/*
	 * Constructor 
	 * - Nombre
	 * - Edad
	 * - Sexo 
	 * - Peso 
	 * - Altura
	 * - Dni
	 */
	public Persona(String nombre, Integer edad, String sexo, Double peso, Double altura, String dni) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = seleccionarSexo(sexo);
		this.peso = peso;
		this.altura = altura;
		this.dni = dni;
	}
	
	/* Getters & Setters */
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public Persona.Gender getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = seleccionarSexo(sexo);
	}
	
	public Double getPeso() {
		return peso;
	}
	
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	public Double getAltura() {
		return altura;
	}
	
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	
	/*
	 * Seleccionador de sexo
	 * - Masculino (default)
	 * - Femenino
	 * - Otro
	 */
	public Persona.Gender seleccionarSexo(String sexo) {
		
		switch (sexo.toUpperCase()) {
			case "MUJER":
				return Gender.MUJER;
			case "OTRO":
				return Gender.OTRO;
			default:
				return Gender.HOMBRE;
		}
		
	}
	
}
