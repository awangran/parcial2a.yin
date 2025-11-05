package logica;

public class Parcial {
	
	public String resolverEcuacionSegundoOrden(int a, int b, int c) {
		
		String respuesta = "";

		// excepcion no deividir por 0
		if (a == 0) {
		    throw new IllegalArgumentException("a no puede ser 0");
		}

		// discriminante que puede ser negativo
		Double disc = Math.pow(b, 2) - 4 * a * c;

	
		if (disc < 0) {
		    throw new IllegalArgumentException("Las raices son imaginarias porque el discriminante es negativo.");
		}

		// calculo soluciones
		Double solucion1 = (-b + Math.sqrt(disc)) / (2 * a);
		Double solucion2 = (-b - Math.sqrt(disc)) / (2 * a);

		
		if (Double.compare(solucion1, solucion2) == 0) {
		    respuesta = "Solo hay una raiz: " + solucion1;
		} else {
		    respuesta = "Las raices son: " + solucion1 + " y " + solucion2;
		}
		
		
		return respuesta;
		
	}

}
