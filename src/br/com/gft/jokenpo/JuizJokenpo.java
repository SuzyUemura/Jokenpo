package br.com.gft.jokenpo;

import java.util.Random;
import java.util.Scanner;

import br.com.gft.jokenpo.resultado.ApuracaoResultado;

public class JuizJokenpo {
	
	private int jogador;
	private int adversario;
	
	private ApuracaoResultado apuracao;
	
	public JuizJokenpo() {
		
	}
	
	public JuizJokenpo(ApuracaoResultado apuracao) {
		this.apuracao = apuracao;
	}

	Random sorteio = new Random(2);
	Scanner ler = new Scanner(System.in);

	public void partida() {
		System.out.println(" JO-KEN-PO ");
		System.out.println("Escolha: 0- Papel, 1- Pedra, 2-Tesoura");
		
		int resultadoAdversario = escolhaAdversario();
		int resultadoJogador = escolhaJogador();
		apuracao.resultado(resultadoAdversario, resultadoJogador);
		
		System.out.println("Obrigado por Jogar!");
	}
	
	public int escolhaJogador(){
		jogador = ler.nextInt();
		while(jogador < 0 || jogador > 2) {
			System.out.println("Sua escolha deve ser: 0 - Papel, 1- Pedra ou 2- Tesoura");
			jogador = ler.nextInt();
		}
		return jogador;
	}
	
	public int escolhaAdversario(){
		return adversario = sorteio.nextInt(2);
	}

	public int getJogador() {
		return jogador;
	}

	public void setJogador(int jogador) {
		this.jogador = jogador;
	}
	public int getAdversario() {
		return adversario;
	}

	public void setAdversario(int adversario) {
		this.adversario = adversario;
	}
}
