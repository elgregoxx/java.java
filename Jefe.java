package herencia;

public class Jefe extends Persona {
	int idjefe;
	String dtojefe;
	public Jefe() {
		super();
	}
	public Jefe(int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
		super(id, dni, nombre, apellido, domicilio, telefono);
		this.idjefe = idjefe;
		this.dtojefe = dtojefe;
		
	}
	public int getIdjefe() {
		return idjefe;
	}
	public void setIdjefe(int idjefe) {
		this.idjefe = idjefe;
	}
	public String getDtojefe() {
		return dtojefe;
	}
	public void setDtojefe(String dtojefe) {
		this.dtojefe = dtojefe;
	}


}
