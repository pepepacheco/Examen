package examenB;

import java.util.Arrays;

public class Curso {
	private String nombre;
	public static Modulo[] array;
	/**
	 * @param nombre
	 */
	public Curso(String nombre) {
		this.nombre = nombre;
		array = new Modulo[3];
	}
	public static void meter(int pos, Modulo mod)
	{
		array[pos]=mod;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MODULO: " + Modulo.getNombre() + " PROFESOR: " +Modulo.getProfesor()+ " N ALUMNOS: "+Modulo.getAlumnos().size();
	}
	public static void main(String[] args) {
		Modulo m1 = new Modulo("Prog", 4, "Manolillo");
		Modulo m2 = new Modulo("Sistemas", 2, "Juanjo");
		Alumno a1 = new Alumno("Pako", "Jones Gordos", 19);
		Alumno a2 = new Alumno("asdas", "asasds zxdfss", 700);
		Curso c1 = new Curso("DAM");
		m1.meter(a1);
		m1.meter(a2);
		m2.meter(a2);
		array.meter();
		System.out.println(c1);
	}

}
