package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		List<Integer> num = new ArrayList<Integer>();
		num.add(2);
		num.add(5);
		num.add(1);
		num.add(3);
		num.add(4);
		num.add(9);
		num.add(7);
		num.add(8);
		num.add(10);
		num.add(6);
		
		System.out.println("Digite o numero que deseja encontrar");
		int encontrar= sc.nextInt();
		if(num.contains(encontrar))
		System.out.println("o número "+ encontrar+" Está localizado na posição "+ num.indexOf(encontrar));
		
		else System.out.println("O número "+encontrar+" não foi encontrado");
		
		sc.close();
		
	}

}
