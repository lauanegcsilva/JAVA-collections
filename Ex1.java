package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
				
			ArrayList<String> cores = new ArrayList<>();
				
			for(int i=0; i<5; i++) {
				System.out.println("\nDigite as cores: ");
				cores.add(ler.nextLine());
			}
				
			System.out.println("\nLista de cores: ");
			for(String cor:cores) {
				System.out.println(cor);
			}
			
			Collections.sort(cores);
			
			System.out.println("\nCores ordenadas: ");
			for(String cor:cores) {
				System.out.println(cor);
			}
			
			
			ler.close();
		}
}
