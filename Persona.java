package herencia;

public class Persona {
	int id;
	String dni;
	String nombre;
	String Apellido;
	String domicilio;
	String telefono;
	public Persona() {
		super();
	}
	public Persona(int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
		super();
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		Apellido = apellido;
		this.domicilio = domicilio;
		this.telefono = telefono;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	

}

