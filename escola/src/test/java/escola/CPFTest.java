package escola;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CPFTest {

    @Test
    void shouldNotCreateCPFWithInvalidNumbers() {
        assertThrows(IllegalArgumentException.class,
            () -> new CPF(null));

        assertThrows(IllegalArgumentException.class,
            () -> new CPF(""));

        assertThrows(IllegalArgumentException.class,
            () -> new CPF("12345678900"));
    }
    
    
    @Test
    void shouldCreateCPFWithValidNumber() {
		String numero = "123.456.789-00";
		CPF cpf = new CPF(numero);
		assertEquals(numero, cpf.getNumero());
    }
}
