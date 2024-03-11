package exercicio1;

public class ThreadCorrida implements Runnable {
	private String nomeCorredor;
	private int totalCorrido;
	
	public ThreadCorrida(String _nomeCorredor) {
		this.nomeCorredor = _nomeCorredor;
	}
		
	public void run() {
		do {
			totalCorrido += getRandomNumber(0, 30);
			System.out.println(nomeCorredor + " andou " + totalCorrido + " metros");
			Thread.yield ();
			
			try {
				Thread.sleep(totalCorrido);
			} catch (Exception e) {
				System.out.println(e);
			}
		} while (totalCorrido < 1000);
		
		System.out.println(nomeCorredor + " Finalizou a corrida");
	}

	public int getRandomNumber(int min, int max) {
	    return (int) ((Math.random() * (max - min)) + min);
	}
}