package projeto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import projeto.menus.MenuAluno;

public class Aluno extends Usuario {
	List<Disciplina> disciplinas;

    public Aluno(String nome, Date dataNascimento, String cpf, String telefone, String senha) {
        super(nome, dataNascimento, cpf, telefone, senha);
		disciplinas = new ArrayList<Disciplina>();
	}

	public boolean matricular(Disciplina disciplina) {
		long obrigatoriasCount = disciplinas.stream().filter(Disciplina::isObrigatoria).count();
		long optativasCount = disciplinas.stream().filter(d -> !d.isObrigatoria()).count();
		if (obrigatoriasCount < 4 || optativasCount < 2) {
			return false;
		}
		if (disciplina.addAluno(this)) {
			disciplinas.add(disciplina);
			return true;
		}
		return false;
	}

	public boolean cancelarMatricula(Disciplina disciplina) {
		return disciplinas.remove(disciplina);
	}

	@Override
	protected void menuLogin() {
		MenuAluno menu = new MenuAluno(this);
		menu.menu();
	}
}
