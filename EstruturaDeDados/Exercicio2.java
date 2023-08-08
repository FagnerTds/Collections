package EstruturaDeDados;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		Stack<String>pilha = new Stack<String>();
		
		do {
			System.out.println("*****************************************");
			System.out.println("                                         ");
			System.out.println("     1: Adicionar um Livro na Pilha.     ");
			System.out.println("     2: Listar os livros da piha.        ");
			System.out.println("     3: Retirar livro da pilha.          ");
			System.out.println("                                         ");
			System.out.println("*****************************************");
			System.out.println("Digite a opção desejada");
			num=sc.nextInt();
			Iterator<String>ipilha=pilha.iterator();
			
			switch(num) {
			case 1:
				System.out.println("digite o nome do livro: ");
				sc.nextLine();
				String nome=sc.nextLine();
				pilha.add(nome);
				System.out.println("Livro adicionado");
				break;
			case 2:
				if(pilha.isEmpty()==false) {
					System.out.println("Livros da Pilha: ");
					while(ipilha.hasNext()) {
						System.out.println(ipilha.next());
					}	
				}else System.out.println("A pilha está vazia");
				break;
			case 3:
				if(pilha.isEmpty()==false) {
					pilha.pop();
					System.out.println("Livro retirado");
				}else System.out.println("A Pilha está vazia");
				break;
			case 0:
				System.out.println("Programa finalizado");
				break;
				default:
					System.out.println("Não existe esta opção tente novamente");	
			}
		}while(num!=0);
		
		
		
		
		sc.close();

	}

}
