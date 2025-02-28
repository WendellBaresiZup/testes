package br.com.zup.calculadora;

import br.com.zup.calculadora.services.CalculadoraService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculadoraApplicationTests {
	private CalculadoraService calculadoraService = new CalculadoraService();

	@Test
	void contextLoads() {
	}

	@Test
	public void adicaoTest(){
		assertEquals(5, calculadoraService.adicao(2,3));
	}

	@Test
	public void subtracaoTest(){
		assertEquals(3,calculadoraService.subtracao(4,1));
	}

	@Test
	public void multiplicacaoTest(){
		assertEquals(10, calculadoraService.multiplicacao(2,5));
	}

	@Test
	public void divisaoTest(){
		assertEquals(5, calculadoraService.divisao(10,2));
	}

}
