package controller;

public class ThreadMatriz extends Thread{
	
	int vetor[];
	int linha;
	
	public ThreadMatriz(int linha, int vetor[]){
		this.vetor = vetor;
		this.linha = linha;
	}
	@Override
	public void run() {
		calcL();
	}
	
	private void calcL(){
		int soma = 0;
		for(int i:vetor){
			soma = soma + i;
		}
		System.out.println("A soma de todos os elementos da linha "+(linha+1)+": "+soma);
	}
}
