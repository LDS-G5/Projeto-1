package projeto;

import java.util.List;

public class Turma {
    private int maxAlunos;
    private Professor professor;
    private  Disciplina disciplina;
    private List<Aluno> listAluno;

    public Turma(int maxAlunos, Professor professor, Disciplina disciplina, List<Aluno> listAluno) {
        this.maxAlunos = maxAlunos;
        this.professor = professor;
        this.disciplina = disciplina;
        this.listAluno = listAluno;
    }

    public int getMaxAlunos() {
        return maxAlunos;
    }

    public void setMaxAlunos(int maxAlunos) {
        this.maxAlunos = maxAlunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public List<Aluno> getListAluno() {
        return listAluno;
    }

    public void setListAluno(List<Aluno> listAluno) {
        this.listAluno = listAluno;
    }
}
