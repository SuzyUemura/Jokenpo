package br.com.gft.jokenpo.resultado;

public abstract class ApuracaoResultado {
	 
	private ApuracaoResultado proximo;
	
	public ApuracaoResultado(ApuracaoResultado proximo) {
		this.proximo = proximo;
	}
	
	public int resultado(int resultadoAdversario, int resultadoJogador) {
		int resultado = resultadoAdversario;
		
		if(resultado == -1) {
			return proximo.resultado(resultadoAdversario, resultadoJogador);
		}
		return resultado;
	}
	
	
}
