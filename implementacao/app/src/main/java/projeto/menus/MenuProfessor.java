package projeto.menus;

import projeto.Professor;

/**
 * MenuProfessor
 */
public class MenuProfessor {
	Professor professor;

	public MenuProfessor(Professor professor) {
		this.professor = professor;
	}

	public void menu() {
		System.out.println("Menu Professor");
	}
}
