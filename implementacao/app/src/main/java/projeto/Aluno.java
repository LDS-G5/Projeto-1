package projeto;

import java.util.Date;

public class Aluno extends Usuario {

    public Aluno(String nome, Date dataNascimento, String cpf, String telefone) {
        super(nome, dataNascimento, cpf, telefone);
    }

	@Override
	public void menuLogin() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'menuLogin'");
	}
}
