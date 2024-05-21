package herencia;

public class Empleado extends Persona{
	int legajo;
	String cargo;
	int sueldo;
	public Empleado() {
		super();
	}
	public Empleado(int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
		super(id, dni, nombre, apellido, domicilio, telefono);
		this.legajo=legajo;
		this.cargo=cargo;
		this.sueldo=sueldo;
	}
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getSueldo() {
		return sueldo;
	}
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
			
}
