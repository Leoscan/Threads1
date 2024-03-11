package exercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int total;
		
		do {
			System.out.print("Insira um valor maior que 5000: ");
			total = entrada.nextInt();
		} while (total < 5000);
		
		System.out.print("Defina um número de Threads: ");
		int threads = entrada.nextInt();
		
		for(int i = 1; i <= threads; i++) {
			ThreadContagem th = new ThreadContagem("T"+i, total);
			th.start();
		}
	}
}
