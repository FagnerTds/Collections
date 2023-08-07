package Collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		Set<Integer> legal = new HashSet<Integer>();
		
		
		
		legal.add(2);
		legal.add(5);
		legal.add(1);
		legal.add(3);
		legal.add(4);
		legal.add(9);
		legal.add(7);
		legal.add(8);
		legal.add(10);
		legal.add(6);
		
		System.out.println("Digite o numero que deseja encontrar");
		int num= sc.nextInt();
		
		for(Integer apelido:legal) {
			if(legal.contains(num)) {
				System.out.println("O numero "+ num+" foi encontrado ");
				break;
				
			}else System.out.println("o numero "+num+" não foi encontrado");
			break;
		}


	
		
		
		
		
		sc.close();
	}

}
