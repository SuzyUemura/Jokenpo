package br.com.gft.jokenpo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.gft.jokenpo.resultado.ApuracaoPapel;
import br.com.gft.jokenpo.resultado.ApuracaoPedra;
import br.com.gft.jokenpo.resultado.ApuracaoResultado;
import br.com.gft.jokenpo.resultado.ApuracaoTesoura;

public class JuizJokenpoTest {
	
	private JuizJokenpo jokenpo;
	
	
	@Before
	public void setup() {
		ApuracaoResultado apuracao =
				new ApuracaoPedra(
					new ApuracaoPapel(
						new ApuracaoTesoura(null)));
		
		jokenpo = new JuizJokenpo(apuracao);
	}

	@Test
	public void partidaEscolhaJogadorValidada() throws Exception {
		jokenpo.partida();
		assertNotNull(jokenpo.escolhaAdversario());
		System.out.println("==========================================");
	}
	
	@Test
	public void jogadorEscolhePedra() throws Exception {
		assertSame(1, jokenpo.escolhaJogador());
		System.out.println("==========================================");
	}
	
	@Test
	public void jogadorEscolhePapel() throws Exception {
		assertSame(0, jokenpo.escolhaJogador());
		System.out.println("==========================================");
	}
	
	@Test
	public void jogadorEscolheTesoura() throws Exception {
		assertSame(2, jokenpo.escolhaJogador());
		System.out.println("==========================================");
	}
}
