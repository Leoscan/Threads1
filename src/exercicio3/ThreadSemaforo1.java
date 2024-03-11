package exercicio3;

public class ThreadSemaforo1 implements Runnable {	
		private Semaforo semaforo;


	    public ThreadSemaforo1(Semaforo semaforo) {
			this.semaforo = semaforo;
		}


		@Override
	    public void run() {
			while (true) {
	            semaforo.Semaforo1();
			}
	    }
}