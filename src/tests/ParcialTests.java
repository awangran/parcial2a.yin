package tests;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import logica.Parcial;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;


class ParcialTests {
	
	private Parcial parcial;
	@BeforeEach
    void setUp( ) throws Exception
    {
		parcial = new Parcial();
    	
    }

    @AfterEach
    void tearDown( ) throws Exception
    {
    }

    @Test
    void raicesImaginarias() throws Exception 
    {
    	Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            parcial.resolverEcuacionSegundoOrden(1, 2, 3);
        });

        assertEquals("Las raices son imaginarias porque el discriminante es negativo.", exception.getMessage());    	
    }
    
    @Test
    void dividenteCero() throws Exception 
    {
    	Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            parcial.resolverEcuacionSegundoOrden(0, 2, 1); 
        });

        assertEquals("a no puede ser 0", exception.getMessage());
    }
    
    @Test
    void calculoRaicesDosSol() throws Exception 
    {
    	assertEquals("Las raices son: -2.0 y -2.5", parcial.resolverEcuacionSegundoOrden(2, 9, 10));

    }
    
    @Test
    void calculoRaicesUnaSol() throws Exception 
    {
    	assertEquals("Solo hay una raiz: 3.0", parcial.resolverEcuacionSegundoOrden(1, -6, 9));

    }


	

}
