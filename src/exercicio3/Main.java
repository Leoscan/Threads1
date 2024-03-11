package exercicio3;

public class Main {
	public static void main(String[] args) {
		
		Semaforo semaforo = new Semaforo();

		Thread s1 = new Thread(new ThreadSemaforo1(semaforo), "Semaforo 1");
		Thread s2 = new Thread(new ThreadSemaforo2(semaforo), "Semaforo 2");
		Thread s3 = new Thread(new ThreadSemaforo3(semaforo), "Semaforo 3");
		Thread s4 = new Thread(new ThreadSemaforo4(semaforo), "Semaforo 4");
		
		s1.start();
		s2.start();
		s3.start();
		s4.start();
	}
}
