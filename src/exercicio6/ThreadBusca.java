package exercicio6;

public class ThreadBusca implements Runnable {

	private int inicio;
	private int fim;
	private int valorBusca;
	private Lista lista;

	public ThreadBusca(int inicio, int fim, int valorBusca, Lista lista) {
		this.inicio = inicio;
		this.fim = fim;
		this.valorBusca = valorBusca;
		this.lista = lista;
	}

	@Override
	public void run() {
		lista.procura(inicio, fim, valorBusca);
	}

}
