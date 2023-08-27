package projeto;
import java.util.List;

public class Curso {
    private String nome;
    private  int creditos;
    private List<Disciplina> listDisciplinas;

    public Curso(String nome, int creditos, List<Disciplina> listDisciplinas) {
        this.nome = nome;
        this.creditos = creditos;
        this.listDisciplinas = listDisciplinas;
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

    public List<Disciplina> getListDisciplinas() {
        return listDisciplinas;
    }

    public void setListDisciplinas(List<Disciplina> listDisciplinas) {
        this.listDisciplinas = listDisciplinas;
    }
}
