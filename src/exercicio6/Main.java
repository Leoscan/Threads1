package exercicio6;

public class Main {

	public static void main(String[] args) {
        
        int n = 10;
        int intervalo = 10;
        int valorBusca = 25;
        
        Lista l1 = new Lista(); 
        

        for (int i = 1; i < n; i++) {
        	int inicio = i * intervalo + 1;
            int fim = (i + 1) * intervalo;
        	Thread t1 = new Thread(new ThreadBusca(inicio, fim, valorBusca, l1));
        	t1.start();
        }
	}
}
