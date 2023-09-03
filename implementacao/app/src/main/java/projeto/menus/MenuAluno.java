package projeto.menus;

import java.util.Scanner;

import projeto.Aluno;

public class MenuAluno {
	Scanner scanner = new Scanner(System.in);
	Aluno aluno;

	public MenuAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public void menu() {
		System.out.println("Menu Aluno");
	}
}
