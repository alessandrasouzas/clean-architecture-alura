package br.com.alura.escola.infra.aluno;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import br.com.alura.escola.dominio.aluno.CifradorSenha;

public class CrifradorSenhaomMD5 implements CifradorSenha{

	@Override
	public String cifrarSenha(String senha) {
		 try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(senha.getBytes());
			byte[] bytes = md.digest();
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < bytes.length; i++) {
				sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(i));				
			}
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException("Erro ao gerar hash da senha");
		}
		 
		return null;
	}

	@Override
	public boolean validarSenhaCifrada(String senhacifrada, String senha) {
		return senhacifrada.equals(cifrarSenha(senha));
	}

}
