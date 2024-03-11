package exercicio3;

public class ThreadSemaforo2 implements Runnable {	
		private Semaforo semaforo;


	    public ThreadSemaforo2(Semaforo semaforo) {
			this.semaforo = semaforo;
		}


		@Override
	    public void run() {
			while (true) 
	            semaforo.Semaforo2();
	    }
}