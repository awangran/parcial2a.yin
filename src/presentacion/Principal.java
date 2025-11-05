package presentacion;

import java.util.Scanner;

import logica.Parcial;

public class Principal {
	
	public Principal() {
		System.out.println("Parcial 2 Ashlee Yin ewe ");
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.println("𖤣.𖥧.𖡼.⚘𖤣.𖥧.𖡼.⚘𖤣.𖥧.𖡼.⚘𖤣.𖥧.𖡼.⚘𖤣.𖥧.𖡼.⚘𖤣.𖥧.𖡼.⚘𖤣.𖥧.𖡼.⚘ \n");

	    System.out.println("Bienvenido a la calculadora de ecuaciones de segundo orden! \n\n");

	    System.out.println("Ingresa los coeficientes a, b, c de tu ecuacion!! (Reales)-> \\n");

		Parcial parcial = new Parcial();
		
		System.out.print("Ingresa a: ");
	    double a = scanner.nextDouble();
	    
	    System.out.print("Ingresa b: ");
	    double b = scanner.nextDouble();
	     
	    System.out.print("Ingresa c: ");
	    double c = scanner.nextDouble();
		
		
	    System.out.println("\nResolviendo raices de la ecuacion: " + a + "x^2+" + b + "x+" + c +"\n");
	    System.out.println(parcial.resolverEcuacionSegundoOrden(a, b, c));
		
	    System.out.println("𖤣.𖥧.𖡼.⚘𖤣.𖥧.𖡼.⚘𖤣.𖥧.𖡼.⚘𖤣.𖥧.𖡼.⚘𖤣.𖥧.𖡼.⚘𖤣.𖥧.𖡼.⚘𖤣.𖥧.𖡼.⚘ \n");

	};
	
	

	
	
	public static void main(String[] args) {
		new Principal();
	};
}
