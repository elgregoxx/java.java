package colass;

public class Alumno {
	int id;
	String nombre;
	String apellido;
	// los metod	os son las acciones contenidas en una clase y definen su comportamiento}
	// metodos constructores u objetos
	// un objeto es una instancia de una clase y tiene un estado segun sus atributos tmb tiene un comportamiento
	// gralmente representa un objeto real
	// los metodos constructores spn funciones especiales que contienen las clases para crear objetos
	// pueden recibir o no datos o parametros
	// no retornan valores
	public Alumno() {
		super();
	}
	//como diferencia las variables si tienen el mismo nombre??->con la palabra reservada this esto hace que le diga que le asigne el valor que recibe ahoparametro
	//las variables de arriba son globales las uso donde quiera pero esras solo aca
	public Alumno(int id, String nombre, String apellido) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public int getId() {// get es para obtener los datos para usarlos o mostrarlos por pantalla
		//cpn el setter puedo colocar o establecer valores a cadaa atributo,se usa para objetos vacios o si lo quiero modificar
		return id;
	}//set recibe pero no retorna	
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public	void mostrarNombre() {
		System.out.println("soy un alumno ");
		
	}
	
	
	}
	