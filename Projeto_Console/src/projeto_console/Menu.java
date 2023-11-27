package projeto_console;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int opcao, id, tipo;
		String nome;
		double preco;
			
			do {
				// menu com opções
					System.out.println("|---------------------------------------------|");
					System.out.println("|                                             |");
					System.out.println("|                  MagicGaming                |");
					System.out.println("|                                             |");
					System.out.println("|---------------------------------------------|");
					System.out.println("|                                             |");
					System.out.println("|       1 - Criar Produto                     |");
					System.out.println("|       2 - Listar produtos                   |");
					System.out.println("|       3 - Consultar produto                 |");
					System.out.println("|       4 - Atualizar Produto                 |");
					System.out.println("|       5 - Excluir produto                   |");
					System.out.println("|       6 - Sair                              |");
					System.out.println("|                                             |");
					System.out.println("|---------------------------------------------|");
					System.out.println("| Entre com a opção desejada:                 |");
					System.out.println("|---------------------------------------------|");	
		
					opcao = leia.nextInt();					
			switch (opcao) {
			
			case 1 -> {
				System.out.println("Criar produto: ");
				System.out.println("Digite o nome do produto: ");
				leia.skip("\\R");
				nome = leia.nextLine();

				// definir tipo ( comum, incomum, rara, lendária)
				System.out.println("Digite o tipo do produto: ");
				System.out.println("1- Comum ");
				System.out.println("2- Incomum ");
				System.out.println("2- Rara ");
				System.out.println("2- Lendária ");
				tipo = leia.nextInt();

				System.out.println("Digite o preço da carta: ");
				preco = leia.nextDouble();
			}
			case 2 ->{
				System.out.println(" Lista dos produtos cadastrados: ");
				
				keyPress();
			}
			case 3 -> {
				System.out.println("Consultar produto. ");
				System.out.println("Digite o ID do produto: ");

				id = leia.nextInt();

				keyPress();
			}
			case 4-> {
				System.out.println("Atualizar produto no estoque: ");
				
				System.out.println("Digite o ID do produto: ");
				
				id = leia.nextInt();
					
				System.out.println("Digite o nome do produto: ");
				
				leia.skip("\\R");
				
				nome = leia.nextLine();
			}
			case 5 -> {
				System.out.println("Excluir produto: ");
				
				System.out.println("Digite o número ID do produto: ");
				
				id = leia.nextInt();
				
				keyPress();
			}
			case 6 -> {
				System.out.println("Sair do menu de opções!");
				sobre();
			}
			default -> {
				System.out.println("Opção inválida");
				keyPress();
			}
			
			}
			} while (opcao != 6);
	}
	// Escrever bloco de "sobre"
		public static void sobre() {

			System.out.println("|---------------------------------------------------------|");
			System.out.println("|Projeto Desenvolvido por: Sthefany Sousa                 |");
			System.out.println("|Sthefany Sousa -  sthefanysousageneration@gmail.com      |");
			System.out.println("|https://github.com/SthefayBastos                         |");
			System.out.println("|---------------------------------------------------------|");
		}
		// Implementar Keypress
		public static void keyPress() {
			try {

				System.out.println("Precione a tecla ENTER para continuar");
				System.in.read();

			} catch (IOException e) {
				System.out.println("Você pressionou uma tecla inválida!");
			}
		}
}
