package projeto;

public class Disciplina {
    private String nome;
	private boolean obrigatoria;
	private final int maxAlunos = 60;

	public Disciplina(String nome) {
        this.nome = nome;
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
