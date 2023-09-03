package projeto;
import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private int creditos;
    private List<Disciplina> disciplinas;

    public Curso(String nome, int creditos, List<Disciplina> listDisciplinas) {
        this.nome = nome;
        this.creditos = creditos;
        this.disciplinas = listDisciplinas;
    }

    public Curso(String nome, int creditos) {
		this.nome = nome;
		this.creditos = creditos;
		this.disciplinas = new ArrayList<Disciplina>();
	}

	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> listDisciplinas) {
        this.disciplinas = listDisciplinas;
    }

	public void encerraPeriodoDeMatricula() {
		disciplinas.stream().forEach(Disciplina::encerraPeriodoDeMatricula);
	}
}
