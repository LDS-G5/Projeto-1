package projeto;

import java.util.ArrayList;
import java.util.List;

public class Universidade {
    private String nome;
	private List<Usuario> usuarios = new ArrayList<Usuario>();
	private List<Curso> cursos = new ArrayList<Curso>();
	private static Universidade instance = new Universidade();

	public static Universidade getInstance() {
		return instance;
	}

    public static String getNome() {
        return instance.nome;
    }

    public static void setNome(String nomeUni) {
        instance.nome = nomeUni;
    }

	public void EncerraPeriodoDeMatricula() {
	}

	public List<Usuario> getUsuarios() {
		return instance.usuarios;
	}

	public List<Curso> getCursos() {
		return instance.cursos;
	}

	public void addUsuario(Usuario usuario) {
		instance.usuarios.add(usuario);
	}

	public void addCurso(Curso curso) {
		instance.cursos.add(curso);
	}
}
