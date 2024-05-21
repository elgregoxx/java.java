package colass;
import java.util.Scanner;
public class EJERCIVCIOVECTOOOOOR {

	public static void main(String[] args) {
		int vector[]=new int[15];
		int contador=0;
		Scanner teclado=new Scanner(System.in);
		for(int i=0;i<15;i++) {
			System.out.println("ingrese in numero para la posicion"+i);
			vector[i]=teclado.nextInt();}
			
		for(int i=0;i<15;i++) {
			if (vector[i]==3) {
				contador= contador+1;
				
			
		}
			
		}
	System.out.println("el tres se ingreso"+contador+"veces");
	}

}
