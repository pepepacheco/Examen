package examenB;

public class Profesor {
	private String nombre;
	private String primerApellido;
	private int edad;
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the primerApellido
	 */
	public String getPrimerApellido() {
		return primerApellido;
	}
	/**
	 * @param primerApellido the primerApellido to set
	 */
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * @param nombre
	 * @param primerApellido
	 * @param edad
	 */
	public Profesor(String nombre, String primerApellido, int edad) {
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.edad = edad;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "nombre: "+nombre + primerApellido;
	}
	
	
}
