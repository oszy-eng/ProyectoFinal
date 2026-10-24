package test.java;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import gt.edu.umes.proy.calculo.LogicaDelNegocio;

public class CalculoSegundosTest {

    private LogicaDelNegocio logica = new LogicaDelNegocio();

    /**
     * Prueba 1: Debe detectar cuando se envían valores que no son enteros.
     */
    @Test
    void testParametrosInvalidos() {
        String[] argsInvalidos = {"1", "2", "abc", "4", "5"};

        boolean resultado = logica.validarParametros(argsInvalidos);

        // Esperamos que la validación falle (retorne false)
        assertFalse(resultado, "Debe detectar que hay un parámetro que no es entero");
    }

    /**
     * Prueba 2: Validar el cálculo correcto para 1 3 6 20 1
     * 1 mes + 3 semanas + 6 días + 20 horas + 1 minuto
     */
    @Test
    void testCalculoCorrecto() {
        long esperado = 1L * 30 * 24 * 60 * 60   // meses
                      + 3L * 7 * 24 * 60 * 60    // semanas
                      + 6L * 24 * 60 * 60        // días
                      + 20L * 60 * 60            // horas
                      + 1L * 60;                // minutos

        long resultado = logica.calcularSegundos(1, 3, 6, 20, 1);

        assertEquals(esperado, resultado, "El cálculo de segundos no es correcto");
    }
}