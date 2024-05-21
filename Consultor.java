package herencia;

public class Consultor extends Persona {
	String nombreconsultora;
	int nrodeconsultor;
	public Consultor() {
		super();
	}
	public Consultor(int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
		super(id, dni, nombre, apellido, domicilio, telefono);
		
		this.nombreconsultora=nombreconsultora;
		this.nrodeconsultor=nrodeconsultor;
	}
	public String getNombreconsultora() {
		return nombreconsultora;
	}
	public void setNombreconsultora(String nombreconsultora) {
		this.nombreconsultora = nombreconsultora;
	}
	public int getNrodeconsultor() {
		return nrodeconsultor;
	}
	public void setNrodeconsultor(int nrodeconsultor) {
		this.nrodeconsultor = nrodeconsultor;
	}
	
	

}
