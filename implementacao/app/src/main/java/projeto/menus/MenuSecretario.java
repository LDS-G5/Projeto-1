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
		System.out.println("Menu Secretario");
	}
}
