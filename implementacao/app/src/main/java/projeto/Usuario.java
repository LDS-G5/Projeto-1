package projeto;

import java.util.Date;

public abstract class Usuario {
    private String nome;
	private String senha;
    private Date dataNascimento;
    private String cpf;
    private String telefone;

    public Usuario(String nome, Date dataNascimento, String cpf, String telefone, String senha) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.telefone = telefone;
		this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

	public boolean login(String senha) {
		if (this.senha.equals(senha)) {
			menuLogin();
			return true;
		}
		return false;
	}

	protected abstract void menuLogin();
}
