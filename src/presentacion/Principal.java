package presentacion;

import java.util.Scanner;

import logica.Parcial;

public class Principal {
	
	public Principal() {
		System.out.println("Parcial 2 Ashlee Yin ewe ");
	    Scanner scanner = new Scanner(System.in);


		
		Parcial parcial = new Parcial();
		
		System.out.print("Ingresa a: ");
	    int a = scanner.nextInt();
	    
	    System.out.print("Ingresa b: ");
	    int b = scanner.nextInt();
	    
	    System.out.print("Ingresa c: ");
	    int c = scanner.nextInt();
		
		
	    System.out.print(parcial.resolverEcuacionSegundoOrden(a, b, c));
		
	};
	
	

	
	
	public static void main(String[] args) {
		new Principal();
	};
}
