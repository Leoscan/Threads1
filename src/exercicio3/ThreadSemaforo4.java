package exercicio3;

public class ThreadSemaforo4 implements Runnable {	
		private Semaforo semaforo;


	    public ThreadSemaforo4(Semaforo semaforo) {
			this.semaforo = semaforo;
		}


		@Override
	    public void run() {
			while (true) 
	            semaforo.Semaforo4();
	    }
}