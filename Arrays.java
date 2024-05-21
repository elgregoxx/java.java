package colass;
import java.util.Scanner;

public class Arrays {
//arrays son un conjunti de poscicones en memoria de amnera contigua con el mismo nombre pero diferentes indices
//hay dos tipos unidimencionakes que pueden tener filas o columas ej:vectores o bidimencionales donde tiene ambas como las matrices+
public static void main(String[]args) {
			//vectores declaracon
			int vector[]=new int [4];	
			//asignacion manual
		
			//axxsignacion por teclado
			Scanner teclado=new Scanner (System.in);
			for(int i=0; i<vector.length;i++) {
				System.out.println("ingrese numero para el indice "+i);
				vector[i]=teclado.nextInt();
				
				
			}
				//recorido
			for(int i=0; i<vector.length;i++){
				System.out.println("estoy en el indice"+i);
				System.out.println("tengo guardado un" + vector[i]);
				
			}
			//axxsignacion por teclado
}
		
}

