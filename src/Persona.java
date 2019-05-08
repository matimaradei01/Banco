
public class Persona {

	private String nombre;
	private String apellido;
	private String telefono;

	public Persona(String nombre, String apellido, String telefono) throws Exception {

		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;

		if (this.telefono.length() > 10 || this.telefono.length() < 10) {
			throw new Exception("El telefono tiene que tener 10 digitos");

		}
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
