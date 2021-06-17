package br.com.gft.jokenpo.resultado;

public class ApuracaoTesoura extends ApuracaoResultado {
	
	public ApuracaoTesoura(ApuracaoResultado proximo) {
		super(proximo);
	}
	
	@Override
	public int resultado(int resultadoAdversario, int resultadoJogador) {
		if(resultadoAdversario == 2 && resultadoJogador == 2) {
			System.out.println("Resultado: EMPATE!");
		} else if(resultadoAdversario == 2 && resultadoJogador == 1) {
			System.out.println("Resultado: Você PERDEU!");
		} else if(resultadoAdversario == 2 && resultadoJogador == 0) {
			System.out.println("Resultado: Você GANHOU!");
		} 
		return 0;
	}
}
