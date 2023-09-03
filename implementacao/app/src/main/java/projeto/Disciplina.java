package projeto;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
	private boolean obrigatoria;
	List<Aluno> alunos;
	List<Professor> professores;
	private final int maxAlunos = 60;

	public Disciplina(String nome) {
        this.nome = nome;
		alunos = new ArrayList<Aluno>();
		professores = new ArrayList<Professor>();
    }

	public boolean addAluno(Aluno aluno) {
		if (alunos.size() < maxAlunos) {
			alunos.add(aluno);
			return true;
		}
		return false;
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
}
