package projeto;

import java.util.Date;

import projeto.menus.MenuSecretario;

public class Secretario extends Usuario{
    public Secretario(String nome, Date dataNascimento, String cpf, String telefone, String senha) {
        super(nome, dataNascimento, cpf, telefone, senha);
    }

    public void GerarCurriculo(){
    }

    public void cadastrarDisciplinas(){
    }

    public void gerenciarAluno(){
    }

    public void gerenciarProfessor(){
    }

	@Override
	protected void menuLogin() {
		MenuSecretario menu = new MenuSecretario(this);
		menu.menu();
	}
}
