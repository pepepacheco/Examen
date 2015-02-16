package examenB;

import java.util.ArrayList;

public class Modulo {
	private static String nombre;
	private int horas;
	private static String profesor;
	private static ArrayList<Alumno> alumnos;
	/**
	 * @param nombre
	 * @param horas
	 * @param profesor
	 * @param alumnos
	 */
	public Modulo(String nombre, int horas, String profesor)
	{
		this.nombre = nombre;
		this.horas = horas;
		this.profesor = profesor;
		alumnos = new ArrayList<Alumno>();
		
	}
	/**
	 * @return the nombre
	 */
	public static String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the horas
	 */
	public int getHoras() {
		return horas;
	}
	/**
	 * @param horas the horas to set
	 */
	public void setHoras(int horas) {
		this.horas = horas;
	}
	/**
	 * @return the profesor
	 */
	public static String getProfesor() {
		return profesor;
	}
	/**
	 * @param profesor the profesor to set
	 */
	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}
	/**
	 * @return the alumnos
	 */
	public static ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}
	/**
	 * @param alumnos the alumnos to set
	 */
	public void setAlumnos(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	public void meter (Alumno alum)
	{
		alumnos.add(alum);
	}
	public boolean esta (Alumno alum)
	{
		return alumnos.contains(alum);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MODULO: " + nombre + " PROFESOR: " + profesor+ " ALUMNO: " + alumnos;
	}
}
