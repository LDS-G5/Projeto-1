package projeto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import projeto.menus.MenuProfessor;

public class Professor extends Usuario{
	List<Disciplina> disciplinas;

    public Professor(String nome, Date dataNascimento, String cpf, String telefone, String senha) {
        super(nome, dataNascimento, cpf, telefone, senha);
		disciplinas = new ArrayList<Disciplina>();
    }

    public void verificarMatriculados(List<Aluno> a){
        for(Aluno al :a){
            System.out.println(al.getNome());
        }
    }

	public boolean cadastrarDisciplina(Disciplina disciplina) {
		if (disciplinas.contains(disciplina)) {
			return false;
		}
		disciplina.addProfessor(this);
		disciplinas.add(disciplina);
		return true;
	}

	@Override
	protected void menuLogin() {
		MenuProfessor menu = new MenuProfessor(this);
		menu.menu();
	}
}
