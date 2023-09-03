package projeto.menus;

import java.util.Scanner;

import projeto.Secretario;

/**
 * MenuSecretario
 */
public class MenuSecretario {
	Scanner scanner = new Scanner(System.in);
	
	Secretario secretario;

	public MenuSecretario(Secretario secretario) {
		this.secretario = secretario;
	}

	public void menu() {
		int opcao =99;
		while(opcao != 0) {
			System.out.println("Digite qual opção deseja");
			System.out.println("1- Cadastrar disciplinas");
			System.out.println("2- Gerar currículo");
			System.out.println("3- Gerenciar aluno");
			System.out.println("4- Gerenciar professor");
			System.out.println("0- Encerrar");
			opcao = scanner.nextInt();

			switch (opcao) {
				case 1:
					secretario.cadastrarDisciplinas();

					break;
				case 2:
					secretario.GerarCurriculo();
					break;
				case 3:
					secretario.gerenciarAluno();
					break;
				case 4:
					secretario.gerenciarProfessor();
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
