package projeto;

import java.util.Date;
import java.util.List;

public class Professor extends Usuario{

    public Professor(String nome, Date dataNascimento, String cpf, String telefone) {
        super(nome, dataNascimento, cpf, telefone);
    }
    public void verificarMatriculados(List<Aluno> a){
        for(Aluno al :a){
            System.out.println(al.getNome());
        }
    }
	@Override
	public void menuLogin() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'menuLogin'");
	}
}
