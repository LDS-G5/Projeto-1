package projeto.menus;

import java.util.Scanner;

import projeto.Professor;

/**
 * MenuProfessor
 */
public class MenuProfessor {
	Scanner scanner = new Scanner(System.in);
	
	Professor professor;

	public MenuProfessor(Professor professor) {
		this.professor = professor;
	}

	public void menu() {
		int opcao =99;
		while(opcao != 0) {
			System.out.println("Digite qual opção deseja");
			System.out.println("1- Ver alunos matriculados");
			System.out.println("2- Ver disciplinas");
			System.out.println("0- Encerrar");
			opcao = scanner.nextInt();

			switch (opcao) {
				case 1:
//					professor.verificarMatriculados();


					break;
				case 2:
//				implentar logica disciplinas
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
