package projeto.menus;

import projeto.Secretario;

/**
 * MenuSecretario
 */
public class MenuSecretario {
	Secretario secretario;

	public MenuSecretario(Secretario secretario) {
		this.secretario = secretario;
	}

	public void menu() {
		System.out.println("Menu Secretario");
	}
}
