package EstruturaDeDados;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num;
		Queue<String>fila = new LinkedList<String>();
		
		do {
			System.out.println("*****************************************");
			System.out.println("                                         ");
			System.out.println("     1: Adicionar um Cliente na fila.    ");
			System.out.println("     2: Listar os Clientes na fila       ");
			System.out.println("     3: Retirar Clientes da fila         ");
			System.out.println("                                         ");
			System.out.println("*****************************************");
			System.out.println("Digite a opção desejada");
			num=sc.nextInt();
			Iterator<String>ifila=fila.iterator();
			
			switch(num) {
			case 1:
				System.out.println("digite o nome: ");
				sc.nextLine();
				String nome=sc.nextLine();
				fila.add(nome);
				System.out.println("Cliente adicionado");
				break;
			case 2:
				if(fila.isEmpty()==false) {
					System.out.println("Clientes da fila: ");
					while(ifila.hasNext()) {
						System.out.println(ifila.next());
					}	
				}else System.out.println("A fila está vazia");
				break;
			case 3:
				if(fila.isEmpty()==false) {
					fila.poll();
					System.out.println("Cliente chamado");
				}else System.out.println("A fila está vazia");
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
