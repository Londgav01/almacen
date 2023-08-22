package co.uniquindio.almacen.model;

import java.util.Objects;

public class Persona {
	private String nombres;
	private String apellidos;
	private String identificacion;
	public Persona(String nombres, String apellidos, String identificacion) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.identificacion = identificacion;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Persona persona = (Persona) o;
		return Objects.equals(identificacion, persona.identificacion);
	}

	@Override
	public int hashCode() {
		return Objects.hash(identificacion);
	}
}
