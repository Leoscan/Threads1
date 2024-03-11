package exercicio3;

public class Semaforo {
	int atual = 1;
	
	synchronized void Semaforo1() {
		String nome = Thread.currentThread().getName();
		
	    if (atual != 1) {	    	
	    	try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	    }
	    	
	    System.out.println(nome + " Verde!");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(nome + " Vermelho!");

		atual = 2;
		this.notifyAll();
	}
	
	synchronized void Semaforo2() {
		String nome = Thread.currentThread().getName();
		
	    if (atual != 2) {	    	
	    	try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	    }
	    	
	    System.out.println(nome + " Verde!");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(nome + " Vermelho!");

	    
		atual = 3;
		this.notifyAll();
	}
	
	synchronized void Semaforo3() {
		String nome = Thread.currentThread().getName();
		
	    if (atual != 3) {	    	
	    	try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	    }
	    	
	    System.out.println(nome + " Verde!");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(nome + " Vermelho!");

		
		atual = 4;
		this.notifyAll();
	}
	
	synchronized void Semaforo4() {
		String nome = Thread.currentThread().getName();
		
	    if (atual != 4) {	    	
	    	try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	    }
	    	
	    System.out.println(nome + " Verde!");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(nome + " Vermelho!");

		
		atual = 1;
		this.notifyAll();
	}
}