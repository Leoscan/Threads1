package exercicio3;

public class ThreadSemaforo3 implements Runnable {	
		private Semaforo semaforo;


	    public ThreadSemaforo3(Semaforo semaforo) {
			this.semaforo = semaforo;
		}


		@Override
	    public void run() {
			while (true) 
	            semaforo.Semaforo3();
	    }
}