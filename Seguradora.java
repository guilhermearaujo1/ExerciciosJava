import java.util.Scanner;

public class Seguradora {
	Scanner ler = new Scanner(System.in);
	public int tipoCliente;
	public String nome;

	public void imprimeMenu() {
		System.out.println("1- Cadastra Cliente");
		System.out.println("2- Cadastrar Contrato");
		System.out.println("3- Listar Cliente");
		System.out.println("4- Listar Contrato");
		System.out.println("5- Cadastrar Sinistro");
		System.out.println("6- Listar Sinistro");
		System.out.println("7- Listar Contratos sem Sinistro");
		System.out.println("8- Persistencia com Serializacao");
		System.out.println("0- Sair");

		System.out.println("Entre com uma opcão: ");
	}

	public int tipoCliente() {
		int option;
		option = 0;
		while (option != 1 && option != 2) {
			System.out.println("Pessoa fisica(1) ou Pessoa Juridica(2)");
			option = ler.nextInt();
			if (option == 1) {
				return option;
			} else {
				return option;
			}

		}
		return option;

	}

	public void main(String[] args) {

		int opcao = 0;
		Scanner ler = new Scanner(System.in);
		while (opcao != 0) {
			imprimeMenu();
			opcao = ler.nextInt();

			if (opcao == 1) {
				int option;
				tipoCliente();// Determina se é pessoa fisica ou juridica
				if (opcao == 1) {
					// cadastroFisica
				} else {
					// cadastroJURIDICA
				}
			}
			if (opcao == 2) {
				
			}
			if (opcao == 3) {
				
			}
			if (opcao == 4) {
				
			}
			if (opcao == 5) {
			
			}
			if (opcao == 6) {
			
			}
			if (opcao == 7) {

			}
			if (opcao == 8) {

			}
			if (opcao < 0 || opcao > 8) {
				System.out.println("Erro, favor escolher opcao valida");
			} else {
				break;
			}
			System.out.println("Cadestre seu nome");
			nome = ler.nextLine();
		}

	}

}