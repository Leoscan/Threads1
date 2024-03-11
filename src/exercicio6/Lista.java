package exercicio6;
import java.util.Random;

public class Lista {
	boolean encontrou = false;
	private int[] vetor = new int[100];
	private int indice;
	
	public Lista() {
		popula();
	}

	public void popula() {
        Random rand = new Random();

		for (int i = 0; i < 100; i++) {			
			this.vetor[indice] = rand.nextInt(100); 
			indice++;
		}
	}
	
	public synchronized void procura(int min, int max, int val) {
		if(encontrou)
			return; //kill
		
		for (int i = min; i < max; i++) {
			if (this.vetor[i] == val) {
				System.out.println("Encontrado na posição: " + i);
				encontrou = true;
			}
		}
	}
	
    
}
