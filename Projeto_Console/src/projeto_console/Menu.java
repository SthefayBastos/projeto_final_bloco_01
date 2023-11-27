package projeto_console;

import java.io.IOException;
import java.util.Scanner;

import magicgaming.controller.ProdutoController;
import magicgaming.model.Comum_tipo;
import magicgaming.model.Incomum_tipo;
import magicgaming.model.Lendaria_tipo;
import magicgaming.model.Rara_tipo;

public class Menu {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		ProdutoController produto = new ProdutoController();

		int opcao, id, tipo, comum;
		String nome, incomum, rara, lendaria = "";
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
				System.out.println("3- Rara ");
				System.out.println("4- Lendária ");

				tipo = leia.nextInt();

				System.out.println("Digite o preço da carta: ");
				preco = leia.nextDouble();

				switch (tipo) {

				case 1 -> {
					leia.skip("\\R");
					System.out.println("Digite o ano da edição: ");
					comum = leia.nextInt();
					produto.criarProduto(new Comum_tipo(produto.gerarId(), tipo, nome, preco, comum));
				}
				case 2 -> {
					leia.skip("\\R");
					System.out.println("Digite o Autor da arte da carta: ");
					incomum = leia.nextLine();
					produto.criarProduto(new Incomum_tipo(produto.gerarId(), tipo, nome, preco, incomum));
				}
				case 3 -> {
					leia.skip("\\R");
					System.out.println("Digite o tipo de Foil que esta carta carrega: ");
					rara = leia.nextLine();
					produto.criarProduto(new Rara_tipo(produto.gerarId(), tipo, nome, preco, rara));
				}
				case 4 -> {
					leia.skip("\\R");
					System.out.println("Digite o personagem da carta lendária: ");
					incomum = leia.nextLine();
					produto.criarProduto(new Lendaria_tipo(produto.gerarId(), tipo, nome, preco, lendaria));
				}
				}
				keyPress();
			}
			case 2 -> {
				System.out.println(" Lista dos produtos cadastrados: ");
				produto.listarTodosProdutos();

				keyPress();
			}
			case 3 -> {
				System.out.println("Consultar produto. ");
				System.out.println("Digite o ID do produto: ");

				id = leia.nextInt();

				produto.consultarProdutoId(id);

				keyPress();
			}
			case 4 -> {
				System.out.println("Atualizar produto no estoque: ");

				System.out.println("Digite o ID do produto: ");

				id = leia.nextInt();
					if (produto.buscarNaList(id).isPresent()) {
					System.out.println("Digite o nome do produto: ");
					leia.skip("\\R");
					nome = leia.nextLine();

					System.out.println("Digite o nome do produto: ");

					leia.skip("\\R");

					nome = leia.nextLine();

					System.out.println("Digite o tipo do produto: ");
					System.out.println("1- Comum ");
					System.out.println("2- Incomum ");
					System.out.println("3- Rara ");
					System.out.println("4- Lendária ");

					tipo = leia.nextInt();

					System.out.println("Digite o preço do produto: ");
					preco = leia.nextDouble();

					switch (tipo) {

					case 1 -> {
						leia.skip("\\R");
						System.out.println("Digite o ano da edição: ");
						comum = leia.nextInt();
						produto.atualizarProduto(new Comum_tipo(produto.gerarId(), tipo, nome, preco, comum));
					}
					case 2 -> {
						leia.skip("\\R");
						System.out.println("Digite o Autor da arte da carta: ");
						incomum = leia.nextLine();
						produto.atualizarProduto(new Incomum_tipo(produto.gerarId(), tipo, nome, preco, incomum));
					}
					case 3 -> {
						leia.skip("\\R");
						System.out.println("Digite o tipo de Foil que esta carta carrega: ");
						rara = leia.nextLine();
						produto.atualizarProduto(new Rara_tipo(produto.gerarId(), tipo, nome, preco, rara));
					}
					case 4 -> {
						leia.skip("\\R");
						System.out.println("Digite o personagem da carta lendária: ");
						incomum = leia.nextLine();
						produto.atualizarProduto(new Lendaria_tipo(produto.gerarId(), tipo, nome, preco, lendaria));

						keyPress();
					}
					}
					}

			}
			case 5 -> {
				System.out.println("Excluir produto: ");

				System.out.println("Digite o número ID do produto: ");

				id = leia.nextInt();

				produto.deletarProduto(id);

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
