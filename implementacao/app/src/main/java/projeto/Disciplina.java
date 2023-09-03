package projeto;

import java.util.ArrayList;
import java.util.List;

import projeto.enums.StatusDisciplina;

public class Disciplina {
    private String nome;
	private StatusDisciplina status = StatusDisciplina.Esperando;
	private boolean obrigatoria;
	private List<Aluno> alunos;
	private List<Professor> professores;
	private final int maxAlunos = 60;

	public Disciplina(String nome) {
        this.nome = nome;
		alunos = new ArrayList<Aluno>();
		professores = new ArrayList<Professor>();
    }

	public boolean addAluno(Aluno aluno) {
		if (status != StatusDisciplina.Esperando) {
			return false;
		}
		alunos.add(aluno);
		if (alunos.size() >= maxAlunos) {
			status = StatusDisciplina.Fechado;
		}
		return true;
	}

	public void addProfessor(Professor professor) {
		professores.add(professor);
	}

    public boolean isObrigatoria() {
		return obrigatoria;
	}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

	public void encerraPeriodoDeMatricula() {
		switch (status) {
			case Esperando:
				status = alunos.size() >= 3 ? StatusDisciplina.Ativo : StatusDisciplina.Cancelado;
				break;
			case Fechado:
				status = StatusDisciplina.Ativo;
				break;
			default:
				break;
		}
	}
}
