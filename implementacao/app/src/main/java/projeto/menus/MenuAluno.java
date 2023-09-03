package projeto.menus;

import java.util.List;
import java.util.Scanner;

import projeto.Aluno;
import projeto.Disciplina;

public class MenuAluno {
	Scanner scanner = new Scanner(System.in);
	Aluno aluno;

	public MenuAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public void menu() {
		int opcao =99;
		while(opcao != 0) {
			System.out.println("Digite qual opção deseja");
			System.out.println("1- Ver disciplinas");
			System.out.println("2- Matricular em uma disciplina");
			System.out.println("3- Cancelar matricula");
			System.out.println("0- Encerrar");
			opcao = scanner.nextInt();

			switch (opcao) {
				case 1:
					System.out.println("Qual disciplina?");

					String nome = scanner.next();
//					for(Disciplina a : listDisciplina){
//						System.out.println(a.getNome());
//					}

					break;
				case 2:

					break;
				case 3:

					break;
				case 0:
					System.out.println("encerrar");
					break;

				default:
					System.out.println("Opção invalida");
			}
		}
	}
}
