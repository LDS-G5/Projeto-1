package projeto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Professor extends Usuario{
	List<Disciplina> disciplinas;

    public Professor(String nome, Date dataNascimento, String cpf, String telefone) {
        super(nome, dataNascimento, cpf, telefone);
		disciplinas = new ArrayList<Disciplina>();
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
