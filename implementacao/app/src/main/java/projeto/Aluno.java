package projeto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import projeto.menus.MenuAluno;

public class Aluno extends Usuario {
	List<Disciplina> disciplinas;

    public Aluno(String nome, Date dataNascimento, String cpf, String telefone) {
        super(nome, dataNascimento, cpf, telefone);
		disciplinas = new ArrayList<Disciplina>();
	}

	public boolean matricular(Disciplina disciplina) {
		boolean matriculou = false;
		if (disciplina.isObrigatoria()) {
			matriculou = disciplinas.stream().filter(Disciplina::isObrigatoria).count() < 4;
		}
		else {
			matriculou = disciplinas.stream().filter((d) -> !d.isObrigatoria()).count() < 2;
		}
		if (matriculou) {
			disciplinas.add(disciplina);
		}
		return matriculou;
	}

	public boolean cancelarMatricula(Disciplina disciplina) {
		return disciplinas.remove(disciplina);
	}

	@Override
	public void menuLogin() {
		MenuAluno menu = new MenuAluno(this);
		menu.menu();
	}
}
