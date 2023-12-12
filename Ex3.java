package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
				
		Set<Integer> numeros = new HashSet<>();
				
			for(int i=0; i<10; i++) {
				System.out.println("\nDigite os números: ");
				numeros.add(ler.nextInt());
			}
				
			System.out.println("\n\nListar todos os números com o Iterator");

			Iterator<Integer> inumeros = numeros.iterator();
			
			while(inumeros.hasNext()) {
				System.out.println(inumeros.next());
			}
			
			ler.close();
		}
}
