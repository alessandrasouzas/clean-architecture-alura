package escola;

public class Email {

	//VALUE OBJECT
		
	private String endereco;

	public Email(String endereco) {
		if(endereco == null || !endereco.matches("/^[a-z0-9.]+@[a-z0-9]+\\.[a-z]+\\.([a-z]+)?$/i"))
			throw new IllegalArgumentException("Email Inválido");
		this.endereco = endereco;
	}

}
