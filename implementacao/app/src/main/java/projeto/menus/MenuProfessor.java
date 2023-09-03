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
		System.out.println("Menu Professor");
	}
}
