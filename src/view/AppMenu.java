package view;

import java.util.Scanner;

import controller.ClienteController;

public class AppMenu {
	public static Scanner scanner = new Scanner(System.in);
	
	public static void showMainMenu() {
		Boolean breakApp = false;
		do {
			System.out.println("=== Menu Principal ===");
			System.out.println("[1] => Cliente");
			System.out.println("[2] => Conta");
			System.out.println("[3] => Relatorios");
			System.out.println("[4] => Encerrar");
			
			System.out.print("Opcao: ");
			Integer option = scanner.nextInt();
		
			switch (option) {
				case 1 -> clientMenu();
		
				case 2 -> accountMenu();

				case 3 -> reportMenu();

				case 4 -> breakApp = true;

				default -> System.out.println("Opção Inválida");
			}
		} while (!breakApp);
	}
	
	private static void clientMenu() {
		ClienteController controller = new ClienteController();
		
		System.out.println();
		System.out.println("=== MENU CLIENTE ===");
		System.out.println("[1] => Novo cadastro");
		System.out.println("[2] => Clientes Cadastrados");
		System.out.println("[3] => Excluir Cliente");
		System.out.println("[4] => Retornar ao menu principal");
		
		Boolean returnMainMenu = false;
		do {
			System.out.print("Opcao: ");
			Integer option = scanner.nextInt();
		
			switch (option) {
				case 1 -> {
					String nome = scanner.nextLine();
					nome = scanner.nextLine();
					controller.criarCliente(nome);
				}
		
				case 2 -> controller.listarClientes();

				case 3 -> controller.removerCliente();

				case 4 -> returnMainMenu = true;

				default -> System.out.println("Opção Inválida");
			}
		} while (!returnMainMenu);
	}
	
	private static void accountMenu() {
		System.out.println("Teste cliente Menu");
	}
	
	private static void reportMenu() {
		System.out.println("Teste cliente Menu");
	}
}
