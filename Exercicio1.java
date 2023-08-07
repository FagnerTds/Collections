package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList<String>();
		int alt;
		System.out.println("Deseja digitar uma cor 1 para sim 2 para nao");
		alt=sc.nextInt();
		
		while(alt==1){
			sc.nextLine();
			System.out.println("Digite a cor ");
			String cor=sc.nextLine();
			cores.add(cor);
			
			System.out.println("Deseja digitar outra cor? 1 para sim 2 para nao");
			alt=sc.nextInt();
		}	
		System.out.println("Lista de cores: "+ cores);
		Collections.sort(cores);
		System.out.println("Oredenar as cores");
		System.out.println(cores);

		
		
		
		sc.close();
	}

}
