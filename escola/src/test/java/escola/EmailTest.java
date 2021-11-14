package escola;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class EmailTest {

	@Test
	void shouldNotCreateEmailsWithInvalidAddress() {
		assertThrows(IllegalArgumentException.class, () -> new Email(null));
		assertThrows(IllegalArgumentException.class, () -> new Email(""));
		assertThrows(IllegalArgumentException.class, () -> new Email("emailInvalido"));
	}
	
	@Test
	void shouldCreateEmailsWithValidAddress() {		
		String endereco = "joaozinho@alura.com.br";
		Email email = new Email(endereco);
		assertEquals(endereco, email.getEndereco());
	}

}
