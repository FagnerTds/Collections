package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		Set<Integer> num= new HashSet<Integer>();
		
		System.out.println("Digite os numeros: ");
		
		for(int i=0; i<10; i++) {
			int novo=sc.nextInt();
			num.add(novo);
			
		}
		Iterator<Integer> iNum = num.iterator();
		
		System.out.println("Listar dados do set:");
		while(iNum.hasNext())
		System.out.println(iNum.next());
		
		
		sc.close();
	}

}
