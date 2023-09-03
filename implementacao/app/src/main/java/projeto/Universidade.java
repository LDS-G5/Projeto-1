package projeto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Universidade {
    private String nome;
	private Map<String, Usuario> usuarios = new HashMap<String, Usuario>();
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

	public static void EncerraPeriodoDeMatricula() {
		instance.cursos.stream().forEach(Curso::encerraPeriodoDeMatricula);
	}

	public static List<Usuario> getUsuarios() {
		return instance.usuarios.values().stream().toList();
	}

	public static List<Curso> getCursos() {
		return instance.cursos;
	}

	public static void addUsuario(Usuario usuario) {
		instance.usuarios.put(usuario.getCpf(), usuario);
	}

	public static void addCurso(Curso curso) {
		instance.cursos.add(curso);
	}

	public static boolean login(String cpf, String senha) {
		return instance.usuarios.get(cpf).login(senha);
	}
}
