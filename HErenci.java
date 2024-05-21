package herencia;
//una clase que hereda contiene los atributos de la clase madrre y puede teener los propios
//polimorfismo cuando hay clases hijas que comparten clsse padre pueden permitir mezclar objetos de "diiferentes tipos"x	



public class HErenci {

	public static void main(String[] args) {
		Persona vector[]=new Persona[5];
		vector [0]=new Empleado();
		vector [1]=new Consultor();
		Persona perso=new Persona();
		Consultor consu=new Consultor();
		perso=consu;
		//consu=perso;//no se puede igualar la clase hijo a la clasr madre
			}

}
