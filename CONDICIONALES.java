package colass;

import java.util.Scanner;

public class CONDICIONALES {
public static void main(String[] args) {
		//switch se usa permite multiples caminos atravez de una sola condicion
	int dia=5;
	Scanner teclade=new Scanner (System.in);
		dia=teclade.nextInt();
	   
	   String nombredia;
	   switch(dia) {
	   		case 1:nombredia="lunes";
	   		break;
	   		case 2:nombredia="martes";
	   		break;
	   		case 3:nombredia="mierciles";
	   		break;
	   		case 4:nombredia="jueves";
	   		break;
	   		case 5: nombredia="viernes";
	   		break;
	   }
	   
		//ternario
		// se usa para tomar decisiones simples en una lunea de codigo
				// puede tomar deciciones basadas en una cndicion y asignar un valor a una variable dependiendo si este es verdadero o falso
					
				/*double promedio;
				String condicion;
				Scanner teclado=new Scanner(System.in);
				System.out.println("ingrese el pormedio dl alumno; ");
				promedio=teclado.nextDouble();
				condicion=promedio>=6?"aprobado":"desaprobado";
				System.out.println("la condicion final es "+ condicion);*/
	   //EJERCICIO
	   

	}

}
