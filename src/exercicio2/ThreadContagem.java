package exercicio2;

public class ThreadContagem extends Thread {
	private String nome;
	private int valTotal;
	static int contador = 0;
	
	public ThreadContagem(String _nome, int _valTotal) {
		this.nome = _nome;
		this.valTotal = _valTotal;
	}
	
	public void run() {
		do{
			 contador++;
			 System.out.println (nome + ": " + contador + " | ");
			 Thread.yield ();
		} while (contador < valTotal);
	}
}
