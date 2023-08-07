package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteColections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList<String>();
		
		int op;
		
		do {
			System.out.println("\n\t\tMenu de opções");
			System.out.println("\n----------------------------------------------------");
			System.out.println("\n(1) Deseja adicionar produtos ao estoque?");
			System.out.println("\n(2) Deseja remover produtos do estoque?");
			System.out.println("\n(3) Deseja atualizar produtos do estoque?");
			System.out.println("\n(4) Deseja mostrar todos os produtos do estoque?");
			System.out.println("\n(0) Deseja encerrar o programa?");
			System.out.println("\n----------------------------------------------------");
			System.out.println("\nDigite a sua opção: ");
			op =sc.nextInt();
			
			switch(op) {
			case 1: 
				sc.nextLine();
				System.out.println("Digite o produto para adicionar ao estoque: ");
				String produto =sc.nextLine();
				estoque.add(produto);
				break;
			case 2:
				sc.nextLine();
				System.out.println("Digite o produto que deseja remover: ");
				String remover= sc.nextLine();
				if(estoque.contains(remover)) {
				estoque.remove(remover);
				}else {
					System.out.println("Não existe isso nesta lista");
				}break;
			case 3:
				sc.nextLine();
				System.out.println("Digite o nome do produto que deseja substituir");
				String verifica=sc.nextLine();
				System.out.println("Digite o nome do novo produto");
				String novo=sc.nextLine();
				if(estoque.contains(verifica)) {
					estoque.remove(verifica);
					estoque.add(novo);
				}else System.out.println("Produto não existente");
				break;
			case 4:
				sc.nextLine();
				System.out.println("Os produtos do nosso estoque são:");
				System.out.println(estoque);
				break;
			case 0:
				System.out.println("Obrigado por utilizar o nosso programa");
				break;
				
				default:
					System.out.println("Digite novamente");
			}
			
		}while(op!=0);
		
		sc.close();
	}

}
