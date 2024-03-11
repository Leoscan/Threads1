package exercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Defina o número de corredores: ");
		int corredores = entrada.nextInt();
		
		System.out.println("Iniciando corrida de 1000 metros com " + corredores + " corredores:");
		
		for(int i = 1; i <= corredores; i++)
		new Thread(new ThreadCorrida ("Corredor " + i)).start();
	}

}
